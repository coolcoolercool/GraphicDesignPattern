package 第六部分访问数据结构.职责链模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/3 9:32
 */

/*
* 具体处理者的角色
* */
public class LimitSupport extends Support {
    private int limit;             //可以解决编号小于limit的问题

    /**
     * 构造函数，生成解决问题的实例
     * @param name
     * @param limit
     */
    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    /**
     * 解决问题的办法
     * @param trouble
     * @return
     */
    @Override
    protected boolean resolve(Trouble trouble) {
        if(trouble.getNumber() < limit){
            return true;
        }else{
            return false;
        }
    }
}
