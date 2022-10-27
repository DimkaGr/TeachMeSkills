package singleton.threadsafe;

public class DemoThreads {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Thread1());
        Thread thread2 = new Thread(new Thread2());
        thread1.start();
        thread2.start();
    }

    static class Thread1 implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance();
            System.out.println(singleton);
        }
    }

    static class Thread2 implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance();
            System.out.println(singleton);
        }
    }
}
