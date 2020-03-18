package com.gupao.vip.designpatterns.command;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 12:36 2020/3/18
 **/
public interface IFtpServer {

    void help();

    void login();

    void upload();

    void download();

    void exit();

}
