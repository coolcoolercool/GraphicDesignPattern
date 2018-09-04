package 第六部分访问数据结构.访问者模式.Sample;



/*
* 在访问者模式中，数据结构与处理被分离开来。我们编写一个表示访问者的类来访问数据结构中的元素，
* 并把对各元素的处理交给访问者类。这样，当需要增加新的处理的时候，我们只需要编写新的访问者，然后让数据结构
* 可以接收到访问者的访问即可。
* */
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Making root entries...");
            Directory rootdir = new Directory("root");
            Directory bindir = new Directory("bin");
            Directory tmpdir = new Directory("tmp");
            Directory usrdir = new Directory("usr");
            rootdir.add(bindir);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);
            bindir.add(new File("vi", 10000));
            bindir.add(new File("latex", 20000));
            rootdir.accept(new ListVisitor());              

            System.out.println("");
            System.out.println("Making user entries...");
            Directory yuki = new Directory("yuki");
            Directory hanako = new Directory("hanako");
            Directory tomura = new Directory("tomura");
            usrdir.add(yuki);
            usrdir.add(hanako);
            usrdir.add(tomura);
            yuki.add(new File("diary.html", 100));
            yuki.add(new File("Composite.java", 200));
            hanako.add(new File("memo.tex", 300));
            tomura.add(new File("game.doc", 400));
            tomura.add(new File("junk.mail", 500));
            rootdir.accept(new ListVisitor());              
        } catch (FileTreatmentException e) {
            e.printStackTrace();
        }
    }
}
