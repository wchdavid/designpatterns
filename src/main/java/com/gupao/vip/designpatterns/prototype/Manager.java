package com.gupao.vip.designpatterns.prototype;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 22:58 2019/7/7
 **/
public class Manager {
    private Map<String, AbsProduct> productMap = new HashMap();

    public void registerProduct(String name, AbsProduct product) {
        productMap.put(name, product);
    }

    public AbsProduct create(String name) {
        if (StringUtils.isBlank(name) || !productMap.containsKey(name)) {
            return null;
        }

        AbsProduct product = (AbsProduct) productMap.get(name);

        return product.createClone(product);
    }
}
