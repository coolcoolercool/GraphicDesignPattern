package 第七部分简单化.外观模式.Sample.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/*
* 窗口角色，代表构成系统的许多其他角色的简单窗口。窗口角色向系统外部提供高层接口。
* 使用Database类和HtmlWriter类来生成执行用户的Web页面
* PageMaker包办了调用HtmlWriter类的方法这一工作。对外部，它只提供了makeWelcomPage接口。这也是外观模式的核心思想
* */
public class PageMaker {
    private PageMaker() {   // 防止外部new出PageMaker的实例，所以声明为private方法
    }
    public static void makeWelcomePage(String mailaddr, String filename) {
        try {
            Properties mailprop = Database.getProperties("maildata");
            String username = "Hiroshi Yuki";
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            writer.title("Welcome to " + username + "'s page!");
            writer.paragraph("欢迎来到" + username + "的主页。");
            writer.paragraph("等着你的邮件哦！");
            writer.mailto(mailaddr, username);
            writer.close();
            System.out.println(filename + " is created for " + mailaddr + " (" + username + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
