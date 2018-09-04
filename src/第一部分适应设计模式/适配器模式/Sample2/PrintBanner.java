package 第一部分适应设计模式.适配器模式.Sample2;

/**
 * author: zzw5005
 * date: 2018/8/31 15:04
 */

/*
* 使用委托的示例程序
* PrintBanner类中的banner字段中保存了Banner类的实例。该实例实在PrintBanner类的构造器中生成的。
* 然后，printWeak方法和printStrong方法会通过banner字段调用Banner类的showWithParen和showWithAster方法。
*
* 当printBanner类的printWeak和printStrong方法被调用的时候，并不是PrintBanner自己进行处理，
* 而是将处理交给了Banner类的实例的showWithParen方法
* */
public class PrintBanner extends Print {
    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);   //生成了Banner的实例
    }

    @Override
    public void printWeak() {
        banner.showWithParen();             //通过字段调用方法
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
