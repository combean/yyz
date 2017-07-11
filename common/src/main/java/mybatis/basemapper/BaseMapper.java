package mybatis.basemapper;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface BaseMapper<T> {
    int insert(T t) throws SQLException;

    int update(T t) throws SQLException;

    int deleteById(int id) throws SQLException;

    int updateByMap(Map<String, Object> map) throws SQLException;

    int getCountByMap(Map<String, Object> map) throws SQLException;

    int insertList(List<T> t) throws SQLException;

    T getById(int id) throws SQLException;

    T getByMap(Map<String, Object> map) throws SQLException;

    T getByParameter(String str) throws SQLException;

    T getByObj(T t) throws SQLException;

    List<T> getListByMap(Map<String, Object> map) throws SQLException;
}