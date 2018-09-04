package 第五部分一致性.装饰者模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/2 20:30
 */

/*
* 零件角色，增加功能的核心角色。装饰前的蛋糕就是零件角色，它只是定义了蛋糕的接口。
* */
public abstract class Display {
    public abstract int getColumns();           //获取横向字符数
    public abstract int getRows();              //获取纵向行数
    public abstract String getRowText(int row); //获取地row行字符串

    /**
     * 显示所有行的字符串的方法
     */
    public final void show(){
        for(int i = 0; i < getRows(); i++){
            System.out.println(getRowText(i));
        }
    }

}
