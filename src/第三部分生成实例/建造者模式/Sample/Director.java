package 第三部分生成实例.建造者模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/1 10:00
 */

/*
* 监工角色，它负责使用建造者角色的接口来生成实例。它并不依赖于具体建造者角色。
* 为了确保不困具体建造者角色是如何被定义的，监工角色都能正常工作，它只调用在建造者角色中被定义的方法。
* */
public class Director {
    private Builder builder;
    public Director(Builder builder){   //接收的参数并不是Builder类，其实接收的是Builder的实现类
        this.builder = builder;
    }

    public void construct(){              //编写文档
        builder.makeTitle("Greeting");    //标题
        builder.makeString("从早上到下午"); //字符串
        builder.makeItems(new String[] {  //条目
                "早上好。",
                "下午好。",
        });

        builder.makeString("晚上");
        builder.makeItems(new String[]{
                "晚上好。",
                "晚安。",
                "再见",
        });
        builder.close();                  //完成文档
    }
}
