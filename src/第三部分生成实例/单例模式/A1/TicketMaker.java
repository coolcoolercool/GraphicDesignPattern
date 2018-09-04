package 第三部分生成实例.单例模式.A1;

/**
 * author: zzw5005
 * date: 2018/8/31 20:24
 */


public class TicketMaker {
    private int ticket = 1000;
    private static TicketMaker singleton = new TicketMaker();

    private TicketMaker(){
    }
    public static TicketMaker getInstance(){
        return singleton;
    }
    public synchronized int getNextTicketNumber(){
        return ticket++;
    }
}
