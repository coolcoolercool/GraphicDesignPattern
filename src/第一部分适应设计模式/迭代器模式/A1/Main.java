package 第一部分适应设计模式.迭代器模式.A1;

/**
 * author: zzw5005
 * date: 2018/8/31 10:40
 */


public class Main {
    public static void main(String[] args) {
        //bookShelf采用的是ArrayList动态数组，如果数组容量不够，会进行扩容
        BookShelf bookShelf = new BookShelf(4);

        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));

        bookShelf.appendBook(new Book("East of Eden"));
        bookShelf.appendBook(new Book("Frankenstein"));
        bookShelf.appendBook(new Book("Gulliver's Travels"));
        bookShelf.appendBook(new Book("Hamlet"));

        //这里返回值不是BookShelfIterator类型，而是Iterator类型
        //这样的好处，当BookShelfIterator发生改变的时候，只需要修改BookShelfIterator部分即可，减少其他地方的修改
        //提高了代码的可复用度
        Iterator it = bookShelf.iterator();
        //迭代器的好处:让Iterator过程中遍历与实现分离开，遍历并不依赖对象的如何实现
        while (it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}
