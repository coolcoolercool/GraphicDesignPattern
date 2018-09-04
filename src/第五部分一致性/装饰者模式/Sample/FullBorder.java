package 第五部分一致性.装饰者模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/2 21:02
 */

/*
*
* 给字符串的上下左右都加上装饰边框
* */
public class FullBorder extends Border {
    protected FullBorder(Display display) {
        super(display);
    }

    public int getColumns(){
        return 1 + display.getColumns() + 1;
    }

    /**
     * 返回字符串的字符数
     * 字符数为被装饰的字符数加上两侧边框字符数
     * @return
     */
    public int getRows(){
        return 1 + display.getRows() + 1;
    }

    public String getRowText(int row){
        if(row == 0){                             //下边框
            return "+" + makeLine('-', display.getColumns()) + "+";
        }else if(row == display.getRows() + 1){   //上边框
            return "+" + makeLine('-', display.getColumns()) + "+";
        }else{                                    //其他边框
            return "|" + display.getRowText(row - 1) + "|";
        }
    }

    /**
     * 连续count次地显示某个指定的字符ch
     * @param ch
     * @param count
     * @return
     */
    private String makeLine(char ch, int count){
        StringBuffer buf = new StringBuffer();
        for(int i = 0; i < count; i++){
            buf.append(ch);
        }
        return buf.toString();
    }
}
