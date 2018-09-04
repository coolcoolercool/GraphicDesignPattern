package 第六部分访问数据结构.职责链模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/3 9:15
 */


public class Trouble {
    private int number;          //问题编号
    public Trouble(int number){  //生成问题
        this.number = number;
    }

    /**
     * 获取问题编号
     * @return
     */
    public int getNumber(){
        return number;
    }

    /**
     * 返回问题编号的字符串
     * @return
     */
    public String toString(){
        return "[Trouble " + number + "]";
    }
}
