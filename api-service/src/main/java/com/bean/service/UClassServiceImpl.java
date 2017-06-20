package com.bean.service;

import com.bean.dao.UClassMapper;
import com.bean.model.UClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.util.List;
import java.util.Map;


@Service("uClassService")
public class UClassServiceImpl implements UClassService {

    @Autowired
    private UClassMapper uClassMapper;

    private MyLogger LOGGER = new MyLogger(UClassServiceImpl.class);


    @Override
    public int insertUClass(UClass uClass) {
        return uClassMapper.insert(uClass);
    }

    @Override
    public boolean updateUClass(UClass uClass) {
        return uClassMapper.update(uClass);
    }

    @Override
    public UClass getUClassByInfo(Map<String, String> map) {
        return uClassMapper.getUClassByInfo(map);
    }

    @Override
    public List<UClass> getUClassListByInfo(Map<String, String> map) {
        return uClassMapper.getUClassListByInfo(map);
    }

    @Override
    public Integer getUClassCountByInfo(Map<String, String> map) {
        return uClassMapper.getUClassCountByInfo(map);
    }
}
