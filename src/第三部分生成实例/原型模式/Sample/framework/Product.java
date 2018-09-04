package 第三部分生成实例.原型模式.Sample.framework;

/**
 * author: zzw5005
 * date: 2018/8/31 21:06
 */

/*
* Product接口是复制功能的接口。该接口继承了java.lang.Cloneable
* 原型角色，原型角色负责定义用于复制现有实例来生成新实例的方法。
* */
public interface Product extends Cloneable{
    //用于使用的方法，具体如何使用，则被交给子类去实现
    public abstract void use(String s);
    //复制自己的接口
    public abstract Product createClone();
}
