package 第二部分交给子类.模板方法模式.Sample;

/**
 * author: zzw5005
 * date: 2018/8/31 15:54
 */

/*
* 具体类
* */
public class CharDisplay extends AbstractDisplay {
    private char ch;                  //需要显示的字符
    public CharDisplay(char ch){      //构造器中接受的字符被保存在字段中
        this.ch = ch;
    }

    @Override
    public void open() {             //在父类是抽象方法，此处重写该方法 显示开始字符"<<"
        System.out.print("<<");
    }

    @Override
    public void print() {            //将父类的抽象方法重写print方法，该方法在display中多次被调用
        System.out.print(ch);      //显示保存在字段ch中的字符
    }

    @Override
    public void close() {            //重写close方法
        System.out.println(">>");    //显示结束字符">>"
    }

}
