package 第六部分访问数据结构.访问者模式.Sample;



import java.util.ArrayList;
import java.util.Iterator;

/**
 * author: zzw5005
 * date: 2018/9/2 19:44
 */

/*
* 具体元素角色，负责实现元素角色所定义的接口(accept方法)。
* 对象结构角色，负责处理元素角色的集合。具体访问者角色为每个元素角色都准备了处理方法。
* Directory扮演了两个角色
* */
public class Directory extends Entry {
    private String name;
    private ArrayList directory = new ArrayList();   //文件加中目录条目的集合

    public Directory(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator it = directory.iterator();
        while(it.hasNext()){
            Entry entry = (Entry)it.next();
            /*
            * 关键点,变量size累计entry的大小，entry可能是File类的实例，也可能是Directory类的实例
            * 不过不论他是哪个类的实例，都可以通过getSize得到它的大小
            * */
            size += entry.getSize();
        }
        return size;
    }

    /**
     * 增加目录条目
     * @param entry
     * @return
     */
    public Entry add(Entry entry){
        directory.add(entry);
        return this;
    }

    /**
     * 生成迭代器，用于遍历文件夹中的所有目录条目(文件和文件夹)
     * @return
     */
    public Iterator iterator(){
        return directory.iterator();
    }

    @Override
    public void accept(Visitor v) {
        //这里的this指的是Directory类的实例。
        v.visit(this);
    }
}
