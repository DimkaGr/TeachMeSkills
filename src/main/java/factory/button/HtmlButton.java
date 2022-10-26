package factory.button;

public class HtmlButton implements Button {
    public void render() {
        System.out.println("Render HTML button");
        onClick();
    }

    public void onClick() {
        System.out.println("HTML button click!!!'");
    }
}
