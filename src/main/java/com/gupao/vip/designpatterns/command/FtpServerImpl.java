package com.gupao.vip.designpatterns.command;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 12:38 2020/3/18
 **/
public class FtpServerImpl implements IFtpServer {
    @Override
    public void help() {
        System.out.println("login --登陆命令");
        System.out.println("upload --上传命令");
        System.out.println("download --下载命令");
        System.out.println("exit --退出命令");
    }

    @Override
    public void login() {
        System.out.println("用户登陆");
    }

    @Override
    public void upload() {
        System.out.println("用户下载");
    }

    @Override
    public void download() {
        System.out.println("用户下载");
    }

    @Override
    public void exit() {
        System.out.println("用户退出");
    }
}
