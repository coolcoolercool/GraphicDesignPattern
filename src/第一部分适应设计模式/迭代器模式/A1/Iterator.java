package 第一部分适应设计模式.迭代器模式.A1;

/**
 * author: zzw5005
 * date: 2018/8/31 10:13
 */

/*
* 迭代器(接口) 负责定义按顺序逐个遍历元素的接口。
* */
public interface Iterator {
    public abstract boolean hasNext();  //判断是否有下一个元素
    public abstract Object next();      //获取下一个元素
}
