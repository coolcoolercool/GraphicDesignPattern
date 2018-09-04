package 第五部分一致性.装饰者模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/2 21:12
 */

/*
* 不断地为对象添加装饰的设计模式就是装饰者模式。
*
* */
public class Main {
    public static void main(String[] args) {
        Display b1 = new StringDisplay("Hello, world.");
        Display b2 = new SideBorder(b1, '#');
        Display b3 = new FullBorder(b2);



        b1.show();
        System.out.println("\n");
        b2.show();
        System.out.println("\n");
        b3.show();

        System.out.println("\n");
        Display b4 =
                new SideBorder(
                        new FullBorder(
                                new FullBorder(
                                        new SideBorder(
                                                new FullBorder(
                                                        new StringDisplay("你好，世界。")
                                                ),
                                                '*'
                                        )
                                )
                        ),
                        '/'
                );


        b4.show();
    }
}
