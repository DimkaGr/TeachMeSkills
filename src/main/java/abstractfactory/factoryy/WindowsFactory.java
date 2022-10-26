package abstractfactory.factoryy;

import abstractfactory.button.Button;
import abstractfactory.button.WindowsButton;
import abstractfactory.label.Label;
import abstractfactory.label.WindowsLabel;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Label createLabel() {
        return new WindowsLabel();
    }
}
