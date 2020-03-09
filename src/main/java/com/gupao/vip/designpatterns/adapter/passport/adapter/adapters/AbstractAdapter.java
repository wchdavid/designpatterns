package com.gupao.vip.designpatterns.adapter.passport.adapter.adapters;


import com.gupao.vip.designpatterns.adapter.passport.LoginParamVO;
import com.gupao.vip.designpatterns.adapter.passport.PassportService;
import com.gupao.vip.designpatterns.adapter.passport.ResultMsg;

public abstract class AbstractAdapter extends PassportService {
    protected ResultMsg loginForRegist(String username, String password){
        if(null == password){
            password = "THIRD_EMPTY";
        }
        super.regist(username,password);
        return super.login(username,password);
    }

    public abstract  boolean support(Object object);
    public abstract  ResultMsg login(LoginParamVO paramss , Object adapter);
}
