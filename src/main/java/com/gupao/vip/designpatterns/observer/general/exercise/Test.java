package com.gupao.vip.designpatterns.observer.general.exercise;

/**
 * @Author wangchunhui
 * @Description //TODO
 * @Date 8:21 2020/3/24
 **/
public class Test {

    public static void main(String[] args) {
        ICustomer<AbsMessage> commonCustomer1 = new CommonCustomer<>();
        ICustomer<AbsMessage> commonCustomer2 = new CommonCustomer<>();
        ICustomer<AbsMessage> vipCustomer1 = new VIPCustomer<>();
        ICustomer<AbsMessage> vipCustomer2 = new VIPCustomer<>();

        ICustomerService<AbsMessage> customerManager = new CustomerManager<>();
        ICustomerService<AbsMessage> custometStaff = new CustometStaff<>();

        customerManager.addCustomer(vipCustomer1);
//        customerManager.addCustomer(vipCustomer2);
        custometStaff.addCustomer(commonCustomer1);
        custometStaff.addCustomer(commonCustomer2);

        AbsMessage shortMessage = new ShortMessage("业务推荐","推荐内容","110","119");
        AbsMessage mailMessage = new MailMessage("优质用户奖励","奖励内容","张三","李四");

        customerManager.notifyCustomers(mailMessage);
        custometStaff.notifyCustomers(shortMessage);
        custometStaff.notifyCustomers(mailMessage);
    }

}
