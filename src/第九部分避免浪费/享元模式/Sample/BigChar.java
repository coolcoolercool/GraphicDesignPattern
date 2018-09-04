package 第九部分避免浪费.享元模式.Sample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * author: zzw5005
 * date: 2018/9/4 17:23
 */

/*
* 轻量级角色，按照通常编程方式会导致程序变重，所以如果能共享实例会比较好。而轻量级角色表示的就是那些实例会被共享的类。
* */
public class BigChar {
    //字符名字
    private char charName;
    //
    private String fontData;

    public BigChar(char charName){
        this.charName = charName;
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("big" + charName + ".txt")
            );
            String line;
            StringBuffer buf = new StringBuffer();
            while((line = reader.readLine()) != null){
                buf.append(line);
                buf.append("\n");
            }
            reader.close();
            this.fontData = buf.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //显示大型字符
    public void print(){
        System.out.println(fontData);
    }

}
