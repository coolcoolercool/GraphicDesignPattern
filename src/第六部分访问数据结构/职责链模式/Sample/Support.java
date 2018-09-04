package 第六部分访问数据结构.职责链模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/3 9:19
 */

/*
* 处理者角色，负责处理请求的接口。处理者角色知道下一个处理者是谁，如果自己无法处理请求，
* 它会将请求转给下一个处理者。下一个处理者同样也是处理者角色，具有处理者的功能
* */
public abstract class Support {
    private String name;    //解决问题的实例的名字
    private Support next;   //要推卸给的对象

    /**
     * 生成解决问题的实例
     * @param name
     */
    public Support(String name){
        this.name = name;
    }

    /**
     * 设置要推卸给的对象
     * @param next
     * @return
     */
    public Support setNext(Support next){
        this.next = next;
        return next;
    }

    /**
     * 解决问题的步骤
     * @param trouble
     */
    public final void support(Trouble trouble){
        if(resolve(trouble)){
            done(trouble);
        }else if(next != null){     //这一步很关键，如果职责链上还有下一个对象，就将问题推卸给下一个对象处理
            next.support(trouble);
        }else{  //如果下一个对象为null，但是问题仍然没有被解决，则表示问题解决失败
            fail(trouble);
        }
    }

    protected abstract boolean resolve(Trouble trouble);    //解决问题的办法

    protected void done(Trouble trouble){                   //解决
        System.out.println(trouble + " is resolve by " + this + ".");
    }

    protected void fail(Trouble trouble){                   //未解决
        System.out.println(trouble + " cannot be resolved. ");
    }

    public String toString(){
        return "[" + name + "]";
    }
}
