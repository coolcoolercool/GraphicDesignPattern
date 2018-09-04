package 第一部分适应设计模式.迭代器模式.A1;

import java.util.ArrayList;

/**
 * author: zzw5005
 * date: 2018/8/31 10:15
 */

/*
* 具体的集合，负责实现Aggregate角色所定义的接口。它会创建出具体的Iterator角色。
* */
public class BookShelf implements Aggregate{
    private ArrayList books;
    public BookShelf(int initialSize){
        this.books = new ArrayList(initialSize);
    }

    public Book getBookAt(int index){
        return (Book)books.get(index);
    }

    public void appendBook(Book book){
        books.add(book);
    }

    public int getLength(){
        return books.size();
    }

    /**
     * 创建出具体的Iterator角色
     * @return
     */
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
