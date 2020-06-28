package pusblisher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import listeners.EventListener;

public class EventManager {
	Map<String, List<EventListener>> listeners=new HashMap<>();
	
	public EventManager(String... operations) {
		for(String operation : operations) {
			this.listeners.put(operation, new ArrayList<>());
		}
	}
	
	public void subscribe(String eventType,EventListener listener) {
		List<EventListener> users=listeners.get(eventType);
		users.add(listener);
	}
	
	public void unsuscribe(String eventType, EventListener listener) {
		List<EventListener> users=listeners.get(eventType);
		users.remove(listener);
	}
	public void notify(String eventType, Button boton,Pane root) {//avisa que el boton fue clickeado
        List<EventListener> users = listeners.get(eventType);
        for (EventListener listener : users) {
            listener.update(eventType, boton,root);
        }
    }
	
	
	
	
	
	
	
	
	

}
