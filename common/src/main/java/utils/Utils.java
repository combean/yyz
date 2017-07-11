package utils;

import org.apache.commons.codec.binary.Base64;
import sun.misc.BASE64Encoder;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by bean on 2016/6/21.
 */
public class Utils {
    private static final MyLogger LOGGER = new MyLogger(Utils.class);
    public static final Charset utf8 = Charset.forName("utf-8");
    public static char[] getChars (byte[] bytes) {


	  int len = bytes.length;
	  char[] chars = new char[len];

	  for(int i=0;i<len;i++){
	  chars[i]= (char)(bytes[i] & 0xff);
	if(bytes[i]<0){
	  chars[i] = (char) (bytes[i]+256);
	  //chars[i]= (char)(bytes[i] & 0xff);
	}else{
	  chars[i] = (char)bytes[i];
	}
	  }
	  return chars;
    }

    /**
     * 向页面抛出IO流，打印数据
     *
     * @param o
     * @param response
     */
    public static void sos(String o, HttpServletResponse response) {
        response.setHeader("content-type", "text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter pw = null;
        try {
            pw = response.getWriter();
            pw.print(o);
            pw.flush();
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
//Print HTML


    }

    /**
     * Base64 加密String...
     *
     * @param Params
     * @return
     */
    public static String Bill(List<String> Params) {

        ByteBuffer byteBuffer = ByteBuffer.allocate(20480);
        for (String Param : Params) {
            byteBuffer.put(Param.getBytes(utf8));
        }

        byteBuffer.flip();
        String Pa = "";


        int l = byteBuffer.limit();
        for (int i = 0; i < l; i++) {
            Pa += byteBuffer.get(i) + ";";
        }
        LOGGER.info("Pa:" + Pa);
        byte[] byten = new byte[l];

        byteBuffer.get(byten, 0, l);
        byten[0] = -122;
        String o ;
        o = new BASE64Encoder().encode(byten).replaceAll("\r\n", "");
        LOGGER.info("返回字符串：" + o + ";byteBuffer:"+Pa);
        return o;
        //return "hgICCwZBQkMwMDESMjAxNjA3MDExNzM4NDhBMDAxAkEyBEEwMDEDNTAwAzUwMAExAzUwMBIyMDE2MDcwMTE3Mzg0OEFCMDkBMQE1DjIwMTYwNzA4MTM1MTQ0";
    }

    /**
     * 随机生成n位随机验证码
     * 方法说明
     * @param n 验证码位数
     * @return String
     * @Discription:扩展说明
     * @Author: bean
     * @Date: 2015年4月17日 下午7:19:02
     * @ModifyUser：feizi
     * @ModifyDate: 2015年4月17日 下午7:19:02
     */
    public static String createRandomVcode(int n) {
        //验证码
        String vcode = "";
        for (int i = 0; i < n; i++) {
            vcode = vcode + (int) (Math.random() * 9);
        }
        return vcode;
    }

    public static Map<String, Object> array2Map(String str) throws IOException {
        String retrunStr = "";
        String retrunDate = "";

//        Date date=new Date();
//        SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMddHHmmss");
//        String optTime= sdf.format(date);
//
//        String[] testStr={"134", "0x02", "0x01", "0x0a", optTime};
//
//        StringBuilder b=new StringBuilder();
//
//        for(String s:testStr) {
//            b.append(s);
//        }
//        byte[] a =b.toString().getBytes();
//
//        String a1=Base64.encodeBase64String(a);

        Map<String, Object> map = new HashMap<String, Object>();

        byte[] decodeStr = Base64.decodeBase64(str.getBytes());

        if ((decodeStr[1] == 2 && decodeStr[2] == 1 && decodeStr[3] == 2)
                || (decodeStr[1] == 2 && decodeStr[2] != 1)
//                || (decodeStr[1] == 2 && decodeStr[2] != 9)
                || decodeStr[1] != 2) {//所有有长度位的数据
            int bitNum = 0;
            int nextBitNum = 4;
            for (int i = 4; i < decodeStr.length; i++) {
                if (i == nextBitNum) {
                    bitNum = decodeStr[i] & 0xff;//长度位
                    nextBitNum = bitNum + i + 1;//下一个长度位
                    for (int j = i + 1; j <= i + bitNum; j++) {
                        retrunDate += (char) decodeStr[j];
                    }
                    retrunDate += ",";
                }
            }
            retrunDate = retrunDate.substring(0, retrunDate.length() - 1);
        } else {//无长度位数据
            for (int i = 4; i < decodeStr.length; i++) {
                retrunDate += (char) decodeStr[i];
            }
        }
        //标识字符
        for (int i = 0; i < 4; i++) {
            retrunStr += (decodeStr[i] & 0xff) + ",";
        }
        retrunStr = retrunStr.substring(0, retrunStr.length() - 1);
        map.put("type", retrunStr);
        map.put("data", retrunDate);
        return map;
    }

    /**
     * 获取MD5加密
     *
     * @param str 需要加密的字符串
     * @return String字符串 加密后的字符串
     */
    public static String MD5(String str) {
        try {
            // 创建加密对象
            MessageDigest digest = MessageDigest.getInstance("md5");

            // 调用加密对象的方法，加密的动作已经完成
            byte[] bs = digest.digest(str.getBytes());
            // 接下来，我们要对加密后的结果，进行优化，按照mysql的优化思路走
            // mysql的优化思路：
            // 第一步，将数据全部转换成正数：
            String hexString = "";
            for (byte b : bs) {
                // 第一步，将数据全部转换成正数：
                // 解释：为什么采用b&255
                /*
                 * b:它本来是一个byte类型的数据(1个字节) 255：是一个int类型的数据(4个字节)
                 * byte类型的数据与int类型的数据进行运算，会自动类型提升为int类型 eg: b: 1001 1100(原始数据)
                 * 运算时： b: 0000 0000 0000 0000 0000 0000 1001 1100 255: 0000
                 * 0000 0000 0000 0000 0000 1111 1111 结果：0000 0000 0000 0000
                 * 0000 0000 1001 1100 此时的temp是一个int类型的整数
                 */
                int temp = b & 255;
                // 第二步，将所有的数据转换成16进制的形式
                // 注意：转换的时候注意if正数>=0&&<16，那么如果使用Integer.toHexString()，可能会造成缺少位数
                // 因此，需要对temp进行判断
                if (temp < 16 && temp >= 0) {
                    // 手动补上一个“0”
                    hexString = hexString + "0" + Integer.toHexString(temp);
                } else {
                    hexString = hexString + Integer.toHexString(temp);
                }
            }
            return hexString;
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "";
    }

    /**
     * 全角转半角
     * @param input String.
     * @return 半角字符串
     */
    public static String ToDBC(String input) {


        char c[] = input.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '\u3000') {
                c[i] = ' ';
            } else if (c[i] > '\uFF00' && c[i] < '\uFF5F') {
                c[i] = (char) (c[i] - 65248);

            }
        }
        String returnString = new String(c);

        return returnString;
    }
}
