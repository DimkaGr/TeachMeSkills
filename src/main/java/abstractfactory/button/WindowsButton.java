package abstractfactory.button;

public class WindowsButton implements Button{
    @Override
    public void paint() {
        System.out.println("Render Windows button");
    }
}
