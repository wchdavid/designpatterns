package com.gupao.vip.designpatterns.command;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 13:17 2020/3/18
 **/
public class FtpDownloadCmd extends AbsFtpCmd {
    public FtpDownloadCmd(IFtpServer ftpServer) {
        super(ftpServer);
    }

    @Override
    public void execute() {
        ftpServer.download();
    }
}
