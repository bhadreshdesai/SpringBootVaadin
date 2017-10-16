package bdd.demo.views;

import bdd.demo.DemoApplicationUI;
import bdd.demo.security.LoginListerner;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Button;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

@DesignRoot
public class LoginView extends VerticalLayout {

    private final LoginListerner loginListener;
    private TextField username;
    private PasswordField password;
    private Button loginButton;

    public LoginView(LoginListerner loginListerner) {
        this.loginListener = loginListerner;
        Design.read(this);
        this.loginButton.addClickListener(event -> this.login());
    }

    private void login() {
        DemoApplicationUI.getUserSession().login(username.getValue(), password.getValue());
        this.loginListener.loginSuccess();
    }
}
