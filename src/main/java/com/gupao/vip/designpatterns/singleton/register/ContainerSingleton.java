package com.gupao.vip.designpatterns.singleton.register;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author wangchunhui
 * @Description //容器式单例
 * @Date 14:13 2020/2/29
 **/
public class ContainerSingleton {

    private ContainerSingleton() {
    }

    private static Map<String, Object> ioc = new HashMap<>();

    public static Object getInstance(String className) {
        synchronized (ioc) {
            if (!ioc.containsKey(className)) {
                Object obj = null;
                try {
                    obj = Class.forName(className).newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                ioc.put(className, obj);
                return obj;
            } else {
                return ioc.get(className);
            }
        }
    }

}
