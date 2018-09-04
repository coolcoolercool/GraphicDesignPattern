package 第四部分分开考虑.策略模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/2 15:44
 */


public class Hand {
    public static final int HANDVALUE_GUU = 0; //石头的值
    public static final int HANDVALUE_CHO = 1; //剪刀的值
    public static final int HANDVALUE_FAA = 2; //布的值

    public static final Hand[] hand = {        //表示猜拳中3中手势的实例
            new Hand(HANDVALUE_GUU),
            new Hand(HANDVALUE_CHO),
            new Hand(HANDVALUE_FAA),
    };

    private static final String[] name = {     //猜拳中手势所对应的实例
            "石头","剪刀","布",
    };

    private int handValue;                     //猜拳中手势的值
    private Hand(int handValue){
        this.handValue = handValue;
    }

    /**
     * 根据手势的值获取其对应的实例
     * @param handValue
     * @return hand[handValue]
     */
    public static Hand getHand(int handValue){
        return hand[handValue];
    }

    /**
     * 如果this胜了h，则返回true
     * @param h
     * @return
     */
    public boolean isStrongerThan(Hand h){
        return fight(h) == 1;
    }

    /**
     * 如果this输给了h，则返回true
     * @param h
     * @return
     */
    public boolean isWeakThan(Hand h){
        return fight(h) == -1;
    }

    /**
     * 计分，平0，胜1，负-1
     * @param h
     * @return
     */
    private int fight(Hand h){
        if(this == h){
            return 0;
        }//如果this的手势值加1是h的手势值，则判定是this胜。根据设定，手势值小1的胜
        else if((this.handValue + 1) % 3 == h.handValue){
            return 1;
        }else{
            return -1;
        }
    }

    public String toString(){
        return name[handValue];
    }
}
