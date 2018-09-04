package 第三部分生成实例.抽象工厂模式.Sample.factory;

import java.util.ArrayList;

/**
 * author: zzw5005
 * date: 2018/9/1 17:35
 */

/*
* 抽象产品角色，负责定义抽象工厂角色所生成的抽象零件和产品的接口。
* tray 托盘的意思，这里可以理解成容器的意思。
* 表示的是一个含有多个Link类和Tray类的容器。
* */
public abstract class Tray extends Item{
    protected ArrayList tray = new ArrayList();

    public Tray(String caption) {      //标题
        super(caption);
    }

    /**
     * Tray类使用add方法将Tray类集合在一起。
     * @param item
     */
    public void add(Item item){
        tray.add(item);
    }
}
