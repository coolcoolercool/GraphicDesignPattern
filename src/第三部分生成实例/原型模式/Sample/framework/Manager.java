package 第三部分生成实例.原型模式.Sample.framework;

import java.util.HashMap;

/**
 * author: zzw5005
 * date: 2018/8/31 21:07
 */

/*
* 使用者角色，它负责使用复制现有实例并生成新的实例。
* Manager类中，并没有写具体的类型，仅仅使用了Product这个接口名。也就是，Product接口成为了连接Manager类与其他具体类
* 之间的桥梁。这也是解耦的一种方式。
* */
public class Manager {
    private HashMap showcase = new HashMap();          //键值对，用来保存实例的"名字"和"实例"之间的对应关系

    /**
     * 将接收到的一组"名字"和"Product接口"注册(添加)到showcase当中。
     * @param name
     * @param proto
     */
    public void register(String name, Product proto){
        showcase.put(name, proto);
    }

    /**
     * 只要是实现了Product接口的类，调用它的createClone方法就可以复制出新的实例
     * @param protoname
     * @return
     */
    public Product create(String protoname){
        Product p = (Product)showcase.get(protoname);
        return p.createClone();
    }
}
