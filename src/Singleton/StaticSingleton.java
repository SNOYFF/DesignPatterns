package Singleton;

/**
 * 单例模式通常用来产生一个对象的具体实例，它可以确保一个类只产生一个实例。
 * 1.对于频繁的使用对象，可以省略创建对象所花费的时间
 * 2.由于new的操作次数减少，将减少GC压力。
 */
public class StaticSingleton {

    /**
     * 构造函数
     */
    private StaticSingleton(){
        System.out.println("Singleton is create");
    }

    /**
     * 通过内部类维护单例，当单例StaticSingleton被加载的时候，内部类不会初始化
     */
    private static  class SingletonHolder{
        private static StaticSingleton instance = new StaticSingleton();
    }

    /**
     * 只有调用getInstance才会加载SingletonHolder,从而初始化instance
     * @return
     */
    public  static  StaticSingleton getInstance() {
        return SingletonHolder.instance;
    }

}
