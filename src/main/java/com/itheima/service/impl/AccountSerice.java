package com.itheima.service.impl;

import com.itheima.service.AccountService;
import com.itheima.service.dao.AccountDao;
import com.itheima.service.dao.impl.AccountDaoImpl;

/**
 * 账户的业务层实现类
 */
public class AccountSerice implements AccountService {
    private AccountDao accountDao=new AccountDaoImpl();
    public  void saveAccount(){
        accountDao.saveAccount();

    }

}
