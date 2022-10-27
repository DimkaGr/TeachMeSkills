package observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EventManager {
    List<EventListener> listeners = new ArrayList<>();

    public void subscribe(EventListener listener) {
        listeners.add(listener);
    }

    public void unsubscribe(EventListener listener) {
        listeners.remove(listener);
    }

    public void notify(String eventType) {
        for (EventListener listener : listeners) {
            listener.action(eventType);
        }
    }
}
