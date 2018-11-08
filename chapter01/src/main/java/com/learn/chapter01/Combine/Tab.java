package com.learn.chapter01.Combine;

/**
 * author:liman
 * createtime:2018/11/8
 * mobile:15528212893
 * email:657271181@qq.com
 */
public abstract class Tab {

    private String title;

    public Tab(String title){
        this.title = title;
    }

    protected abstract void add(Tab tab);

    protected abstract void remove(Tab tab);

}
