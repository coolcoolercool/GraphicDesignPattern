package 第六部分访问数据结构.职责链模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/3 9:45
 */


public class SpecialSupport extends Support {
    private int number;                          //只能解决指定编号的问题
    public SpecialSupport(String name, int number){
        super(name);
        this.number = number;
    }

    /**
     * 解决问题的办法，只解决指定编号的问题
     * @param trouble
     * @return
     */
    @Override
    protected boolean resolve(Trouble trouble) {
        if(trouble.getNumber() == number){
            return true;
        }else {
            return false;
        }
    }
}
