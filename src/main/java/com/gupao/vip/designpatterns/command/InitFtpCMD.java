package com.gupao.vip.designpatterns.command;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 14:09 2020/3/18
 **/
public class InitFtpCMD extends AbsInitFtpCMD{

    @Override
    protected void execute(IFtpCmd cmd) {
        cmd.execute();
    }

    @Override
    protected void executes() {
        for (IFtpCmd exeCmd : exeCmds) {
            this.execute(exeCmd);
        }
        exeCmds.clear();
    }

    @Override
    protected void preExecute() {
        System.out.println("执行前操作......");
    }

    @Override
    protected void afterExecute() {
        System.out.println("执行前操作......");
    }

}
