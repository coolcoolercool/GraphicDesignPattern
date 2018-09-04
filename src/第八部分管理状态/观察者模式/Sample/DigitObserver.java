package 第八部分管理状态.观察者模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/4 10:23
 */

/*
* 具体的观察者角色，表示具体的Observer。当它的update方法被调用后，会去获取要观察的对象的最新状态。
* DigitObserver类实现了Observer接口，它的功能是以数字形式显示观察到的数值。
* */
public class DigitObserver implements Observer {
    //这里使用的观察对象的接口，并不是具体的观察对象，这样就可以做到可替换性。
    @Override
    public void update(NumberGenerator generator) {
        //getNumber会获取当前Number的数值
        System.out.println("DigitObserver: " + generator.getNumber());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
