package com.bean.model;

import javax.validation.constraints.Pattern;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 会员实体
 * 
 * @author NINGPAI-zhangqiang
 * @since 2013年12月16日 下午4:47:01
 * @version 0.0.1
 */
public class Customer implements Serializable {
    /**
     * 序列化
     */
    private static final long serialVersionUID = 7118154901337020515L;
    /**
     * 会员编号
     * 
     * @see #getCustomerId()
     * @see Customer#setCustomerId(Long)
     */
    private Long customerId;
    /**
     * 用户名
     * 
     * @see #getCustomerUsername()
     * @see #setCustomerUsername(String)
     */
    @Pattern(regexp = "[0-9A-Za-z][a-zA-Z0-9\\._-]{1,}@[a-zA-Z0-9-]{1,}[a-zA-Z0-9]\\.[a-zA-Z\\.]{1,}[A-Za-z]|(0?(13|15|17|18|14)[0-9]{9})|(\\w+[^\\<\\>]*)|()")
    private String customerUsername;
    /**
     * 会员密码
     * 
     * @see #getCustomerPassword()
     * @see #setCustomerPassword(String)
     */
    @Pattern(regexp = "[^\\<\\>]*")
    private String customerPassword;
    /**
     * 会员昵称
     * 
     * @see #getCustomerNickname()
     * @see #setCustomerNickname(String)
     */
    @Pattern(regexp = "[^\\<\\>]*")
    private String customerNickname;
    /**
     * 手机是否验证
     * 
     * @see #getIsMobile()
     * @see #setIsMobile(String)
     */
    private String isMobile;
    /**
     * 邮箱是否验证
     * 
     * @see #getIsEmail()
     * @see #setIsEmail(String)
     */
    private String isEmail;
    /**
     * 账户状态
     * 
     * @see #getIsFlag()
     * @see #setIsFlag(String)
     */
    private String isFlag;
    /**
     * 登陆IP
     * 
     * @see #getLoginIp()
     * @see #setLoginIp(String)
     */
    private String loginIp;
    /**
     * 登陆时间
     * 
     * @see #getLoginTime()
     * @see #setLoginTime(Date)
     */
    private Date loginTime;
    /**
     * 创建时间
     * 
     * @see #getCreateTime()
     * @see #setCreateTime(Date)
     */
    private Date createTime;
    /**
     * 修改时间
     * 
     * @see #getModifiedTime()
     * @see #setModifiedTime(Date)
     */
    private Date modifiedTime;
    /**
     * 删除标记
     * 
     * @see #getDelFlag()
     * @see #setDelFlag(String)
     */
    private String delFlag;
    /**
     * 删除时间
     * 
     * @see #getDelTime()
     * @see #setDelTime(Date)
     */
    private Date delTime;
    /**
     * 会员头像
     * 
     * @see #getCustomerImg()
     * @see #setCustomerImg(String)
     */
    @Pattern(regexp = "([_A-Za-z0-9:\\/\\.]+)|()")
    private String customerImg;
    /**
     * 手机验证码
     * 
     * @see #getCaptcha()
     * @see #setCaptcha(String)
     */
    private String captcha;
    /**
     * 验证码失效时间
     * 
     * @see #getAeadTime()
     * @see #setAeadTime(Date)
     */
    private Date aeadTime;
    /**
     * 第三方编号
     * 
     * @see #getThirdId()
     * @see #setThirdId(Long)
     */
    private Long thirdId;
    /**
     * 商家标记 0普通会员 1商家 2店铺员工
     * 
     * @see #getIsSeller()
     * @see #setIsSeller(String)
     */
    private String isSeller;

    /**
     * 邮件验证码
     * 
     * @see #getCaptcha()
     * @see #setCaptcha(String)
     */
    private String pwdCaptcha;
    /**
     * 邮件验证码失效时间
     * 
     * @see #getAeadTime()
     * @see #setAeadTime(Date)
     */
    private Date pwdAeadTime;

