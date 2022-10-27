package observer;

public class Editor {
    public EventManager manager;

    public Editor() {
        this.manager = new EventManager();
    }

    public void triggerEvent() {
        System.out.println("Event is triggered");
        manager.notify("open");
    }
}
