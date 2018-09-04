package 第八部分管理状态.调停者模式.Sample.game;

import java.util.ArrayList;
import java.util.List;

/**
 * author: zzw5005
 * date: 2018/9/4 11:13
 */

/*
* 纪念品角色，将生成者角色的内部信息整合在一起。纪念品角色中虽然保存了生成者角色的信息，但它不会向外部公开这些信息。
* 纪念品角色有以下两种接口。
* 1.宽接口
* 纪念品角色提供宽接口是指所有用于获取恢复对象状态信息的方法的集合。由于宽接口会暴露所有纪念品的内部信息，
* 因此ke'yi shi用宽接口的只有生成者角色
* 2.窄接口
* 纪念品角色为外部的负责人角色提供了窄接口。可以通过窄接口获取的纪念品的内部信息非常有限，因此可以有效地防止信息泄露。
* */
public class Memento {
    int money;          //所持有的金钱
    ArrayList fruits;   //获得的水果

    public int getMoney(){
        return money;
    }
    //构造函数，这里的权限是包权限，在包外的Main类是无法调用Memento的构造器的，也就无法new出Memento的实例
    Memento(int money){
        this.money = money;
        this.fruits = new ArrayList();
    }
    //获取水果
    void addFruit(String fruit){
        fruits.add(fruit);
    }
    //获取当前所持有的水果
    List getFruits(){
        return (List) fruits.clone();
    }
}
