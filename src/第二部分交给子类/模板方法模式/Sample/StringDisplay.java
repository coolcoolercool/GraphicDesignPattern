package 第二部分交给子类.模板方法模式.Sample;

/**
 * author: zzw5005
 * date: 2018/8/31 16:01
 */

/*
* 具体类
* 具体实现抽象类角色中定义的抽象方法。这里实现的方法会在抽象类角色的模板方中被调用
* */
public class StringDisplay extends AbstractDisplay{
    private String string;                               //需要显示的字符串
    private int width;

    public StringDisplay(String string) {
        this.string = string;                           //在构造方法中接受的字符串被保存在字段中
        this.width = string.getBytes().length;          //字符串的字节长度也保存在字段中
    }

    @Override
    public void open() {                                //重写open方法
        printLine();                                    //调用printLine方法画线
    }

    @Override
    public void print() {
        System.out.println("|" + string + "|");         //给保存的在字段中字符串前后分别加上"|"并显示出来
    }

    @Override
    public void close() {
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

