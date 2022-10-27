package observer;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        NotificationListener1 listener1 = new NotificationListener1();
        NotificationListener2 listener2 = new NotificationListener2();
        editor.manager.subscribe(listener1);
        editor.manager.subscribe(listener2);

        editor.triggerEvent();
        editor.triggerEvent();

        editor.manager.unsubscribe(listener2);
        editor.triggerEvent();
    }
}
