package 第四部分分开考虑.策略模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/2 16:03
 */

/*
* 策略角色，负责决定实现策略所必需的接口
* */
public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);
}
