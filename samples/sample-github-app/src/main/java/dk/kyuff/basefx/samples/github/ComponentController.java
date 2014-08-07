package dk.kyuff.basefx.samples.github;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import javax.inject.Inject;
import java.io.IOException;
import java.io.InputStream;

/**
 * User: swi
 * Date: 24/07/14
 * Time: 20.57
 */
public class ComponentController {

    public ComponentController() {
        System.out.println("constructor for component controller");
    }

    @FXML
    TextField textField;

    public void initialize() {
        System.out.println("Created component " + textField);
    }

    public void doSomething(ActionEvent actionEvent) {

    }
}
