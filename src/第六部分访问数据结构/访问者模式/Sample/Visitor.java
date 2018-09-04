package 第六部分访问数据结构.访问者模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/2 21:54
 */

/*
* 访问者角色，负责对数据结构中的每个具体元素角色，声明一个用于访问XX的visit方法。
* visit方法是用于处理XX的方法，负责实现该方法的是具体访问者角色。
* */
public abstract class Visitor {
    public abstract void visit(File file);
    public abstract void visit(Directory directory);
}
