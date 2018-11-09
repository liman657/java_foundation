package com.learn.test.chapter01;

import com.learn.chapter01.multiType.StaticSub;
import com.learn.chapter01.multiType.StaticSuper;
import org.junit.Test;

/**
 * author:liman
 * createtime:2018/11/9
 * mobile:15528212893
 * email:657271181@qq.com
 */
public class StaticPolymorphism {

    @Test
    public void testStaticMulti(){
        StaticSuper staticSuper = new StaticSub();
        System.out.println(staticSuper.staticGet());
        System.out.println(staticSuper.dynamicGet());
    }

}
