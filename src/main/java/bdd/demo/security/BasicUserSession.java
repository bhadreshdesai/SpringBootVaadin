package bdd.demo.security;

public class BasicUserSession implements UserSession {

    private String username;

    public BasicUserSession() {
        this.username = null;
    }

    @Override
    public void login(String username, String password) {
        this.username = username;
    }

    @Override
    public String getUserName() {
        return this.username;
    }

    @Override
    public boolean isLoggedIn() {
        return (this.username != null);
    }
}
