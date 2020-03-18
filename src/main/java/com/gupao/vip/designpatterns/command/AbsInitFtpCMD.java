package com.gupao.vip.designpatterns.command;

import org.apache.commons.lang3.StringUtils;

import java.util.*;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 14:46 2020/3/18
 **/
public abstract class AbsInitFtpCMD {
    protected List<IFtpCmd> exeCmds = new ArrayList<>();

    private static final Map<String, IFtpCmd> COMMANDS = new HashMap<>();
    private static final IFtpServer SERVER = new FtpServerImpl();

    static {
        COMMANDS.put("login", new FtpLoginCmd(SERVER));
        COMMANDS.put("upload", new FtpUploadCmd(SERVER));
        COMMANDS.put("download", new FtpDownloadCmd(SERVER));
        COMMANDS.put("help", new FtpHelpCmd(SERVER));
        COMMANDS.put("exit", new FtpExitCmd(SERVER));
    }

    protected void addAction(IFtpCmd cmd){
        exeCmds.add(cmd);
    }

    protected abstract void execute(IFtpCmd cmd);

    protected abstract void executes();

    protected abstract void preExecute();

    protected abstract void afterExecute();

    public final void executeCmd(String cmd){
        this.checkCmd(cmd);
        executes();
    }

    public void checkCmd(String cmd) {
        if(StringUtils.isBlank(cmd) || !COMMANDS.containsKey(cmd)){
            System.out.println("this command not support");
            this.addAction(COMMANDS.get("help"));
            return;
        }
        this.addAction(COMMANDS.get(cmd));
    }


}
