package com.learn.chapter01.multiType;

/**
 * author:liman
 * createtime:2018/11/9
 * mobile:15528212893
 * email:657271181@qq.com
 * comment:用于演示多态的缺陷，静态方法不能实现多态，因为域和静态方法直接在编译的时候进行解析，所以多态不会对其产生作用
 */
public class StaticSuper {

    public static String staticGet(){
        return "Base staticGet()";
    }

    public String dynamicGet(){
        return "Base dynamicGet()";
    }

}
