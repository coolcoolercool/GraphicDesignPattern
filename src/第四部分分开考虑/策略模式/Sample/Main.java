package 第四部分分开考虑.策略模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/2 16:54
 */

/*
* 使用策略模式可以整体地替换策略算法的实现部分。能够整体地替换算法，能让我们轻松地选择不同的算法
* 去解决同一个问题。
* */
public class Main {
    public static void main(String[] args) {
        /*if (args.length != 2) {
            System.out.println("Usage: java Main randomseed1 randomseed2");
            System.out.println("Example: java Main 314 15");
            System.exit(0);
        }*/
        int[] array = {314, 15};
        int seed1 = (array[0]);
        int seed2 = (array[1]);
        Player player1 = new Player("Taro", new WinnerStrategy(seed1));
        Player player2 = new Player("Hana", new ProStrategy(seed2));
        for (int i = 0; i < 10000; i++) {
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();
            if (nextHand1.isStrongerThan(nextHand2)) {
                System.out.println("Winner:" + player1);
                player1.win();
                player2.lose();
            } else if (nextHand2.isStrongerThan(nextHand1)) {
                System.out.println("Winner:" + player2);
                player1.lose();
                player2.win();
            } else {
                System.out.println("Even...");
                player1.even();
                player2.even();
            }
        }
        System.out.println("Total result:");
        System.out.println(player1.toString());
        System.out.println(player2.toString());
    }
}
