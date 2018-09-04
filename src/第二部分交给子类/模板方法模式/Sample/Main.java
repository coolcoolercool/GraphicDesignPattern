package 第二部分交给子类.模板方法模式.Sample;

/**
 * author: zzw5005
 * date: 2018/8/31 16:28
 */


public class Main {
    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('H');  //生成一个持有'H'的CharDisplay类的实例

        AbstractDisplay d2 = new StringDisplay("Hello, new China.");

        AbstractDisplay d3 = new StringDisplay("新中国，你好");
        //由于d1，d2，d3都是AbstractDisplay类的子类，可以调用继承的display方法，实际的程序行为却决与CharDisplay类的具体是新啊
        d1.display();
        d2.display();
        d3.display();
    }
}
