package dk.kyuff.basefx.samples.basic;

import dk.kyuff.basefx.core.FXView;
import dk.kyuff.basefx.core.StartPoint;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.inject.Inject;

/**
 * User: swi
 * Date: 22/07/14
 * Time: 21.29
 */
public class BasicApp implements StartPoint {

    @Inject
    FXMLLoader fxmlLoader;

    @Inject
    @FXView("/basic.fxml")
    Parent root;

    @Override
    public void start(Stage stage, Application.Parameters parameters) {

        stage.setScene(new Scene(root,400,300));
        stage.show();

    }

    @Override
    public Parent getRootNode() {
        return root;
    }
}
