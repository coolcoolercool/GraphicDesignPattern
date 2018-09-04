package 第三部分生成实例.抽象工厂模式.Sample;

import 第三部分生成实例.抽象工厂模式.Sample.factory.Factory;
import 第三部分生成实例.抽象工厂模式.Sample.factory.Link;
import 第三部分生成实例.抽象工厂模式.Sample.factory.Page;
import 第三部分生成实例.抽象工厂模式.Sample.factory.Tray;
import 第三部分生成实例.抽象工厂模式.Sample.listfactory.ListFactory;

/**
 * author: zzw5005
 * date: 2018/9/2 9:15
 */

/*
* 抽象工厂模式就是将抽象零件组装成抽象产品。
* 委托者角色，它仅会调用抽象工厂角色和抽象产品角色的接口来进行工作，对于具体的零件、产品和工厂一无所知。
* */
public class Main {
    public static void main(String[] args) {
        /*if(args.length != 1){
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Example 1: java Main listfactory.ListFactory");
            System.out.println("Example 2: java Main tablefactory.TableFactory");
            System.exit(0);
        }*/

        /*String[] array = {"java Main listfactory.ListFactory",
                "java Main tablefactory.TableFactory"};*/

        //使用getFactory方法生成该参数对应的工厂，并将其保存在factory变量中
        Factory factory = new ListFactory();

        //使用factory生成Link和Tray
        Link people = factory.createLink("人民日报", "http://www.people.com.cn/");
        Link gmw = factory.createLink("光明日报", "http://www.gmw.cn/");

        Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
        Link jp_yahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp/");
        Link excite = factory.createLink("Excite", "http://www.excite.com/");
        Link google = factory.createLink("Google", "http://www.google.com/");

        Tray traynews = factory.createTray("日报");
        traynews.add(people);
        traynews.add(gmw);

        Tray trayyahoo = factory.createTray("Yahoo!");
        trayyahoo.add(us_yahoo);
        trayyahoo.add(jp_yahoo);

        Tray traysearch = factory.createTray("检索引擎");
        traysearch.add(trayyahoo);
        traysearch.add(excite);
        traysearch.add(google);

        //将生成的Link和Tray放入Page中
        Page page = factory.createPage("LinkPage", "杨文轩");
        page.add(traynews);
        page.add(traysearch);
        page.output();
    }


}
