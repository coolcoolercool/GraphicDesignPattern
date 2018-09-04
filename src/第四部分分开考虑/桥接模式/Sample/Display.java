package 第四部分分开考虑.桥接模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/2 10:36
 */

/*
* 抽象化角色，位于类的功能层次结构的最上层，它使用实现者角色(DisplayImpl)的方法定义了基本的功能，它还保存了实现者角色的实例。
* 功能层次结构，位于功能层次结构的最上层，负责显示一些东西。
* */
public class Display {
    private DisplayImpl impl;
    public Display(DisplayImpl impl){
        this.impl = impl;
    }
    public void open(){
        impl.rawOpen();
    }
    public void print(){
        impl.rawPrint();
    }
    public void close(){
        impl.rawClose();
    }
    public final void display(){
        open();
        print();
        close();
    }
}
