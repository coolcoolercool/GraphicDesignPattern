package 第十部份用类来表现.命令模式.drawer;

import 第十部份用类来表现.命令模式.command.Command;

import java.awt.*;

/**
 * author: zzw5005
 * date: 2018/9/4 21:23
 */


public class DrawCommand implements Command {
    protected Drawable drawable;
    private Point position;
    public DrawCommand(Drawable drawable, Point position){
        this.drawable = drawable;
        this.position = position;
    }

    @Override
    public void execute() {
        drawable.draw(position.x, position.y);
    }
}
