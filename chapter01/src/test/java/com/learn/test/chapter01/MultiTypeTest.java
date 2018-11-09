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
    public void testMultiType() {
        Super superDemo = new Sub(); // Upcast
        //向上转型之后，属性值会变成父类的属性值
        System.out.println("supDemo.field = " + superDemo.field +
                ", supDemo.getField() = " + superDemo.getField());
        Sub sub = new Sub();
        System.out.println("sub.field = " +
                sub.field + ", sub.getField() = " +
                sub.getField() +
                ", sub.getSuperField() = " +
                sub.getSuperField());
    }

}
