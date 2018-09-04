package 第四部分分开考虑.桥接模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/2 10:53
 */


public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, China"));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World"));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Earth"));

        d1.display();
        d2.display();
        d3.display();

        d3.multiDisplay(5);
    }
}
