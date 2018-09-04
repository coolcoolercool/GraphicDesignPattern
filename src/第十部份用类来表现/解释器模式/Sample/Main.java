package 第十部份用类来表现.解释器模式.Sample;

import java.util.*;
import java.io.*;

/*
* 请求者角色，会调用非终结符表达式和终结表达式角色来推导语法树。
* */
public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("program.txt"));
            String text;
            while ((text = reader.readLine()) != null) {
                System.out.println("text = \"" + text + "\"");
                Node node = new ProgramNode();
                node.parse(new Context(text));
                System.out.println("node = " + node);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
