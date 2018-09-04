package 第七部分简单化.外观模式.Sample.pagemaker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/*
* 构成系统的许多其他角色，这些角色各自完成自己的工作，它们并不知道窗口的角色。
* 窗口角色会调用其他角色进行工作，但是其他角色不会调用窗口角色。
* */
public class Database {
    private Database() {    // 防止外部new出Database的实例，所以声明为private方法
    }
    public static Properties getProperties(String dbname) { // 根据数据库名获取Properties
        String filename = dbname + ".txt";
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(filename));
        } catch (IOException e) {
            System.out.println("Warning: " + filename + " is not found.");
        }
        return prop;
    }
}
