package 第九部分避免浪费.代理模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/4 20:23
 */

/*
* 主体角色，定义了使代理角色与实际的主主体角色之间具有一致性的接口。
* 由于存在主体角色，所以请求者角色不必不在使用的究竟是代理角色还是真的主体角色。
* */
public interface Printable {
    public abstract void setPrinterName(String name); //设置名字
    public abstract String getPrinterName();          //获取名字
    public abstract void print(String string);        //显示文字(打印输出)
}
