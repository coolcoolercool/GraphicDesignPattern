package 第八部分管理状态.状态模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/4 16:12
 */

/*
* 状态角色，定义了根据不同状态进行不同处理的接口。该接口是那些处理内容依赖于状态的方法的集合。
* State接口是一个依赖于状态的方法的集合
* */
public interface State {
    public abstract void doClock(Context context, int hour);  //设置时间
    public abstract void doUse(Context context);               //使用金库
    public abstract void doAlarm(Context context);             //按下警铃
    public abstract void doPhone(Context context);             //正常通话
}
