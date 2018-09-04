package 第六部分访问数据结构.访问者模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/2 21:55
 */

/*
* 元素角色表示访问者角色的访问对象。它声明了接收访问者的accept方法。
* accept方法接收到的是访问者角色。
* 表示接收访问者的访问的接口。
* */
public interface Element {
    public abstract void accept(Visitor v);
}
