package 第五部分一致性.合成模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/2 19:38
 */

/*
* 树叶角色，表示内容，该角色不能放入其他对象中。
* File类是表示文件的类，他是Entry类的子类
* */
public class File extends Entry {
    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }
}
