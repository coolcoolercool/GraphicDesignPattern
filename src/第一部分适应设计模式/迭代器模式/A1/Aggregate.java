package 第一部分适应设计模式.迭代器模式.A1;

/**
 * author: zzw5005
 * date: 2018/8/31 10:12
 */

/*
* 集合，负责定义船舰Iterator角色的接口。
* */
public interface Aggregate {
    public abstract Iterator iterator();
}
