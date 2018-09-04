package 第十部份用类来表现.命令模式.command;

import java.util.Iterator;
import java.util.Stack;

/**
 * author: zzw5005
 * date: 2018/9/4 21:16
 */

/*
* 具体的命令角色，负责实现在命令角色中定义的接口。
* */
public class MacroCommand implements Command{
    private Stack commands = new Stack(); //命令的集合

    @Override
    public void execute() {
        Iterator it = commands.iterator();
        while(it.hasNext()){
            ((Command)it.next()).execute();
        }
    }

    //添加命令
    public void append(Command cmd){
        if(cmd != this){
            commands.push(cmd);
        }
    }

    //删除最后一条命令
    public void undo(){
        if(!commands.empty()){
            commands.pop();
        }
    }

    //删除所有命令
    public void clear(){
        commands.clear();
    }
}
