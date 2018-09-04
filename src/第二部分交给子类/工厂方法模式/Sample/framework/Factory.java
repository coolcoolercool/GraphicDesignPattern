package 第二部分交给子类.工厂方法模式.Sample.framework;

/**
 * author: zzw5005
 * date: 2018/8/31 16:54
 */

/*
* 创建者角色属于框架这一方，负责生成Product角色的抽象类，但是具体的由子类具体的创建者角色决定。
* 创建者对具体的创建者一无所知，他知道只要调用Product角色和生成实例的方法，就可以生成Product的实例。
*
*
* */
public abstract class Factory {
    public final Product create(String owner){
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    //createProduc方法是用于生成实例的方法。不用new关键字来生成实例，而是调用生成实例的专门方法
    //来生成实例，这样就可以防止父类与其他具体类耦合
    protected abstract Product createProduct(String owner);   //生成产品
    protected abstract void registerProduct(Product product); //注册产品

}
