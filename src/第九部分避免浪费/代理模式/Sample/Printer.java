package 第九部分避免浪费.代理模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/4 20:22
 */

/*
* 实际的主体角色，会在代理人角色无法胜任工作的时候出场。它与代理人角色一样，也实现了主体角色中定义的接口。
* */
public class Printer implements Printable{
    private String name;
    //两个重载的构造函数
    public Printer(){
        heavyJob("正在生成Printer的实例");
    }
    public Printer(String name){
        this.name = name;
        heavyJob("正在生成Printer的实例(" + name + ")");
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    /**
     * 显示待打印机名字文字
     * @param string
     */
    @Override
    public void print(String string) {
        System.out.println("===" + name + "===");
        System.out.println(string);
    }

    /**
     * 重活
     * @param msg
     */
    private void heavyJob(String msg){
        System.out.print(msg);
        for(int i = 0; i < 5; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(".");
        }
        System.out.println("结束。");
    }
}
