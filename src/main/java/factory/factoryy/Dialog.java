package factory.factoryy;

import factory.button.Button;

public abstract class Dialog {
    public void renderWindow() {

        Button button = createButton();
        button.render();
    }

    /**
     * Subclasses will override this method in order to create specific button
     * objects.
     */
    public abstract Button createButton();
}
