package 第九部分避免浪费.代理模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/4 20:40
 */

/*
* 请求者角色，使用代理人角色。
* */
public class Main {
    public static void main(String[] args) {
        Printable p = new PrinterProxy("Alice");
        System.out.println("现在的名字是: " + p.getPrinterName() + ".");
        p.setPrinterName("Bob");
        System.out.println("现在的名字是: " + p.getPrinterName() + ".");
        p.print("Hello, world");

    }
}
