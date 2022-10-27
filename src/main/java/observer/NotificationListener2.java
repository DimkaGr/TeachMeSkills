package observer;

public class NotificationListener2 implements EventListener {
    @Override
    public void action(String eventType) {
        System.out.println("Listener 2 reaction");
    }
}
