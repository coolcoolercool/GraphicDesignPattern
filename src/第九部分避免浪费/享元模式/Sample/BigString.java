package 第九部分避免浪费.享元模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/4 19:49
 */

/*
* 请求者角色，使用轻量级工厂角色来生成轻量级角色。
* */
public class BigString {
    //大型字符的数组
    private BigChar[] bigChars;
    //构造函数
    public BigString(String string){
        bigChars = new BigChar[string.length()];
        BigCharFactory factory = BigCharFactory.getInstance();
        for(int i = 0; i < bigChars.length; i++){
            //这里没有直接new出一个实例，而是使用了BigCharFactory方法，也就是享元模式的核心方法
            bigChars[i] = factory.getBigChar(string.charAt(i));
        }
    }
    //显示
    public void print(){
        for(int i = 0; i < bigChars.length; i++){
            bigChars[i].print();
        }
    }
}
