package com.smart.domain.component.writer;

import com.smart.domain.component.model.Title;
import com.smart.enhance.platfarm.exception.CommException;

import java.util.List;

/**
 * Created by Administrator on 2016/4/16.
 */
public interface TitlesBuilder {
    public List<Title> buildTitles( String itemName ) throws CommException;
}
