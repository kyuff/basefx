package dk.kyuff.basefx.samples.presenter;

import dk.kyuff.basefx.core.FXView;
import dk.kyuff.basefx.core.StartPoint;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.inject.Inject;

public class PresenterApp implements StartPoint {

    @Inject
    FXMLLoader fxmlLoader;

    @Inject
    @FXView("/person-view.fxml")
    VBox root;

    @Override
    public void start(Stage stage, Application.Parameters parameters) {

        stage.setScene(new Scene(root, 400, 300));
        stage.show();

    }

    @Override
    public Parent getRootNode() {
        return root;
    }

}
