package observer;

public class NotificationListener1 implements EventListener {
    @Override
    public void action(String eventType) {
        System.out.println("Listener 1 reaction");
    }
}
