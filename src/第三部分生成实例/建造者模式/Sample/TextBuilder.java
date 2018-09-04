package 第三部分生成实例.建造者模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/1 10:07
 */

/*
* 具体的建造者角色。它负责实现Builder角色的接口类，定义了在生成实例时候实际被调用的方法。
* 它还定义了获取最终生成的结果的方法
* */
public class TextBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();   //文档内容保存在该字段中
    public void makeTitle(String title){                //纯文本的标题
        buffer.append("=====================\n");
        buffer.append("[" + title + "] \n");
        buffer.append("\n");
    }
    public void makeString(String str){
        buffer.append(" " +'■' + " " + str + "\n");
        buffer.append("\n");
    }

    public void makeItems(String[] items){
        for(int i = 0; i < items.length; i++){
            buffer.append("　・" + items[i] + "\n");
        }
        buffer.append("\n");
    }

    public void close(){
        buffer.append("======================\n");
    }

    public String getResult(){
        return buffer.toString();
    }
}
