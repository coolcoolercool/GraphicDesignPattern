package 第四部分分开考虑.策略模式.Sample;

import java.util.Random;

/**
 * author: zzw5005
 * date: 2018/9/2 16:05
 */

/*
* 具体的策略角色，负责实现策略角色的接口，即负责实现具体的策略。
* */
public class WinnerStrategy implements Strategy{
    private Random random;
    private boolean won = false;
    private Hand preHand;

    public WinnerStrategy(int seed){
        random = new Random(seed);
    }

    /**
     * 如果上一句赢了，就出和上一局一样的手势; 如果上一句输了，就随机出
     * @return
     */
    @Override
    public Hand nextHand() {
        if(!won)
            preHand = Hand.getHand(random.nextInt(3));

        return preHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
