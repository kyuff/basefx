package dk.kyuff.basefx.core;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.VBox;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.inject.Inject;
import java.io.IOException;
import java.io.InputStream;

/**
 * User: swi
 * Date: 22/07/14
 * Time: 21.54
 */
public class FXViewProducer {

    @Inject
    FXMLLoader fxmlLoader;

//    @Produces
//    @FXView("value must be defined")
//    public Node createNode(InjectionPoint injectionPoint) throws IOException {
//        return createController(injectionPoint);
//    }
//
//    @Produces
//    @FXView("value must be defined")
//    public Parent createParent(InjectionPoint injectionPoint) throws IOException {
//        return createController(injectionPoint);
//    }

    @Produces
    @FXView("value must be defined")
    public VBox createVBox(InjectionPoint ip) throws IOException {
        return createController(ip);
    }

    public <T extends Node> T createController(InjectionPoint injectionPoint) throws IOException {

        FXView view = injectionPoint.getAnnotated().getAnnotation(FXView.class);
        if (view == null) {
            // should not be possible at all
            throw new IllegalArgumentException("Could not find the " + FXView.class + " annotation, which should not be possible, at all");
        }

        // TODO make checks if view.value() == "" and then resort to a default value
        String fxmlPath = view.value();

        try (InputStream fxml = getClass().getResourceAsStream(fxmlPath)) {
            return fxmlLoader.load(fxml);
        }
    }

}
