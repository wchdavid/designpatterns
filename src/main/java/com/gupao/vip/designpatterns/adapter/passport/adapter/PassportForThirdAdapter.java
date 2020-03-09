package com.gupao.vip.designpatterns.adapter.passport.adapter;

import com.gupao.vip.designpatterns.adapter.passport.LoginParamVO;
import com.gupao.vip.designpatterns.adapter.passport.LoginTypeEnum;
import com.gupao.vip.designpatterns.adapter.passport.ResultMsg;
import com.gupao.vip.designpatterns.adapter.passport.adapter.adapters.*;

public class PassportForThirdAdapter implements IPassportForThird {

    @Override
    public ResultMsg loginForThird(LoginParamVO params, LoginTypeEnum loginType) {
        try {
            AbstractAdapter adapter = (AbstractAdapter) Class.forName("com.gupao.vip.designpatterns.adapter.passport.adapter.adapters.LoginFor"
                    + loginType.getCode() + "Adapter").newInstance();
            if (adapter.support(adapter)) {
                return adapter.login(params, adapter);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
