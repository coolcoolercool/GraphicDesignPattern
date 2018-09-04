package 第七部分简单化.调停者模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/4 9:31
 */

/*
* 仲裁者，当发生涉及全体组员的事情时候，通知仲裁者。当仲裁者下达指示的时候，组员会立即执行。
* 团队组员之间不在互相沟通并私自做出决定，而是发生任何事情都向仲裁者报告。
* 另一方面，仲裁者站在整个团队的角度上对组员上报的事情做出决定。这就是仲裁者模式
* */
public class Main {
    public static void main(String[] args) {
        new LoginFrame("Mediator Sample");
    }
}
