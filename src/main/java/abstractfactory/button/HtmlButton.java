package abstractfactory.button;

public class HtmlButton implements Button {
    @Override
    public void paint() {
        System.out.println("Render HTML button");
    }
}
