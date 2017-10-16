package bdd.demo.security;

public interface UserSession {

    void login(String username, String password);

    String getUserName();

    boolean isLoggedIn();
}
