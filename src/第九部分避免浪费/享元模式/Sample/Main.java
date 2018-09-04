package 第九部分避免浪费.享元模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/4 20:00
 */


public class Main {
    public static void main(String[] args) {
        String[] array = {"1212123"};

        BigString bs = new BigString(array[0]);
        bs.print();
    }
}
