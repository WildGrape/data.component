package com.smart.domain.component.writer.api;

import com.smart.enhance.platfarm.exception.CommException;

import java.util.List;

/**
 * Created by Administrator on 2016/4/16.
 */
public interface DataValueTransfer {
    public List<String> transfer (Object val) throws CommException;
}
