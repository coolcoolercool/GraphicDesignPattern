package 第十部份用类来表现.解释器模式.Sample;

/*
* 抽象表达式角色，定义了语法树结点的共同接口。
* */
public abstract class Node {
    //用于语法解析处理
    public abstract void parse(Context context) throws ParseException;
}
