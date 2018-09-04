package 第三部分生成实例.抽象工厂模式.Sample.listfactory;

import 第三部分生成实例.抽象工厂模式.Sample.factory.Item;
import 第三部分生成实例.抽象工厂模式.Sample.factory.Page;

import java.util.Iterator;

/**
 * author: zzw5005
 * date: 2018/9/2 9:41
 */


public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title>" + title + "</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>" + title + "</h1>\n");
        buffer.append("<ul>\n");
        Iterator it = content.iterator();
        while (it.hasNext()) {
            Item item = (Item)it.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("<hr><address>" + author + "</address>");
        buffer.append("</body></html>\n");
        return buffer.toString();
    }
}
