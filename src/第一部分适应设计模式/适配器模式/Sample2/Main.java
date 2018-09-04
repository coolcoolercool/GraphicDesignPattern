package 第一部分适应设计模式.适配器模式.Sample2;

/**
 * author: zzw5005
 * date: 2018/8/31 14:47
 */

/*
* 将PrintBanner类的实例保存在Print类的变量中。对于Main类的代码而言，Banner类，showWithParen方法和
* showWithAster方法被完全隐藏起来了。Main类并不知道PrintBanner类是如何实现的，如果改变PrintBanner类的
* 具体实现，也不需要对Main类进行修改。
* */
public class Main {
    public static void main(String[] args){
        Print p = new PrintBanner("Hello");     //多态的使用
        p.printWeak();        //弱化 加上括号
        p.printStrong();      //强化，加上星号 **
    }
}
