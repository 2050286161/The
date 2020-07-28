package com.itheima.service.dao.impl.UI;

import com.itheima.service.AccountService;
import com.itheima.service.dao.impl.AccountDaoImpl;
import com.itheima.service.impl.AccountSerice;

/**
 * 模拟一个表现层。用于调用业务层
 */
public class client {
    public static void main(String[] args) {
        AccountService as=new AccountSerice();
        as.saveAccount();
    }
}
