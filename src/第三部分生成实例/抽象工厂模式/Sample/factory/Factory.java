package 第三部分生成实例.抽象工厂模式.Sample.factory;

/**
 * author: zzw5005
 * date: 2018/9/2 9:04
 */

/*
* 抽象工厂角色，负责定义用于生成抽象产品的接口。
* */
public abstract class Factory {
    public static Factory getFactory(String className){
        Factory factory = null;
        try {
            //使用Class类forName方法动态获取类信息，接着使用newInstance方法生成该类的实例，并将其作为返回值返回给调用者，
            //类型是抽象工厂模式
            factory = (Factory)Class.forName(className).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("没有找到 " + className + "  类。");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }

    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title, String author);
}
