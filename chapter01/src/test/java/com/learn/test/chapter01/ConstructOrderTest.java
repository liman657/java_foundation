package com.learn.test.chapter01;

import com.learn.chapter01.ContructOrder.ConstructOrder;
import org.junit.Test;

/**
 * author:liman
 * createtime:2018/11/9
 * mobile:15528212893
 * email:657271181@qq.com
 */
public class ConstructOrderTest {

    /**
     * 一个继承的类实例，必须要确保所有的成员已经构造完成，必须先调用基类的构造器
     * 同时在调用构造函数之前，必须先实例化完成所有成员属性
     */
    @Test
    public void testConsturctOrder(){
        new ConstructOrder();
    }

}
