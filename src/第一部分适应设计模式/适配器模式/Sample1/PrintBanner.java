package 第一部分适应设计模式.适配器模式.Sample1;

/**
 * author: zzw5005
 * date: 2018/8/31 14:45
 */

/*
* 适配的角色，使用被适配的角色(Banner)的方法来满足对象的需求
* 适配器(包装器)。它继承了Banner类并实现了需求--print接口
* */
public class PrintBanner extends Banner implements Print{
    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
