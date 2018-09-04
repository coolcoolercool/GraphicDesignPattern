package 第七部分简单化.调停者模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/3 16:37
 */

/*
* 仲裁者角色，负责定义Colleague角色进行通信和做出决定的接口。
* */
public interface Mediator {
    //用于生成仲裁者要管理的组员
    public abstract void createColleagues();
    //该方法会被各个组员角色调用，作用是让组员可以向仲裁者进行报告。
    public abstract void colleagueChanged();
}
