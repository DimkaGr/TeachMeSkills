package abstractfactory.label;

public class HtmlLabel implements Label {
    @Override
    public void display() {
        System.out.println("Display HTML label");
    }
}
