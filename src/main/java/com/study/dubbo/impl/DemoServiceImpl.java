package com.study.dubbo.impl;

import com.study.dubbo.DemoService;
import com.study.entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassDescribe:
 * Author :wangzhanhua
 * Date: 2017-12-18
 * Since
 * To change this template use File | Settings | File Templates.
 */
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello " + name;
    }

    public List getUsers() {
        List list = new ArrayList();
        User u1 = new User();
        u1.setName("hejingyuan");
        u1.setAge(20);
        u1.setSex("f");

        User u2 = new User();
        u2.setName("xvshu");
        u2.setAge(21);
        u2.setSex("m");


        list.add(u1);
        list.add(u2);

        return list;
    }
}
