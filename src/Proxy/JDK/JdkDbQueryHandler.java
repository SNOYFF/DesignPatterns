package Proxy.JDK;

import Proxy.DBQuery;
import Proxy.IDBQuery;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*代替DBQueryProxy*/
public class JdkDbQueryHandler implements InvocationHandler {

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        IDBQuery real = null;
        if (real == null){
            real = new DBQuery();
        }
        return real.request();
    }

    public static IDBQuery createJdkProxy(){
        IDBQuery jdkProxy = (IDBQuery) Proxy.newProxyInstance(
                ClassLoader.getSystemClassLoader(),
                new Class[]{IDBQuery.class},
                new JdkDbQueryHandler()
        );
        return jdkProxy;
    }

}
