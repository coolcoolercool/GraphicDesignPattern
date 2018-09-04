package 第四部分分开考虑.桥接模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/2 10:42
 */

/*
* 改善后的抽象化角色，它在抽象化角色的基础上增加了新功能
* 类的功能层次结构。继承了Display类，并且增加功能，循环显示
* */
public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    /**
     * 循环显示times
     * @param times
     */
    public void multiDisplay(int times){
        open();
        for(int i = 0; i < times; i++){
            print();
        }
        close();
    }
}
