package 第五部分一致性.装饰者模式.Sample;

/**
 * author: zzw5005
 * date: 2018/9/2 20:50
 */

/*
* 装饰物角色，与零件角色具有相同的接口(因为它继承了零件角色)。在它的内部保存了被装饰对象，零件角色。
* 装饰物角色知道自己要装饰的对象。
* 从接口角度而言，装饰边框(Border)与被装饰物(Display)具有相同的方法，意味着它们具有一致性。
* Border类是装饰边框的抽象类。
* */
public abstract class Border extends Display{
    protected Display display;           //表示被装饰物
    protected Border(Display display){   //在生成实例时候，通过参数指定被装饰物
        this.display = display;
    }
}
