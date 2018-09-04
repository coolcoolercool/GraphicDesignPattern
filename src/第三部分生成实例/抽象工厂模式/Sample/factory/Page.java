package 第三部分生成实例.抽象工厂模式.Sample.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

/**
 * author: zzw5005
 * date: 2018/9/2 8:51
 */

/*
* 抽象产品角色，负责定义抽象工厂角色所生成的抽象零件和产品的接口。
* */
public abstract class Page {
    protected String title;
    protected String author;
    protected ArrayList content = new ArrayList();

    public Page(String title, String author){
        this.title = title;
        this.author = author;
    }

    /**
     * 向页面中添加Item(即Link或Tray)。
     * @param item
     */
    public void add(Item item){
        content.add(item);
    }

    /**
     * output方法首先根据页面标题确定文件名，接着调用makeHTML方法将自身保存的HTML
     * 内容保存到文件中
     */
    public void output(){
        try {
            String fileName = title + ".html";
            Writer writer = new FileWriter(fileName);
            //为了强调调用的是Page类自己的makeHTML方法。
            writer.write(this.makeHTML());
            writer.close();
            System.out.println(fileName + " 编写完成。");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String makeHTML();
}
