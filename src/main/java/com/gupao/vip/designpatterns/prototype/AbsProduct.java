package com.gupao.vip.designpatterns.prototype;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 22:33 2019/7/7
 **/
public abstract class AbsProduct implements Cloneable {

    public abstract void use(String s);

    protected final AbsProduct createClone(AbsProduct product) {
        try {
            AbsProduct absProduct = (AbsProduct) product.clone();
            return absProduct;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
