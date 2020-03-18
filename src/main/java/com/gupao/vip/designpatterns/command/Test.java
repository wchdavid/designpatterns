package com.gupao.vip.designpatterns.command;

import java.util.Scanner;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 14:36 2020/3/18
 **/
public class Test {

    public static void main(String[] args) {
        AbsInitFtpCMD initFtpCMD = new InitFtpCMD();
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input your command :");
        while (scanner.hasNextLine()) {
            String command = scanner.next();
            initFtpCMD.checkCmd(command);
            initFtpCMD.executes();
        }
    }


}
