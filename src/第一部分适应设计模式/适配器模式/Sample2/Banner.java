package 第一部分适应设计模式.适配器模式.Sample2;

/**
 * author: zzw5005
 * date: 2018/8/31 14:41
 */

/*
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
