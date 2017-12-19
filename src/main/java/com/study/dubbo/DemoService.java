package com.study.dubbo;

import java.util.List;

/**
 * ClassDescribe:
 * Author :wangzhanhua
 * Date: 2017-12-18
 * Since
 * To change this template use File | Settings | File Templates.
 */
public interface DemoService {
    String sayHello(String name);

    public List getUsers();
}
