package 第二部分交给子类.工厂方法模式.Sample.idcard;

import 第二部分交给子类.工厂方法模式.Sample.framework.Factory;
import 第二部分交给子类.工厂方法模式.Sample.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * author: zzw5005
 * date: 2018/8/31 17:02
 */

/*
* 具体的创建者属于加工这一方，它负责生成具体的产品。
* */
public class IDCardFactory extends Factory {
    private List owners = new ArrayList();
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }

    public List getOwner(){
        return owners;
    }
}
