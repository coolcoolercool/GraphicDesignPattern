package 第七部分简单化.调停者模式.Sample;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * author: zzw5005
 * date: 2018/9/4 9:12
 */


public class ColleagueCheckBox extends Checkbox implements ItemListener,Colleague {
    private Mediator mediator;

    public ColleagueCheckBox(String caption, CheckboxGroup group, boolean state){
        super(caption,group, false);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 设置禁用或者启用的通知
     * @param enabled
     */
    @Override
    public void setColleagueEnabled(Boolean enabled) {
        setEnabled(enabled);
    }

    /**
     * 当状态发生变化的时候通知Mediator，捕获单选按钮的状态变化
     * @param e
     */
    @Override
    public void itemStateChanged(ItemEvent e) {
        mediator.colleagueChanged();
    }
}
