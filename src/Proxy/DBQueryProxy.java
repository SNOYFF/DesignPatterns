package Proxy;
/*代理模式用于实现延迟加载，可以有效启动系统的启动速度，改善用户体验*/
public class DBQueryProxy implements IDBQuery{

    private DBQuery real = null;

    @Override
    public String request() {

        if (real == null) {
            real = new DBQuery();
        }
        return real.request();
    }

}
