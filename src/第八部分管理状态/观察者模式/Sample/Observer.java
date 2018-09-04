package 第八部分管理状态.观察者模式.Sample;

import com.sun.javafx.binding.SelectBinding;

/**
 * author: zzw5005
 * date: 2018/9/4 10:04
 */

/*
* 观察者角色，负责接收来自观察对象的状态变化的通知。为此它声明了update方法。
* */
public interface Observer {
    public abstract void update(NumberGenerator generator);
}
