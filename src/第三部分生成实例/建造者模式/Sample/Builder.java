package 第三部分生成实例.建造者模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/1 9:56
 */

/*
* 建造者角色，负责定义用于生成实例的接口。建造者角色中准备了用于生成实例的方法
* */
public abstract class Builder {
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract void close();
}
