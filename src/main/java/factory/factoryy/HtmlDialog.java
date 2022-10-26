package factory.factoryy;

import factory.button.Button;
import factory.button.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
