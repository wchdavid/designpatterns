package com.gupao.vip.designpatterns.adapter.passport.adapter.adapters;


import com.gupao.vip.designpatterns.adapter.passport.LoginParamVO;
import com.gupao.vip.designpatterns.adapter.passport.ResultMsg;


public class LoginForTelAdapter extends AbstractAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTelAdapter;
    }

    public ResultMsg login(LoginParamVO paramss , Object adapter) {
        if(!support(adapter)){return null;}

        return super.loginForRegist(paramss.getOpenId(),null);

    }

}
