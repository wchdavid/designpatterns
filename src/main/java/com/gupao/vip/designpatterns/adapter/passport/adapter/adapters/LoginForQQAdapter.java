package com.gupao.vip.designpatterns.adapter.passport.adapter.adapters;


import com.gupao.vip.designpatterns.adapter.passport.LoginParamVO;
import com.gupao.vip.designpatterns.adapter.passport.ResultMsg;


public class LoginForQQAdapter extends AbstractAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    public ResultMsg login(LoginParamVO paramss , Object adapter) {
        if(!support(adapter)){return null;}

        return super.loginForRegist(paramss.getOpenId(),null);

    }

}
