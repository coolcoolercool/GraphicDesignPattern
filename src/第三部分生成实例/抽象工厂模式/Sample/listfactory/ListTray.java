package 第三部分生成实例.抽象工厂模式.Sample.listfactory;

import 第三部分生成实例.抽象工厂模式.Sample.factory.Item;
import 第三部分生成实例.抽象工厂模式.Sample.factory.Tray;

import java.util.Iterator;

/**
 * author: zzw5005
 * date: 2018/9/2 9:35
 */


public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<li>\n");
        buffer.append(caption + "\n");
        buffer.append("<ul>\n");
        Iterator it = tray.iterator();
        while (it.hasNext()) {
            Item item = (Item)it.next();
            //这里并不关系变量item中保存的实例是ListLink的实例还是ListTray的实例
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("</li>\n");
        return buffer.toString();
    }
}
