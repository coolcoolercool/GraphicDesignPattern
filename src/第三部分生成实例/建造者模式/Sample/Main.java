package 第三部分生成实例.建造者模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/1 10:30
 */

/**
 * args[0]表示从命令行运行java文件，从命令行输入的第一个参数
 * 比如在文件所在的位置的 命令行输入 java Main.java plain
 * 在本函数中，就是args[0]=plain
 */

/*
* 使用者角色，使用了建造者模式
*
* 建造者模式用于组装具有复杂结构实例
* */
public class Main {
    public static void main(String[] args) {
        String[] need = {"plain","html"};
        /*if(args.length != 1){
            usage();
            System.exit(0);
        }*/
        if(need[1].equals("plain")){
            TextBuilder textbuilder = new TextBuilder();
            Director director = new Director(textbuilder);
            director.construct();
            String result = textbuilder.getResult();
            System.out.println(result);
        }else if(need[1].equals("html")){
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Director director = new Director(htmlBuilder);
            director.construct();
            String fileName = htmlBuilder.getResult();
            System.out.println(fileName + "文档编写完成。");
        }else{
            usage();
            System.exit(0);
        }
    }
    public static void usage(){
        System.out.println("Usage: java Main plain   编写纯文本文档");
        System.out.println("Usage: java Main html   编写HTML文档");
    }
}
