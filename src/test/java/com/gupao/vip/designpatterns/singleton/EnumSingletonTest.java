package com.gupao.vip.designpatterns.singleton;

import com.gupao.vip.designpatterns.singleton.register.EnumSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 16:59 2020/2/1
 **/
public class EnumSingletonTest {

    public static void main(String[] args) {
        try {
            EnumSingleton instance1 = null;

            EnumSingleton instance2 = EnumSingleton.getInstance();
            instance2.setObject(new Object());

            FileOutputStream fos = new FileOutputStream("EnumSingleton.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(instance2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("EnumSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            instance1 = (EnumSingleton) ois.readObject();
            ois.close();

            System.out.println(instance1);
            System.out.println(instance2);
            System.out.println(instance1 == instance2);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
