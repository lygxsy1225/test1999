package com.bjpowernode.Util;

public class ServiceFactory {
    public static Object getServce(Object servce){
        return new TransactionInvocationHandler(servce).getProxy();
    }
}
