package com.learn.chapter01.ContructOrder;

/**
 * author:liman
 * createtime:2018/11/9
 * mobile:15528212893
 * email:657271181@qq.com
 * comment:构造器的顺序
 */
public class ConstructOrder extends PortableLunch{
    private Bread bread = new Bread();
    private Cheese cheese = new Cheese();
    private Lettuce lettuce = new Lettuce();

    public ConstructOrder(){
        System.out.println("ConstructOrder()");
    }
}

class Meal{
    Meal(){
        System.out.println("Meal()");
    }
}

class Bread{
    Bread(){
        System.out.println("Bread()");
    }
}

class Cheese{
    Cheese(){
        System.out.println("Cheese()");
    }
}

class Lettuce{
    Lettuce(){
        System.out.println("Lettuce()");
    }
}

class Lunch extends Meal{
    Lunch(){
        System.out.println("Lunch()");
    }
}

class PortableLunch extends Lunch{
    PortableLunch(){
        System.out.println("PortableLunch()");
    }
}