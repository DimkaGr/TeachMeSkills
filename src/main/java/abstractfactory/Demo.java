package abstractfactory;

import abstractfactory.button.Button;
import abstractfactory.factoryy.GUIFactory;
import abstractfactory.factoryy.HtmlFactory;
import abstractfactory.factoryy.WindowsFactory;
import abstractfactory.label.Label;

public class Demo {
    private static GUIFactory factory;
    public static void main(String[] args) {
        init("Html");
        paint();
    }

    private static void init(String property) {
        if (property.equals("Windows")) {
            factory = new WindowsFactory();
        } else {
            factory = new HtmlFactory();
        }
    }

    public static void paint() {
        Button button = factory.createButton();
        Label label = factory.createLabel();

        button.paint();
        label.display();
    }
}
