import Proxy.DBQueryProxy;
import Proxy.IDBQuery;
import Singleton.Singleton;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Singleton singleton = Singleton.getInstance(); //调用单例模式

        IDBQuery q =new DBQueryProxy(); //代理使用
        q.request();  //在真正使用时才创建真实对象


    }

}
