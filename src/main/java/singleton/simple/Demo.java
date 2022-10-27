package singleton.simple;

public class Demo {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton anotherSingleton = Singleton.getInstance();
        System.out.println(singleton == anotherSingleton);
    }
}
