package 第一部分适应设计模式.适配器模式.Sample1;

/**
 * author: zzw5005
 * date: 2018/8/31 14:44
 */

/*
* 对象，负责定义所需要的方法。
* */
public interface Print {
    public abstract void printWeak();
    public abstract void printStrong();
}
