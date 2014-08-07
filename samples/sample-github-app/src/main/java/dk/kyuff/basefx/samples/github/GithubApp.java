package dk.kyuff.basefx.samples.github;

import dk.kyuff.basefx.core.FXView;
import dk.kyuff.basefx.core.StartPoint;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.inject.Inject;

/**
 * User: swi
 * Date: 23/07/14
 * Time: 20.14
 */
public class GithubApp implements StartPoint {

    @Inject
    @FXView("/fxml/main.fxml")
    VBox firstView;

    @Override
    public void start(Stage stage, Application.Parameters parameters) {
        stage.setScene(new Scene(firstView, 800, 600));
        stage.show();
    }

    @Override
    public Parent getRootNode() {
        return firstView;
    }
}
