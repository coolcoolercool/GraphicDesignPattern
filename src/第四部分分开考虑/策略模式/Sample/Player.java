package 第四部分分开考虑.策略模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/2 16:45
 */

/*
* 上下文的角色，负责使用策略角色。上下文角色保存了具体策略角色的实例，并使用具体策略角色取实现需求。
* */
public class Player {
    private String name;
    private Strategy strategy;  //持有Strategy的实例，委托具体的策略模式进行下一局手势的计算
    private int winCount;
    private int loseCount;
    private int gameCount;

    public Player(String name, Strategy strategy){  //需要赋予姓名和策略
        this.name = name;
        this.strategy = strategy;
    }

    /**
     * 这里是将下一局的手势的工作委托给策略，这是一种委托关系
     * @return
     */
    public Hand nextHand(){
        return strategy.nextHand();
    }

    /**
     * 胜局
     */
    public void win(){
        strategy.study(true);
        winCount++;
        gameCount++;
    }

    public void lose(){
        strategy.study(false);
        loseCount++;
        gameCount++;
    }

    /**
     * 平句
     */
    public void even(){
        gameCount++;
    }

    public String toString() {
        return "[" + name + ":" + gameCount + " games, " + winCount +
                " win, " + loseCount + " lose" + "]";
    }
}
