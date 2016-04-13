package com.smart.domain.component.writer;

import com.smart.enhance.platfarm.exception.CommException;

import java.util.List;

/**
 * Created by Administrator on 2016/4/16.
 */
public interface DatasWriter {
    public void writeDatas(String outFile, List<List<String>> datas, List<String> title ) throws CommException;
}
