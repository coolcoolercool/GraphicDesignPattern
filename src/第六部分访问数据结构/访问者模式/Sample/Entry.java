package 第六部分访问数据结构.访问者模式.Sample;

import java.util.Iterator;

/**
 * author: zzw5005
 * date: 2018/9/2 21:56
 */


public abstract class Entry implements Element {
    public abstract String getName();
    public abstract int getSize();

    /**
    * 因为add方法只对Directory类有效，因此在Entry类中，让它简单的报错即可。
    * */
    public Entry add(Entry entry) throws FileTreatmentException{
        throw new FileTreatmentException();
    }
    /**
     * 因为iterator方法只对Directory类有效，因此在Entry类中，让它简单的报错即可。
     * */
    public Iterator iterator() throws FileTreatmentException{
        throw new FileTreatmentException();
    }

    public String toString(){
        return getName() + " (" + getSize() + ")";
    }
}
