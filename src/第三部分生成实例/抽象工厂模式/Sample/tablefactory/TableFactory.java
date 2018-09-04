package 第三部分生成实例.抽象工厂模式.Sample.tablefactory;
import 第三部分生成实例.抽象工厂模式.Sample.factory.Factory;
import 第三部分生成实例.抽象工厂模式.Sample.factory.Link;
import 第三部分生成实例.抽象工厂模式.Sample.factory.Page;
import 第三部分生成实例.抽象工厂模式.Sample.factory.Tray;

/*
* 具体工厂角色，负责实现抽象工厂角色的接口。
* */
public class TableFactory extends Factory {
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
