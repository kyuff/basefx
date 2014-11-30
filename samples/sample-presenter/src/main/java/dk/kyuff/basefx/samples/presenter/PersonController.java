package dk.kyuff.basefx.samples.presenter;

import dk.kyuff.basefx.core.Presenter;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.inject.Inject;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * A simple class that does nothing more than expose the GUI elements using simple types and
 * bean types like StringProperty.
 */
public class PersonController implements PersonPresenter.View {

    @FXML
    Button button;
    @FXML
    TextField input;
    @FXML
    Label label;

    @Inject
    Presenter<PersonPresenter.View> presenter;


    @Override
    public ObjectProperty<EventHandler<ActionEvent>> getOnAction() {
        return button.onActionProperty();
    }

    @Override
    public StringProperty getLabelText() {
        return label.textProperty();
    }


    @Override
    public StringProperty getButtonText() {
        return button.textProperty();
    }

    @Override
    public StringProperty getInputText() {
        return input.textProperty();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        presenter.initialize(this);
    }
}
