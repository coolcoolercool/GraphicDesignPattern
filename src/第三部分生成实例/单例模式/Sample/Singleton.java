package 第三部分生成实例.单例模式.Sample;

/**
 * author: zzw5005
 * date: 2018/8/31 20:12
 */

/*
* 单例模式的核心思想是构造函数的权限是private，这是为了禁止从Singleton类外部调用构造函数。
* 保证了任何情况下都只能生成一个实例。
* 可以通过getInstance方法，而且这个方式是静态的，static，程序可以从Singleton外部获取Singleton类的唯一实例。
* */
public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton(){
        System.out.println("生成了一个实例");
    }

    //第一次调用getInstance方法时候，Singleton类会被初始化，
    //就是在这个时候，static字符按singleton被初始化，生成了唯一的一个实例
    public static Singleton getInstance(){
        return singleton;
    }
}
