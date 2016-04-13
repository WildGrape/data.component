package com.smart.domain.component.model;

/**
 * Created by Administrator on 2016/4/16.
 */
public class Title {
    private String content = "";
    private String comment = "";
    private String attr = "";

    public Title( String content, String comment, String attr ) {
        this.content = content;
        this.comment = comment;
        this.attr = attr;
    }

    public String getContent() {
        return content;
    }

    public String getComment() {
        return comment;
    }

    public String getAttr() {
        return attr;
    }
}
