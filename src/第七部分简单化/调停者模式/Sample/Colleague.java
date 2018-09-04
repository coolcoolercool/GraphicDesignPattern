package 第七部分简单化.调停者模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/3 16:41
 */

/*
* 同事角色，负责是定义与找仲裁者进行通信的接口。
* */
public interface Colleague {
    //设置仲裁者
    public abstract void setMediator(Mediator mediator);
    //告知组员仲裁者所下达的指示。true，就是启用状态; false，就是禁用状态
    public abstract void setColleagueEnabled(Boolean enabled);
}
