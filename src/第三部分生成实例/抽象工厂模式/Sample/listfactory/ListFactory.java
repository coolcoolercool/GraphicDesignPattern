package 第三部分生成实例.抽象工厂模式.Sample.listfactory;

import 第三部分生成实例.抽象工厂模式.Sample.factory.Factory;
import 第三部分生成实例.抽象工厂模式.Sample.factory.Link;
import 第三部分生成实例.抽象工厂模式.Sample.factory.Page;
import 第三部分生成实例.抽象工厂模式.Sample.factory.Tray;

/**
 * author: zzw5005
 * date: 2018/9/2 9:26
 */

/*
* 具体工厂角色，负责实现抽象工厂角色的接口。
* */
public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
