package 第七部分简单化.调停者模式.Sample;

import java.awt.*;

/**
 * author: zzw5005
 * date: 2018/9/3 16:45
 */

/*
* 具体的同事角色，负责实现Colleague角色的接口。
* */
public class ColleagueButton extends Button implements Colleague {
    private Mediator mediator;
    public ColleagueButton(String caption){
        super(caption);
    }

    /**
     * 保存仲裁者对象的实例。
     * @param mediator
     */
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 设置禁用或者启用组件
     * @param enabled
     */
    @Override
    public void setColleagueEnabled(Boolean enabled) {
        setEnabled(enabled);
    }
}
