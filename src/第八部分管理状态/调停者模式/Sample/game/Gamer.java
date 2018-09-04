package 第八部分管理状态.调停者模式.Sample.game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * author: zzw5005
 * date: 2018/9/4 11:20
 */

/*
* 生成者角色，会保存自己的最新状态时生成Memento角色。把以前保存的Memento角色传递给生成者角色，
* 它会将自己恢复成该Memento角色时的状态
* */
public class Gamer {
    private int money;
    private List fruits = new ArrayList();
    private Random random = new Random();
    private static String[] fruitsName = {
            "苹果","葡萄","香蕉","橘子",
    };
    public Gamer(int money){
        this.money = money;
    }

    public int getMoney(){
        return money;
    }

    public void bet(){
        int dice = random.nextInt(6) + 1;
        if(dice == 1){
            money += 100;
            System.out.println("所持有的金钱增加了。");
        }else if(dice == 2){
            money /= 2;
            System.out.println("所持有的金钱减半了。");
        }else if(dice == 6 || dice == 5 || dice == 4){
            String f = getFruit();
            System.out.println("获得了水果(" + f + ").");
            fruits.add(f);
        }else {
            System.out.println("什么都没有发生。");
        }
    }

    /**
     * 保存当前的状态(快照拍摄)。根据当前在时间点所持有的金钱和水果生成一个Memento类的实例
     * @return
     */
    public Memento createMemento(){
        Memento m = new Memento(money);
        Iterator iterator = fruits.iterator();
        while(iterator.hasNext()){
            String f = (String) iterator.next();
            if(f.startsWith("好吃的")){
                m.addFruit(f);
            }
        }
        return m;
    }

    /**
     * 根据接收到的Memento类的实例来将Gamer类恢复到以前的状态
     * @param memento
     */
    public void restoreMemento(Memento memento){
        this.money = money;
        this.fruits = memento.getFruits();
    }

    private String getFruit(){
        String prefix = "";
        if(random.nextBoolean()){
            prefix = "好吃的";
        }
        return prefix + fruitsName[random.nextInt(fruitsName.length)];
    }

    public String toString(){
        return "[money = " + money + ", fruits = " + fruits + "]";
    }
}
