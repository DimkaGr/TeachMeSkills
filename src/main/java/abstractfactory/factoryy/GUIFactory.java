package abstractfactory.factoryy;

import abstractfactory.button.Button;
import abstractfactory.label.Label;

public interface GUIFactory {
    Button createButton();
    Label createLabel();
}
