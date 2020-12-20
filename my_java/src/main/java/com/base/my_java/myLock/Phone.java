package com.base.my_java.myLock;

/**
 * @Author: 吴宸煊
 * Date: 2020/3/7 19:21
 * Description:
 */
public class Phone {
    // 关于Syschorinzed
    public synchronized void sendSms() {
        System.out.println("发送短信" + Thread.currentThread().getName());
        sendEmail();
    }

    public synchronized void sendEmail() {
        System.out.println("发送邮件" + Thread.currentThread().getName());
    }
}
