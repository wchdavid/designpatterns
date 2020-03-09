package com.gupao.vip.designpatterns.adapter.passport.adapter.adapters;


import com.gupao.vip.designpatterns.adapter.passport.LoginParamVO;
import com.gupao.vip.designpatterns.adapter.passport.ResultMsg;


public class LoginForTokenAdapter extends AbstractAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTokenAdapter;
    }

    public ResultMsg login(LoginParamVO paramss , Object adapter) {
        if(!support(adapter)){return null;}

        return super.loginForRegist(paramss.getOpenId(),null);

    }
}
