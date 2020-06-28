package editor;

import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import pusblisher.EventManager;

public class Editor {
    public EventManager events;
   

    public Editor() {
        this.events = new EventManager("clickOnBlue", "clickOnGreen","clickOnRed");
    }

    public void cambiarColorRojo(Button color, Pane root) {
        
        events.notify("clickOnRed", color,root);
    }

    public void cambiarColorAzul(Button color, Pane root) {
        
        events.notify("clickOnBlue", color,root);
    }
    public void cambiarColorVerde(Button color, Pane root) {
        
        events.notify("clickOnGreen", color,root);
    }
}