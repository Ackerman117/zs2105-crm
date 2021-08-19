package com.bjpowernode.settings.test;

import com.bjpowernode.crm.utils.DateTimeUtil;
import com.bjpowernode.crm.utils.MD5Util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01 {

    public static void main(String[] args) {
        // 验证失效时间
        // 失效时间
       /* String expireTime = "2019-10-10 10:10:10";
        // 当前系统时间
        String currentTime = DateTimeUtil.getSysTime();
        int count = expireTime.compareTo(currentTime);
        System.out.println(count );*/

        /*String lockState = "0";
        if ("0".equals(lockState)) {
            System.out.println("账号已锁定");
        }*/

        //浏览器端的ip地址
        /*String ip = "192.168.1.3";
        //允许访问的ip地址群
        String allowIps = "192.168.1.1,192.168.1.2";
        if (allowIps.contains(ip)) {
            System.out.println("有效的ip地址，允许访问系统");
        } else {
            System.out.println("ip地址受限，请联系管理员");
        }*/

//        String pwd = "Ymjbjpowernode123@";
//        pwd = MD5Util.getMD5(pwd);
//        System.out.println(pwd);

Example.getInstance();

    }

}
