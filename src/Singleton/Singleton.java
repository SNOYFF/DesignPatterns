package Singleton;

/**
 * 单例模式通常用来产生一个对象的具体实例，它可以确保一个类只产生一个实例。
 * 1.对于频繁的使用对象，可以省略创建对象所花费的时间
 * 2.由于new的操作次数减少，将减少GC压力。
 */

public class Singleton {
    /**
     * 构造函数
     */
    private Singleton() {
        System.out.println("Singleton is create");
    }
    
    private static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return Singleton.instance;
    }
}
