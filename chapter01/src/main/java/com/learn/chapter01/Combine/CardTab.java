package com.learn.chapter01.Combine;

import java.util.List;

/**
 * author:liman
 * createtime:2018/11/8
 * mobile:15528212893
 * email:657271181@qq.com
 */
public class CardTab extends Tab {

    public CardTab(String title){
        super(title);
    }

    private List<Tab> tabs;

    protected void add(Tab tab) {
        tabs.add(tab);
    }

    protected void remove(Tab tab) {
        tabs.remove(tab);
    }

    public static void main(String[] args) {
        CardTab cardTab = new CardTab("rootTab");
    }
}
