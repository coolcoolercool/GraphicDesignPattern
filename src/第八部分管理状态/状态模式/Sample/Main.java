package 第八部分管理状态.状态模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/4 16:51
 */


public class Main {
    public static void main(String[] args) {
        SafeFrame frame = new SafeFrame("State Sample");
        while(true){
            for(int hour = 0; hour < 24; hour++){
                frame.setClock(hour);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
