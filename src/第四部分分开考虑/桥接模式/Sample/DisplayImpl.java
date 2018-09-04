package 第四部分分开考虑.桥接模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/2 10:37
 */

/*
* 实现者的角色，位于类的实现层次结构的最上层，定义了用于实现抽象化角色的接口方法
* 类的层次结构，位于类的层次结构的最上层，它的三个抽象方法对Display的三个方法相对应，进行显示前，显示，显示后处理。
*
* 桥接模式的作用是在 类的功能层次结构 和 类的实现层次结构 之间搭建桥梁。
* */
public abstract class DisplayImpl {
    public abstract void rawOpen();
    public abstract void rawPrint();
    public abstract void rawClose();
}
