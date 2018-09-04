package 第三部分生成实例.原型模式.Sample;

import 第三部分生成实例.原型模式.Sample.framework.Product;

/**
 * author: zzw5005
 * date: 2018/8/31 21:38
 */

/*
* 与MessageBox几乎一样
* */
public class UnderlinePen implements Product{
    private char ulchar;

    public UnderlinePen(char ulchar){
        this.ulchar = ulchar;
    }

    public void use(String s){
        int length = s.getBytes().length;
        System.out.println("\"" + s + "\"");
        System.out.print(" ");
        for(int i = 0; i < length; i++){
            System.out.print(ulchar);
        }
        System.out.println("");
    }

    public Product createClone(){
        Product p = null;
        try {
            p = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
