package 第三部分生成实例.抽象工厂模式.Sample.factory;

/**
 * author: zzw5005
 * date: 2018/9/1 15:07
 */

/*
* 抽象产品角色，负责定义抽象工厂角色所生成的抽象零件和产品的接口。
* 抽象地表示HTML的超链接的类
* url字段中保存的是超链接所指向的地址
* */
public abstract class Link extends Item {
    protected String url;
    public Link(String caption, String url){
        super(caption);
        this.url = url;
    }
}
