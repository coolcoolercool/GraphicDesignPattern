package 第八部分管理状态.调停者模式.Sample;

import 第八部分管理状态.调停者模式.Sample.game.Gamer;
import 第八部分管理状态.调停者模式.Sample.game.Memento;

/**
 * author: zzw5005
 * date: 2018/9/4 15:05
 */

/*
* 在面向对象编程的时候方法实现撤销功能的时候，需要是事先保存实例的相关状态信息。在撤销的时候，该需要根据所保存的信息
* 将实例恢复至原来的状态。这就是调停者模式
*
* 负责人角色，当它想要保存当前的生成者角色的状态的时候，会通知生成者角色。生成者角色在接收到通知后会生成
* 纪念品角色的实例，并将其返回给负责人角色。由于以后可能会用纪念品角色实例，来将生成者角色恢复至原来的状态，
* 因此负责人角色会一直保存纪念品角色实例。
* */
public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();

        for(int i = 0; i < 100; i++){
            System.out.println("===== " + i);             //显示掷骰子的次数
            System.out.println("当前状态: " + gamer);       //显示主人公现在的状态
            gamer.bet();                                  //进行掷骰子的游戏

            System.out.println("所持有的金钱为: " + gamer.getMoney() + " 元。");
            if(gamer.getMoney() > memento.getMoney()){
                System.out.println("   (所持有的金钱增加了许多，因此保存游戏当前状态。)");
                memento = gamer.createMemento();
            }else if(gamer.getMoney() < memento.getMoney() / 2){
                System.out.println("   (所持有的金钱减少了许多，因此将游戏恢复至以前的状态。)");
                gamer.restoreMemento(memento);
            }

            //等待一段时间
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("");
        }
    }

}
