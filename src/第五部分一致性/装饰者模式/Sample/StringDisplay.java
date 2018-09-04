package 第五部分一致性.装饰者模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/2 20:42
 */

/*
 * 具体的零件的角色，实现零件角色所定义的接口的具体蛋糕。
 * StringDisplay是用于显示单行字符串的类
 */
public class StringDisplay extends Display {
    private String string;
    public StringDisplay(String string){
        this.string = string;
    }

    /**
     * 字符数
     * @return
     */
    @Override
    public int getColumns() {
        return string.getBytes().length;
    }

    /**
     * 因为显示的是单行字符串，所以行数固定是1
     * @return
     */
    @Override
    public int getRows() {
        return 1;
    }

    /**
     * 仅当要获取第0行的内容的时候才会返回string字符串
     * @param row
     * @return
     */
    @Override
    public String getRowText(int row) {
        if(row == 0)
            return string;
        else
            return null;
    }
}
