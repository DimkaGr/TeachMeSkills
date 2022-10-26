package factory;

import factory.factoryy.Dialog;
import factory.factoryy.HtmlDialog;
import factory.factoryy.WindowsDialog;

public class Demo {
    public static void main(String[] args) {
        Dialog dialog = init("HTML");
        runBusinessLogic(dialog);
    }

    static Dialog init(String property) {
        Dialog dialog;
        if (property.equals("Windows"))
        {
            dialog = new WindowsDialog();
        }
        else
        {
            dialog = new HtmlDialog();
        }
        return dialog;
    }

    static void runBusinessLogic(Dialog dialog) {
        dialog.renderWindow();
    }
}
