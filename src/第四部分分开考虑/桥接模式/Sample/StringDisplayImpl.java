package 第四部分分开考虑.桥接模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/2 10:48
 */

/*
*
* 类的实现层次结构，继承了DisplayImpl类，作为其子类来使用它的三个方法来显示字符串。
* */
public class StringDisplayImpl extends DisplayImpl {
    private String string;
    private int width;

    public StringDisplayImpl(String string) {
        this.string = string;
        this.width = string.getBytes().length;  //以字节单位计算出的字符串的宽度，保存在字段中，以供使用
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|"  + string +  "|");
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine(){
        System.out.print("+");
        for(int i = 0; i < width; i++){
            System.out.print("-");
        }
        System.out.println("+");
    }
}
