package Proxy;

public class DBQuery implements IDBQuery{

    public DBQuery(){
        try {
            Thread.sleep(1000);//可能包含数据库连接耗时操作
            System.out.println("DBquery is create");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public String request() {
        return "request string";
    }

}
