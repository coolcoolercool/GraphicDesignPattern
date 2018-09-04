package 第八部分管理状态.状态模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/4 16:13
 */

/*
* 上下文角色，持有表示当前状态的具体状态角色。它还定义了共外部调用者使用状态模式的接口。
* */
public interface Context {
    public abstract void setClock(int hour);
    public abstract void changeState(State state);
    public abstract void callSecurity(String msg);
    public abstract void recordLog(String msg);
}
