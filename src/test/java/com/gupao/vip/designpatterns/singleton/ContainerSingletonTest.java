package com.gupao.vip.designpatterns.singleton;

import com.gupao.vip.designpatterns.singleton.register.ContainerSingleton;

/**
 * @Author wangchunhui
 * @Description //容器式单例测试
 * @Date 14:26 2020/2/29
 **/
public class ContainerSingletonTest {

    public static void main(String[] args) throws Exception {

        ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
            @Override
            public void handler() {
                Object obj = ContainerSingleton.getInstance("com.gupao.vip.designpatterns.singleton.Pojo");
                System.out.println(obj);
            }
        }, 10, 6);

    }

}
