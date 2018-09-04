package 第三部分生成实例.抽象工厂模式.Sample.factory;

/**
 * author: zzw5005
 * date: 2018/9/1 15:05
 */


public abstract class Item {
    protected String caption;
    public Item(String caption){
        this.caption = caption;
    }

    /**
     * 需要子类实现这个方法，该方法返回HTML文件的内容
     * @return
     */
    public abstract String makeHTML();
}
