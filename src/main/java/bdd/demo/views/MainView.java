package bdd.demo.views;

import bdd.demo.DemoApplicationUI;
import com.vaadin.annotations.DesignRoot;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.declarative.Design;

@DesignRoot
public class MainView extends VerticalLayout {
    private Label username;

    public MainView() {
        // String filename = "MainView.html";
        //InputStream stream = MainView.class.getResourceAsStream(filename);
        //Design.read(filename, this);

        Design.read(this);
        username.setValue(DemoApplicationUI.getUserSession().getUserName());
        //String hello = "Hello " + DemoApplicationUI.getUserSession().getUserName();
        //label.setCaption();
        //label.setValue(hello);
    }
}
