package 第三部分生成实例.抽象工厂模式.Sample.listfactory;

import 第三部分生成实例.抽象工厂模式.Sample.factory.Link;

/**
 * author: zzw5005
 * date: 2018/9/2 9:30
 */

/*
* 具体产品角色，负责实现抽象工厂角色接口。
* */
public class ListLink extends Link {

    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "  <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
