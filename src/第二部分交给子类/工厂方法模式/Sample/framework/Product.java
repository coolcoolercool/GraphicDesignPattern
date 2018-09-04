package 第二部分交给子类.工厂方法模式.Sample.framework;

/**
 * author: zzw5005
 * date: 2018/8/31 16:51
 */

/*
* 产品角色属于框架这一方的，一个抽象类。它定义了在工厂方法模式中生成的哪些实例所持有的接口，
* 但是具体的处理则由子类具体的产品角色决定
* */
public abstract class Product {
    public abstract void use();
}
