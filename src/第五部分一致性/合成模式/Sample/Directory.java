package 第五部分一致性.合成模式.Sample;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * author: zzw5005
 * date: 2018/9/2 19:44
 */

/*
* 复合物角色，表示容器。可以在其中放入树叶角色和复合物角色。
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

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        Iterator it = directory.iterator();
        while(it.hasNext()){
            Entry entry = (Entry) it.next();
            entry.printList(prefix + "/" + name);
        }
    }
}
