package abstractfactory.factoryy;

import abstractfactory.button.Button;
import abstractfactory.button.HtmlButton;
import abstractfactory.label.HtmlLabel;
import abstractfactory.label.Label;

public class HtmlFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }

    @Override
    public Label createLabel() {
        return new HtmlLabel();
    }
}
