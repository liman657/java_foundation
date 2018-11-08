package com.learn.chapter01.Combine;

import java.util.ArrayList;
import java.util.List;

/**
 * author:liman
 * createtime:2018/11/8
 * mobile:15528212893
 * email:657271181@qq.com
 */
public class CardTab extends Tab {
    private List<Tab> tabs;

    public CardTab(String title){
        super(title);
        tabs = new ArrayList<Tab>();
    }

    public void add(Tab tab) {
        tabs.add(tab);
    }

    public void remove(Tab tab) {
        tabs.remove(tab);
    }

//    public static void main(String[] args) {
//        CardTab cardTab = new CardTab("rootTab");
//    }
    public void print(){
        for(Tab t:tabs){
            System.out.println(t.getTitle());
        }
    }
}
