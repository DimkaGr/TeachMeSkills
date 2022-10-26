package factory.factoryy;

import factory.button.Button;
import factory.button.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
