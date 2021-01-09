package com.studentProject.MyLog;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {
    private Object obj;
    public DynamicProxy(){}

    public DynamicProxy(Object obj) {
        this.obj = obj;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        preMethod();
        method.invoke(obj,args);
        return null;
    }
    public void preMethod(){
        System.out.println("函数执行前期");
    }

}
