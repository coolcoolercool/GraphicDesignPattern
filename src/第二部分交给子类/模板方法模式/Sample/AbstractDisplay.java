package 第二部分交给子类.模板方法模式.Sample;

/**
 * author: zzw5005
 * date: 2018/8/31 15:48
 */

/*
* 抽象类，不仅负责实现模板方法，还负责声明在模板方法所使用到的抽象方法。
* */
public abstract class AbstractDisplay {
    public abstract void open();            //交给子类去实现的抽象方法(1) open
    public abstract void print();           //交给子类去实现的抽象方法(2) print
    public abstract void close();           //交给子类去实现的抽象方法(3) close
    public final void display(){            //本抽象类中实现的display方法
        open();
        for(int i = 0; i < 5; i++){         //调用了五次print方法
            print();
        }
        close();
    }
}
