package 第六部分访问数据结构.职责链模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/3 9:30
 */

/*
 *
 * 它总是返回false，它是一个永远不解决问题的类
 */
public class NoSupport extends Support {
    /**
     * 生成解决问题的实例
     * @param name
     */
    public NoSupport(String name) {
        super(name);
    }

    /**
     * 解决问题的办法，自己什么也不处理
     * @param trouble
     * @return
     */
    @Override
    protected boolean resolve(Trouble trouble) {
        return false;
    }
}
