package chain;

public class ThrottlingMiddleware extends Middleware  {
    private int requestPerMinute;
    private int request;

    public ThrottlingMiddleware(int requestPerMinute) {
        this.requestPerMinute = requestPerMinute;
    }

    @Override
    public boolean check(String email, String password) {
        request++;

        if (request > requestPerMinute) {
            System.out.println("Request limit exceeded!");
            Thread.currentThread().stop();
        }
        else
        {
            System.out.println("Request limit not exceeded!");
        }
        return checkNext(email, password);
    }
}
