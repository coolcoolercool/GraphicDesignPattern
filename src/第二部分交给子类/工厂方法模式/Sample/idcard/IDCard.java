package 第二部分交给子类.工厂方法模式.Sample.idcard;

import 第二部分交给子类.工厂方法模式.Sample.framework.Product;

/**
 * author: zzw5005
 * date: 2018/8/31 16:58
 */

/*
* 具体的产品属于具体加工这一方，它决定了具体的产品。
* */
public class IDCard extends Product {
    private String owner;

    IDCard(String owner){
        System.out.println("制作 " + owner + " 的ID卡。");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用 " + owner + " 的ID卡");
    }

    public String getOwner(){
        return owner;
    }
}