    /**
     * 是否临时会员
     * 
     * @see #getIsTempCust()
     * @see #setIsTempCust(String)
     */
    private String isTempCust;
  
    /**
     * 推广的链接是否被注册过'0'，'1'
     */
    private Long isShare;
    
    //是否是前端管理员  '0' 不是,'1' 是
    private String isSiteManager;

    public Long getIsShare() {
        return isShare;
    }

    public void setIsShare(Long isShare) {
        this.isShare = isShare;
    }


    /**
     * 登录Key
     * 
     * @see #getLoginKey()
     * @see #setLoginKey(String)
     */
    private String loginKey;
    //会员订单数
    private Long orderNumber;
    //会员总订单额
    private BigDecimal orderMoney;
  //订单开始时间，查询使用
    private String startTime;
    //订单结束时间，查询使用
    private String endTime;
    
    //会员等级名称
    private String pointLevelName;
    
    //每个等级的会员人数
    private Long levelCount;
    
    //每个等级的会员占比
    private BigDecimal levelRate;
    
    //会员的订单总数
    private Long countOrder;
    
    //交易总额
    private BigDecimal sumPrice;
    
    //最后交易成功时间
    private Date maxtime;
    
    public Long getCountOrder() {
        return countOrder;
    }

    public void setCountOrder(Long countOrder) {
        this.countOrder = countOrder;
    }

    public BigDecimal getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(BigDecimal sumPrice) {
        this.sumPrice = sumPrice;
    }

    public Date getMaxtime() {
        return maxtime;
    }

    public void setMaxtime(Date maxtime) {
        this.maxtime = maxtime;
    }

    public String getPointLevelName() {
        return pointLevelName;
    }

    public void setPointLevelName(String pointLevelName) {
        this.pointLevelName = pointLevelName;
    }

    public Long getLevelCount() {
        return levelCount;
    }

    public void setLevelCount(Long levelCount) {
        this.levelCount = levelCount;
    }

    public BigDecimal getLevelRate() {
        return levelRate;
    }

    public void setLevelRate(BigDecimal levelRate) {
        this.levelRate = levelRate;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public BigDecimal getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(BigDecimal orderMoney) {
        this.orderMoney = orderMoney;
    }

    public String getLoginKey() {
        return loginKey;
    }

    public void setLoginKey(String loginKey) {
        this.loginKey = loginKey;
    }

    public String getIsTempCust() {
        return isTempCust;
    }

    public void setIsTempCust(String isTempCust) {
        this.isTempCust = isTempCust;
    }

    public String getPwdCaptcha() {
        return pwdCaptcha;
    }

    public void setPwdCaptcha(String pwdCaptcha) {
        this.pwdCaptcha = pwdCaptcha;
    }

    public Date getPwdAeadTime() {
        if (this.pwdAeadTime != null) {
            return new Date(this.pwdAeadTime.getTime());
        } else {
            return null;
        }
    }

    public void setPwdAeadTime(Date pwdAeadTime) {
        if (pwdAeadTime != null) {
            Date tEmp = (Date) pwdAeadTime.clone();
            if (tEmp != null) {
                this.pwdAeadTime = tEmp;
            }
        }
    }

    public String getIsSeller() {
        return isSeller;
    }

    public void setIsSeller(String isSeller) {
        this.isSeller = isSeller;
    }

    public Long getThirdId() {
        return thirdId;
    }

    public void setThirdId(Long thirdId) {
        this.thirdId = thirdId;
    }

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    public String getCustomerImg() {
        return customerImg;
    }

    public void setCustomerImg(String customerImg) {
        this.customerImg = customerImg;
    }

    /**
     * 获取CustomerId的值
     * 
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * 设置CustomerId的值
     * 
     */
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    /**
     * 设置customerUsername的值
     * 
     */
    public String getCustomerUsername() {
        return customerUsername;
    }

    /**
     * 获取customerUsername的值
     * 
     * @param customerUsername
     */
    public void setCustomerUsername(String customerUsername) {
        this.customerUsername = customerUsername;
    }

    /**
     * 获取customerPassword的值
     * 
     */
    public String getCustomerPassword() {
        return customerPassword;
    }

    /**
     * 设置customerPassword的值
     * 
     */
    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }

