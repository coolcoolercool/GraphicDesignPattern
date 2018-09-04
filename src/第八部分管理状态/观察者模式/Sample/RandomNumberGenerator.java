package 第八部分管理状态.观察者模式.Sample;

import java.util.Random;

/**
 * author: zzw5005
 * date: 2018/9/4 10:18
 */

/*
* 具体的观察对象角色，表示具体的被观察对象。当自身状态发生变化后，它会通知已经注册的Observer角色。
* */
public class RandomNumberGenerator extends NumberGenerator{
    private Random random = new Random();
    private int number;

    @Override
    public int getNumber() {
        return number;
    }

    /**
     * execute方法会生成20个随机数(0到49)，并通知notifyObserver方法把每次生成结果通知给观察者。
     */
    @Override
    public void execute() {
        for(int i = 0; i < 20; i++){
            //nextInt返回下一个随机整数值
            number = random.nextInt(50);
            notifyObservers();
        }
    }
}
