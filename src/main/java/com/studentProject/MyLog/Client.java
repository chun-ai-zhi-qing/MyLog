package com.studentProject.MyLog;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        InvocationHandler handler = new DynamicProxy(new RealSubjectA());

        AbstractSubject subject = (AbstractSubject) Proxy.newProxyInstance(AbstractSubject.class.getClassLoader(),new Class[]{AbstractSubject.class},handler);
        subject.request();
    }
}
