package 第六部分访问数据结构.职责链模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/3 9:48
 */

/*
* 职责链模式将多个对象组成一条职责链，然后按照他们在职责链上的顺序一个一个找出到底应该谁来负责处理。
* 职责链模式弱化了请求方和处理方之间的关联关系，让双发各自都能成为独立复用的组件。
* 请求者角色，它是第一个具体处理者发送请求的角色。
* */
public class Main {
    public static void main(String[] args) {
        Support alice   = new NoSupport("Alice");
        Support bob     = new LimitSupport("Bob", 100);
        Support charlie = new SpecialSupport("Charlie", 429);
        Support diana   = new LimitSupport("Diana", 200);
        Support elmo    = new OddSupport("Elmo");
        Support fred    = new LimitSupport("Fred", 300);
        //形成职责链
        alice.setNext(bob).setNext(charlie).setNext(diana).setNext(elmo).setNext(fred);
        //制造各种问题
        for (int i = 0; i < 500; i += 33) {
            alice.support(new Trouble(i));
        }
    }
}
