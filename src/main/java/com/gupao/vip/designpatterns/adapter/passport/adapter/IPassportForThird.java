package com.gupao.vip.designpatterns.adapter.passport.adapter;

import com.gupao.vip.designpatterns.adapter.passport.LoginParamVO;
import com.gupao.vip.designpatterns.adapter.passport.ResultMsg;
import com.gupao.vip.designpatterns.adapter.passport.LoginTypeEnum;

/**
 * Created by Tom.
 */
public interface IPassportForThird {

    ResultMsg loginForThird(LoginParamVO params, LoginTypeEnum loginType);

}
