package 第五部分一致性.装饰者模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/2 20:54
 */

/*
* 具体的装饰物角色，继承了装饰物，具体实现了装饰的方法
* SideBorder是一种具体的装饰边框，是Border的子类。
* SideBorder类用指定的字符装饰字符串的左右两侧
* */
public class SideBorder extends Border {
    private char borderChar;


    protected SideBorder(Display display, char ch) {
        super(display);
        this.borderChar = ch;
    }

    /**
     * 获取横向字符串数的方法
     * 只需要在被装饰物的基础上，加上两侧边框的字符数即可。
     * @return
     */
    public int getColumns(){ //这里使用了委托，若关联关系。将任务转交给被装饰物去处理
        return 1 + display.getColumns() + 1;
    }

    public int getRows(){
        return display.getRows();
    }

    /**
     * 获取参数指定的那一行的字符数，
     * 在display.getRowText(row)的字符串两侧，加上borderChar这个装饰边框即可。
     * @param row
     * @return
     */
    public String getRowText(int row){
        return borderChar + display.getRowText(row) + borderChar;
    }
}
