package dk.kyuff.basefx.samples.presenter;

import dk.kyuff.basefx.core.Presenter;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.Initializable;

/**
 * Class to contain the presentation logic. Areas of expertise would be:
 *
 * - Update the view
 * - Read data from the view
 * - Communicate the data to external data sources
 * - Orchestrate actions in the view
 */
public class PersonPresenter implements Presenter<PersonPresenter.View> {

    View view;

    @Override
    public void initialize(View view) {
        this.view = view;

        // set gui texts (should be done in resource bundles for localization)
        view.getLabelText().setValue("");
        view.getButtonText().setValue("Click here");
        view.getInputText().setValue("Type something here ...");

        // register events
        view.getOnAction().setValue(this::onButtonClicked);
    }

    /**
     * // This could just as well have been achieved by binding
     // the two properties. The point is to show the concept
     // when you want to store the data to an outside datastore
     // and not just display it back to the user.
     * @param event from the user action
     */
    void onButtonClicked(ActionEvent event) {
        String inputText = view.getInputText().getValue();
        view.getLabelText().setValue(inputText);
        System.out.println("Updating label to: " + inputText);
    }

    public static interface View extends Initializable {
        StringProperty getLabelText();
        StringProperty getButtonText();
        StringProperty getInputText();
        ObjectProperty<EventHandler<ActionEvent>> getOnAction();
    }
}
