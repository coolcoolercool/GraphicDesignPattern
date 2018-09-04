package 第七部分简单化.调停者模式.Sample;

import java.awt.*;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

/**
 * author: zzw5005
 * date: 2018/9/3 16:49
 */


public class ColleagueTextField extends TextField implements TextListener, Colleague {
    private Mediator mediator;
    public ColleagueTextField(String text, int columns){
        super(text, columns);
    }

    /**
     * 设置组件的启用或者禁用
     * @param enabled
     */
    @Override
    public void setColleagueEnabled(Boolean enabled) {
        setEnabled(enabled);
        setBackground(enabled ? Color.white : Color.lightGray);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 当文字发生变化的时候，通知仲裁者
     * @param e
     */
    @Override
    public void textValueChanged(TextEvent e) {
        mediator.colleagueChanged();
    }
}
