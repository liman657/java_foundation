package com.learn.chapter01.multiType;

/**
 * author:liman
 * createtime:2018/11/9
 * mobile:15528212893
 * email:657271181@qq.com
 */
public class StaticSub extends StaticSuper{

    public static String staticGet(){
        return "Derived staticGet()";
    }

    public String dynamicGet(){
        return "Derived dynamicGet()";
    }

}
