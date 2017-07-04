package com.bean.model;

import java.util.List;
import java.util.Map;

/**
 * Created by PVer on 2017/7/4.
 */
public class ResultJson {
    private int state;

    private Map<String, Object> errorMap;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Map<String, Object> getErrorMap() {
        return errorMap;
    }

    public void setErrorMap(Map<String, Object> errorMap) {
        this.errorMap = errorMap;
    }
}
