package factory.button;

public class WindowsButton implements Button {
    public void render() {
        System.out.println("Render Windows button");
        onClick();
    }

    public void onClick() {
        System.out.println("Windows button click!!!'");
    }
}
