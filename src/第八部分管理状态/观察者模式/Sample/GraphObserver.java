package 第八部分管理状态.观察者模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/4 10:26
 */

/*
* 具体的观察者角色，表示具体的Observer。当它的update方法被调用后，会去获取要观察的对象的最新状态。
* */
public class GraphObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.print("GraphObserver:");
        int count = generator.getNumber();
        for(int i = 0; i < count; i++){
            System.out.print("*");
        }
        System.out.println("\n");

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
