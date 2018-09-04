package 第八部分管理状态.状态模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/4 16:19
 */

/*
* 具体的状态角色，它实现了State接口。
* */
public class DayState implements State {
    private static DayState singleton = new DayState();
    private DayState(){}                //构造函数的可见性是private

    public static State getInstance(){  //获得唯一实例，这里其实使用了单例模式
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if(hour < 9 || 17 <= hour){
            context.changeState(NightState.getInstance());
        }
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("使用金库(白天)");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurity("按下警铃(白天)");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurity("正常通话(白天)");
    }

    public String toString(){
        return "[白天]";
    }
}
