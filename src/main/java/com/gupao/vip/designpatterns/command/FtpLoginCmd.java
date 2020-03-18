package com.gupao.vip.designpatterns.command;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 13:12 2020/3/18
 **/
public class FtpLoginCmd extends AbsFtpCmd {

    public FtpLoginCmd(IFtpServer ftpServer) {
        super(ftpServer);
    }

    @Override
    public void execute() {
        ftpServer.login();
    }
}
