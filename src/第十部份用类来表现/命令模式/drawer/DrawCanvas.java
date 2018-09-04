package 第十部份用类来表现.命令模式.drawer;

import 第十部份用类来表现.命令模式.command.MacroCommand;

import java.awt.*;

/**
 * author: zzw5005
 * date: 2018/9/4 21:28
 */

/*
* 接收者角色，是命令角色执行命令时的对象，也可以称其为命令接收者。
* */
public class DrawCanvas extends Canvas implements Drawable {
    // 颜色
    private Color color = Color.red;
    // 要绘制的圆点的半径
    private int radius = 6;
    // 命令的历史记录的集合
    private MacroCommand history;
    // 构造函数
    public DrawCanvas(int width, int height, MacroCommand history) {
        setSize(width, height);
        setBackground(Color.white);
        this.history = history;
    }
    // 重新全部绘制
    public void paint(Graphics g) {
        history.execute();
    }
    // 绘制
    public void draw(int x, int y) {
        Graphics g = getGraphics();
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}
