package 第九部分避免浪费.享元模式.Sample;

import java.util.HashMap;

/**
 * author: zzw5005
 * date: 2018/9/4 19:36
 */

/*
* 轻量级工厂模式角色，是生成轻量级角色的工厂。在工厂中生成轻量级角色可以实现共享实例。
* */
public class BigCharFactory {
    private HashMap pool = new HashMap();
    //单例模式
    private static BigCharFactory singleton = new BigCharFactory();

    private BigCharFactory(){}

    public static BigCharFactory getInstance(){
        return singleton;
    }

    /**
     * 生成共享BigChar类的实例，享元模式的核心方法
     * 该方法会生成接收到的字符串所对应的BigChar类的实例。如果发现字符所对应的的实例已经存在，就不会生成新的实例，
     * 而是将之前的那个实例返回给调用者
     * @param charName
     * @return
     */
    public synchronized BigChar getBigChar(char charName){
        //先通过pool.get()方法查找，以调查是否存在接收到的字符所对应的BigChar类的实例。
        //如果返回null，表示目前为止还没有创建该实例，于是它会通过new BigChar(charName)来生成实例，
        //并通过pool.put将该实例放入HashMap中。如果返回值不为null，则会将之前生成的实例返回给调用者
        BigChar bc = (BigChar) pool.get("" + charName);
        if(bc == null){
            bc = new BigChar(charName);
            pool.put("" + charName, bc);
        }
        return bc;
    }
}
