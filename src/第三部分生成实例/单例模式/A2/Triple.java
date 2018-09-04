package 第三部分生成实例.单例模式.A2;

/**
 * author: zzw5005
 * date: 2018/8/31 20:46
 */


public class Triple {
    private static Triple[] triple = new Triple[]{
            new Triple(0),
            new Triple(1),
            new Triple(2),
    };

    private int id;
    private Triple(int id){
        System.out.println("The instance " + id + " is created.");
        this.id = id;
    }

    public static Triple getInstance(int id){
        return triple[id];
    }

    public String toString(){
        return "[Triple id = " + id + "]";
    }

}
