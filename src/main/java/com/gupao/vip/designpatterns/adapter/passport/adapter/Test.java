package com.gupao.vip.designpatterns.adapter.passport.adapter;

import com.gupao.vip.designpatterns.adapter.passport.LoginParamVO;
import com.gupao.vip.designpatterns.adapter.passport.LoginTypeEnum;


public class Test {
    public static void main(String[] args) {
        IPassportForThird adapter = new PassportForThirdAdapter();

        LoginParamVO params = new LoginParamVO();
        params.setOpenId("sjhdjsakdhkashdkj");

        adapter.loginForThird(params, LoginTypeEnum.QQ);
    }
}
