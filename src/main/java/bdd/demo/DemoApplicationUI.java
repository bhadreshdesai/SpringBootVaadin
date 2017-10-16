package bdd.demo;

import bdd.demo.security.BasicUserSession;
import bdd.demo.security.UserSession;
import bdd.demo.views.LoginView;
import bdd.demo.views.MainView;
import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinSession;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.UI;

/**
 * @author Bhadresh Desai
 */
@SpringUI
@Theme("valo")
public class DemoApplicationUI extends UI {

    @Override
    protected void init(VaadinRequest request) {
        VaadinSession.getCurrent().setAttribute(UserSession.class, new BasicUserSession());

        if (DemoApplicationUI.getUserSession().isLoggedIn()) {
            this.showMainView();
        } else {
            this.showLoginView();
        }
    }

    private void showLoginView() {
        //LoginView loginView = ;
        this.setContent(new LoginView(() -> this.showMainView()));
    }

    private void showMainView() {
        this.setContent(new MainView());
    }

    public static UserSession getUserSession() {
        return VaadinSession.getCurrent().getAttribute(UserSession.class);
    }
}
