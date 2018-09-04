package 第九部分避免浪费.代理模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/4 20:34
 */

/*
* 代理人角色，会尽量处理来自请求者角色的请求。只有当自己不能处理的时候，才会将工作交给实际的主体角色。
* 代理人角色只有在必要的时候才会生成实际的主体角色。代理人角色实现了主体角色中定义的接口。
* */
public class PrinterProxy implements Printable{
    private String name;
    private Printer real;

    //构造函数
    public PrinterProxy(){}
    public PrinterProxy(String name){
        this.name = name;
    }

    @Override
    public synchronized void setPrinterName(String name) {
        if(real != null){
            real.setPrinterName(name);  //同时设置本人的名字
        }
        this.name = name;
    }

    /**
     * 获取打印机的名字
     * @return
     */
    @Override
    public String getPrinterName() {
        return name;
    }

    /**
     * 显示
     * @param string
     */
    @Override
    public void print(String string) {
        realize();
        real.print(string);
    }

    /**
     * 生成Printer的实例
     */
    private synchronized void realize(){
        if(real == null){
            real = new Printer(name);
        }
    }
}
