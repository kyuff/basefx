package dk.kyuff.basefx.core;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.stage.Stage;

/**
 * User: swi
 * Date: 23/07/14
 * Time: 19.55
 */
public interface StartPoint {
    void start(Stage stage, Application.Parameters parameters);
    Parent getRootNode();
}