    /**
     * 获取customerNickname的值
     * 
     */
    public String getCustomerNickname() {
        return customerNickname;
    }

    /**
     * 设置customerNickname的值
     * 
     */
    public void setCustomerNickname(String customerNickname) {
        this.customerNickname = customerNickname;
    }

    /**
     * 获取isMobile的值
     * 
     */
    public String getIsMobile() {
        return isMobile;
    }

    /**
     * 设置isMobile的值
     * 
     */
    public void setIsMobile(String isMobile) {
        this.isMobile = isMobile;
    }

    /**
     * 获取isEmail的值
     * 
     */
    public String getIsEmail() {
        return isEmail;
    }

    /**
     * 设置isEmail的值
     * 
     */
    public void setIsEmail(String isEmail) {
        this.isEmail = isEmail;
    }

    /**
     * 获取isFlag的值
     * 
     */
    public String getIsFlag() {
        return isFlag;
    }

    /**
     * 设置isFlag的值
     * 
     */
    public void setIsFlag(String isFlag) {
        this.isFlag = isFlag;
    }

    /**
     * 获取loginIp的值
     * 
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * 设置loginIp的值
     * 
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    /**
     * 获取delFlag的值
     * 
     */
    public String getDelFlag() {
        return delFlag;
    }

    /**
     * 设置delFlag的值
     * 
     */
    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * 获取loginTime的值
     * 
     */
    public Date getLoginTime() {
        if (this.loginTime != null) {
            return new Date(this.loginTime.getTime());
        } else {
            return null;
        }
    }

    /**
     * 设置loginTime的值
     * 
     */
    public void setLoginTime(Date loginTime) {
        if (loginTime != null) {
            Date tEmp = (Date) loginTime.clone();
            if (tEmp != null) {
                this.loginTime = tEmp;
            }
        }
    }

    /**
     * 获取createTime的值
     * 
     */
    public Date getCreateTime() {
        if (this.createTime != null) {
            return new Date(this.createTime.getTime());
        } else {
            return null;
        }
    }

    /**
     * 设置createTime的值
     * 
     */
    public void setCreateTime(Date createTime) {
        if (createTime != null) {
            Date tEmp = (Date) createTime.clone();
            if (tEmp != null) {
                this.createTime = tEmp;
            }
        }
    }

    /**
     * 获取modifiedTime的值
     * 
     */
    public Date getModifiedTime() {
        if (this.modifiedTime != null) {
            return new Date(this.modifiedTime.getTime());
        } else {
            return null;
        }
    }

    /**
     * 设置modifiedTime的值
     * 
     */
    public void setModifiedTime(Date modifiedTime) {
        if (modifiedTime != null) {
            Date tEmp = (Date) modifiedTime.clone();
            if (tEmp != null) {
                this.modifiedTime = tEmp;
            }
        }
    }

    /**
     * 获取delTime的值
     * 
     */
    public Date getDelTime() {
        if (this.delTime != null) {
            return new Date(this.delTime.getTime());
        } else {
            return null;
        }
    }

    /**
     * 设置delTime的值
     * 
     */
    public void setDelTime(Date delTime) {
        if (delTime != null) {
            Date tEmp = (Date) delTime.clone();
            if (tEmp != null) {
                this.delTime = tEmp;
            }
        }
    }

    public Date getAeadTime() {
        if (this.aeadTime != null) {
            return new Date(this.aeadTime.getTime());
        } else {
            return null;
        }
    }

    public void setAeadTime(Date aeadTime) {
        if (aeadTime != null) {
            Date tEmp = (Date) aeadTime.clone();
            if (tEmp != null) {
                this.aeadTime = tEmp;
            }
        }
    }

    public String getIsSiteManager() {
        return isSiteManager;
    }

    public void setIsSiteManager(String isSiteManager) {
        this.isSiteManager = isSiteManager;
    }

    
}
