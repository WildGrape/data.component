package com.smart.domain.component.writer;

import com.smart.enhance.platfarm.exception.CommException;

import java.util.List;

/**
 * Created by Administrator on 2016/4/16.
 */
public interface DatasBuilder {
    public <T> List<List<String>> buildDatas( List<T> datas ) throws CommException;
}
