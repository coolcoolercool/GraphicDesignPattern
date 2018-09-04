package 第三部分生成实例.抽象工厂模式.Sample.tablefactory;
import 第三部分生成实例.抽象工厂模式.Sample.factory.Link;

public class TableLink extends Link {
    public TableLink(String caption, String url) {
        super(caption, url);
    }
    public String makeHTML() {
        return "<td><a href=\"" + url + "\">" + caption + "</a></td>\n";
    }
}
