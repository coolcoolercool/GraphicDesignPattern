package 第六部分访问数据结构.职责链模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/3 9:35
 */


public class OddSupport extends Support {
    /**
     * 构造函数,生成解决问题的实例
     * @param name
     */
    public OddSupport(String name) {
        super(name);
    }

    /**
     * 解决问题的办法，如果问题编号是奇数，就进行处理，如果是偶数，就推卸给其他对象
     * @param trouble
     * @return
     */
    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}
