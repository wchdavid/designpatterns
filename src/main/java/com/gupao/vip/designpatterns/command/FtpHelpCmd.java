package com.gupao.vip.designpatterns.command;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 13:15 2020/3/18
 **/
public class FtpHelpCmd extends AbsFtpCmd {
    public FtpHelpCmd(IFtpServer ftpServer) {
        super(ftpServer);
    }

    @Override
    public void execute() {
        ftpServer.help();
    }
}
