package 第三部分生成实例.单例模式.A1;

/**
 * author: zzw5005
 * date: 2018/8/31 20:27
 */


public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        for(int i = 0; i < 10; i++){
            System.out.println(i + ":" + TicketMaker.getInstance().getNextTicketNumber());
        }
        System.out.println("End.");
    }
}
