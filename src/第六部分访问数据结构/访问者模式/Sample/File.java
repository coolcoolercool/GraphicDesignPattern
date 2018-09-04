package 第六部分访问数据结构.访问者模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/2 21:59
 */

/*
* 具体元素角色，负责实现元素角色所定义的接口(accept方法)。
* */
public class File extends Entry {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void accept(Visitor v) {
        //这里的this指的是File类的实例。所以这里调用的是visit(File file)方法
        v.visit(this);
    }
}
