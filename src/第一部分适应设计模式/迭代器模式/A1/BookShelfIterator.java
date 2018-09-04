package 第一部分适应设计模式.迭代器模式.A1;

/**
 * author: zzw5005
 * date: 2018/8/31 10:19
 */

/*
* 具体的迭代器(实现类),负责实现Iterator所定义的接口。
* 集合接口与迭代器接口是对应的，具体的集合类与具体的迭代器也是对应的
* 比如，如果BookShelf的实现发生了变化，即getBookAt()方法发生变化的时候，必须修改BookShelfIterator类
* */
public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf){
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    /**
     * 确认下面是否可调用next方法
     * @return
     */
    @Override
    public boolean hasNext() {
        if(index < bookShelf.getLength())
            return true;
        else
            return false;
    }

    /**
     * 返回当前元素，并指向下一个元素
     * @return
     */
    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
