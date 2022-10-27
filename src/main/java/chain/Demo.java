package chain;

public class Demo {
    public static void main(String[] args){
        String email = "user";
        String password = "USER";
        Middleware middleware = Middleware.link(
                new ThrottlingMiddleware(2),
                new UserExistsMiddleware(),
                new RoleCheckMiddleware()
        );
        middleware.check(email, password);
    }
}
