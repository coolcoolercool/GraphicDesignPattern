package 第六部分访问数据结构.访问者模式.Sample;

import java.util.Iterator;

/**
 * author: zzw5005
 * date: 2018/9/2 22:32
 */

/*
* 具体访问者角色，负责实现Visitor角色所定义的接口。它要实现现有visit方法，
* 即实现如何处理每个具体元素角色。
* ListVisitor是Visitor类的子类，作用是访问数据结构并显示所有元素。
* 这里其实在访问Directory的过程中，accept方法和visit方法之间相互递归调用
* */
public class ListVisitor extends Visitor {
    private String currentDir = "";                           //当前访问的文件夹的名字

    @Override
    public void visit(File file) {                            //在访问文件时被调用
        System.out.println(currentDir + "/" + file);
    }

    /**
     * 对于Directory类的实例要进行的处理。
     * @param directory
     */
    @Override
    public void visit(Directory directory) {                  //在访问文件夹的时候被调用
        System.out.println(currentDir + "/" + directory);     //先显示文件夹的名字
        String savedDir = currentDir + "/" + directory.getName();
        Iterator it = directory.iterator();                   //调用iterator方法来来获取文件夹的Iterator
        while(it.hasNext()){                                  //通过Iterator遍历文件夹中的所有目录条目
            Entry entry = (Entry) it.next();
            entry.accept(this);                               //调用各自的accept的方法
        }
        currentDir = savedDir;
    }
}
