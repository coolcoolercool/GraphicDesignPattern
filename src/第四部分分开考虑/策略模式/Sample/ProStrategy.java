package 第四部分分开考虑.策略模式.Sample;

import java.util.Random;

/**
 * author: zzw5005
 * date: 2018/9/2 16:12
 */

/*
 * 具体的策略角色，负责实现策略角色的接口，即负责实现具体的策略。
 * */
public class ProStrategy implements Strategy {
    private Random random;
    private int preHandValue = 0;
    private int currentHandValue = 0;
    private int[][] history = {
            {1,1,1},
            {1,1,1},
            {1,1,1},
    };

    public ProStrategy(int seed){
        random = new Random(seed);
    }

    /**
     * 根据history[上一局出现的手势][这一句出现的手势]的值，来进行概率计算，决定出的手势
     * @return
     */
    @Override
    public Hand nextHand() {
        //从0与这个和之间取一个随机数
        int bet = random.nextInt(getSum(currentHandValue));
        int handValue = 0;
        //根据随机数所处的范围，来选择下一局出的手势值
        if(bet < history[currentHandValue][0]){
            handValue = 0;
        }else if(bet < history[currentHandValue][0] + history[currentHandValue][1]){
            handValue = 1;
        }else{
            handValue = 2;
        }

        preHandValue = currentHandValue;
        currentHandValue = handValue;

        return Hand.getHand(handValue);
    }

    /**
     * hv是如果这句出的手势的所对应的值
     * 计算history[hv][0],history[hv][1],history[hv][2]这三个表达式的值的和
     * @param hv
     * @return
     */
    private int getSum(int hv){
        int sum = 0;
        for(int i = 0; i < 3; i++){
            sum += history[hv][i];
        }
        return sum;
    }

    @Override
    public void study(boolean win) {
        if(win){
            history[preHandValue][currentHandValue]++;
        }else{
            history[preHandValue][(currentHandValue + 1) % 3]++;
            history[preHandValue][(currentHandValue + 2) % 3]++;
        }
    }
}
