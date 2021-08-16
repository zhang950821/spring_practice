package service;

public class beanFactory {
    public accountServiceImpl2 createAccountService2(){
        return new accountServiceImpl2();
    }
    public accountServiceImpl createAccountService(){
        return new accountServiceImpl();
    }

}
