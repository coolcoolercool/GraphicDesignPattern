package 第三部分生成实例.单例模式.A2;

/**
 * author: zzw5005
 * date: 2018/8/31 20:50
 */


public class Main{
    public static void main(String[] args) {
        System.out.println("Start.");

        for(int i = 0; i < 9; i++){
            Triple triple = Triple.getInstance(i % 3);
            System.out.println(i + ":" + triple);
        }
        System.out.println("End.");
    }
}
