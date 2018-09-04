package 第五部分一致性.合成模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/2 17:20
 */

/*
* 使树叶角色和复合物角色具有一致性的零件角色。零件角色是树叶角色和复合物角色的父类。
* 这也是合成的模式的核心所在。
* Entry类是一个表示目录条的抽象类。
* */
public abstract class Entry {
    public abstract String getName();
    public abstract int getSize();

    public Entry add(Entry entry) throws FileTreatmentException{  //加入目录条目
        throw new FileTreatmentException();
    }

    /**
     * 用于显示文件加中的内容
     */
    public void printList(){
        printList("");
    }

    protected abstract void printList(String prefix);      //为显示目录添加前缀

    public String toString(){
        return getName() + " (" + getSize() + ")";
    }
}
