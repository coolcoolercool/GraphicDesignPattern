package 第一部分适应设计模式.适配器模式.Sample1;

/**
 * author: zzw5005
 * date: 2018/8/31 14:41
 */

/*
* 需要适配的角色，一个持有既定方法的角色
* 实际情况
* */
public class Banner {
    private String string;
    public Banner(String string){
        this.string = string;
    }

    public void showWithParen(){
        System.out.println("(" + string + ")");
    }

    public void showWithAster(){
        System.out.println("*" + string + "*");
    }
}
