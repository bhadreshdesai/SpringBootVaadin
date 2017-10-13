package bdd.demo;

import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

/**
 * @author Bhadresh Desai
 */
@SpringUI
public class DemoApplicationUI extends UI {

    @Override
    protected void init(VaadinRequest request) {
        setContent(new Label("Spring says: Hello Vaadin!!!"));
    }
}
