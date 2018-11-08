package com.learn.test;

import com.learn.chapter01.Combine.CardTab;
import org.junit.Test;

/**
 * autor:liman
 * mobilNo:15528212893
 * mail:657271181@qq.com
 * comment:
 */
public class TabTest {

    @Test
    public void testTab() {
        CardTab cardTab = new CardTab("rootTab");
        CardTab nodeTab = new CardTab("nodeTab");
        cardTab.add(nodeTab);

        cardTab.print();
    }

}
