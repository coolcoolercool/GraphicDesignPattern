package 第三部分生成实例.原型模式.Sample;

import 第三部分生成实例.原型模式.Sample.framework.Manager;
import 第三部分生成实例.原型模式.Sample.framework.Product;

/**
 * author: zzw5005
 * date: 2018/8/31 21:05
 */

/*
* 原型模式:不使用new关键字指定类名来生成类的实例
* 不根据类来生成实例，而是根据实例来生成新的实例
* */
public class Main {
    public static void main(String[] args) {
        //准备
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('-');
        MessageBox mBox = new MessageBox('*');
        MessageBox sBox = new MessageBox('/');
        manager.register("strong message", upen);
        manager.register("warning box", mBox);
        manager.register("slash box", sBox);    //斜线框

        //生成，通过键获取对应的值。这里就是使用create方法，而不是使用new关键字来指定类名来生成类的实例
        Product p1 = manager.create("strong message");
        p1.use("Hello, new China");
        Product p2 = manager.create("warning box");
        p2.use("Hello, new China");
        Product p3 = manager.create("slash box");
        p3.use("Hello, new China");

    }
}
