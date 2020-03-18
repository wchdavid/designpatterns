package com.gupao.vip.designpatterns.command;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 13:14 2020/3/18
 **/
public abstract class AbsFtpCmd implements IFtpCmd {

   protected IFtpServer ftpServer;

    public AbsFtpCmd(IFtpServer ftpServer) {
        this.ftpServer = ftpServer;
    }

}
