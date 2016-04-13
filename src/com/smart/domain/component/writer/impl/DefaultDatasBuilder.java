package com.smart.domain.component.writer.impl;

import com.smart.domain.component.writer.DatasBuilder;
import com.smart.enhance.platfarm.exception.CommException;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/4/16.
 */
public class DefaultDatasBuilder implements DatasBuilder {

    @Override
    public <T> List<List<String>> buildDatas(List<T> datas) throws CommException {


        List<List<String>> resultDatas = new LinkedList<List<String>>();
        for (T data : datas) {
            List<String> resultData = buildData(data);
            resultDatas.add(resultData);
        }

        return resultDatas;
    }

    private <T> List<String> buildData( T data) {
        return null;
    }

    private <T> Map<Field,Object> getFieldValues(T data) {
        String itemName = data.getClass().getName();

        return  getFieldValues(data, itemName);

    }

    private <T> Map<Field,Object> getFieldValues(T data, String itemName) {
        Map<Field,Object> fieldValues = new LinkedHashMap<Field,Object>(   );

        return  fieldValues;

    }
}
