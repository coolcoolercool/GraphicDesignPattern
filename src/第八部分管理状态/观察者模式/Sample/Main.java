package 第八部分管理状态.观察者模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/4 10:28
 */


public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.execute();
    }
}
