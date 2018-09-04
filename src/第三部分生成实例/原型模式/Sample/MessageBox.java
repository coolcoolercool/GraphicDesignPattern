package 第三部分生成实例.原型模式.Sample;

import 第三部分生成实例.原型模式.Sample.framework.Product;

/**
 * author: zzw5005
 * date: 2018/8/31 21:21
 */

/*
* 消息框
* 具体的原型角色，它负责实现复制现有实例并生成新实例的方法
* */
public class MessageBox implements Product {
    private char decochar;   //decochar字段保存的是像装饰方框那样的环绕字符串的字符

    public MessageBox(char decochar){
        this.decochar = decochar;
    }

    /**
     * 使用decochar字符中保存的字符把显示的字符串框起来
     * @param s
     */
    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        for(int i= 0; i < length + 4; i++){
            System.out.print(decochar);
        }

        System.out.println("");
        System.out.println(decochar + "  " + s + " " + decochar);
        for(int i = 0; i < length + 4; i++){
            System.out.print(decochar);
        }
        System.out.println("");
    }

    /**
     * 用于复制自己
     * 只有类自己或者它的子类能够调用Java中clone方法。当其他类要求复制实例时候，必须先调用createClone方法，
     * 然后在该方法的内部调用clone方法
     * @return
     */
    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
