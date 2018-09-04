package 第八部分管理状态.观察者模式.Sample;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * author: zzw5005
 * date: 2018/9/4 10:08
 */

/*
* 观察对象角色，定义了注册观察者和删除观察者的方法。此外，它还声明了获取现在的状态的方法。
* */
public abstract class NumberGenerator {
    private ArrayList observers = new ArrayList();

    /**
     * 注册Observer
     * @param observer
     */
    public void addObserver(Observer observer){
        observers.add(observer);
    }

    /**
     * 删除Observer
     * @param observer
     */
    public void deleteObserver(Observer observer){
        observers.remove(observer);
    }

    /**
     * 向Observer发送通知
     */
    public void notifyObservers(){
        Iterator iterator = observers.iterator();
        while(iterator.hasNext()){
            Observer o = (Observer) iterator.next();
            //调用Observer的update方法，通知观察者
            o.update(this);
        }
    }

    public abstract int getNumber();
    public abstract void execute();


}
