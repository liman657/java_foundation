package com.learn.test.chapter01;

import com.learn.chapter01.multiType.Sub;
import com.learn.chapter01.multiType.Super;
import org.junit.Test;

/**
 * author:liman
 * createtime:2018/11/9
 * mobile:15528212893
 * email:657271181@qq.com
 */
public class MultiTypeTest {

    @Test
    public void testMultiType(){
        Super sup = new Sub(); // Upcast
        System.out.println("sup.field = " + sup.field +
                ", sup.getField() = " + sup.getField());
        Sub sub = new Sub();
        System.out.println("sub.field = " +
                sub.field + ", sub.getField() = " +
                sub.getField() +
                ", sub.getSuperField() = " +
                sub.getSuperField());
    }

}
