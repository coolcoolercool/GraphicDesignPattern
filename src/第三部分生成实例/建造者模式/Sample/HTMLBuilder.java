package 第三部分生成实例.建造者模式.Sample;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * author: zzw5005
 * date: 2018/9/1 10:16
 */


public class HTMLBuilder extends Builder{
    private String fileName;                          //文件名
    private PrintWriter writer;                       //用于编写文件的PrintWriter

    public void makeTitle(String title){
        fileName = title + ".html";                   //将标题作为文件名

        try {
            writer = new PrintWriter(new FileWriter(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("<html><head><title>" + title + "</title></head></body>");

        System.out.println("<h1>" + title + "</h1>");
    }

    public void makeString(String str){
        System.out.println("<p>" + str + "</p>");
    }

    public void makeItems(String[] items){
        System.out.println("<u1>");
        for(int i = 0 ; i < items.length; i++){
            System.out.println("<li>" + items[i] + "</li>");
        }
        System.out.println("</u1>");
    }

    public void close(){
        System.out.println("</body></html>");
        System.out.close();
    }

    /**
     * 编写完成的文档，文件返回名
     * @return
     */
    public String getResult(){
        return fileName;
    }
}
