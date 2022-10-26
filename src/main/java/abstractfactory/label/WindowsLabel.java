package abstractfactory.label;

public class WindowsLabel implements Label {
    @Override
    public void display() {
        System.out.println("Display Windows label");
    }
}
