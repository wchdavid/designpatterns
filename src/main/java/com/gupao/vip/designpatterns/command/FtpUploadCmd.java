package com.gupao.vip.designpatterns.command;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 13:16 2020/3/18
 **/
public class FtpUploadCmd extends AbsFtpCmd{
    public FtpUploadCmd(IFtpServer ftpServer) {
        super(ftpServer);
    }

    @Override
    public void execute() {
        ftpServer.upload();
    }
}
