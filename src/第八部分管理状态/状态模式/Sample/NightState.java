package 第八部分管理状态.状态模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/4 16:22
 */

/*
* 表示晚上的状态，使用了单例模式
* */
public class NightState implements State {
    private static NightState singleton = new NightState();
    private NightState(){}

    public static State getInstance(){
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if(9 <= hour && hour < 17){
            context.changeState(DayState.getInstance());
        }
    }

    /**
     * 使用金库
     * @param context
     */
    @Override
    public void doUse(Context context) {
        context.callSecurity("紧急: 晚上使用金库！");
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurity("按下警铃(晚上)");
    }

    /**
     * 正常通话
     * @param context
     */
    @Override
    public void doPhone(Context context) {
        context.recordLog("晚上的通话记录");
    }

    public String toString(){
        return "[晚上]";
    }
}
