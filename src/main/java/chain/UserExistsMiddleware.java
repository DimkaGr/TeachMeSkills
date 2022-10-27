package chain;

public class UserExistsMiddleware extends Middleware {
    @Override
    public boolean check(String email, String password) {
        if (password.equals("ADMIN")) {
            System.out.println("Check password for admin");
        }
        else {
            System.out.println("Check password for user!");
        }
        return checkNext(email, password);
    }
}
