package com.small.tadpole.domain.pic;

/*
 * @Author xu.chenyang
 * @Email xu.chenyang24@gmail.com
 * @Description
 * @Date 14:55 2020/3/17
 **/
public class PicInfo {
    private String name;
    private long size;

    public PicInfo() {
    }

    public PicInfo(String name, long size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }
}
