package dk.kyuff.basefx.core;

import javafx.application.Application;
import javafx.stage.Stage;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

/**
 * User: swi
 * Date: 23/07/14
 * Time: 19.52
 */
public abstract class AbstractWeldApplication extends Application {


    private Weld weld;
    private WeldContainer weldContainer;

    @Override
    public void start(Stage primaryStage) throws Exception {
        weldContainer = weld.initialize();
        Class<? extends StartPoint> clazz = getStartPoint();
        StartPoint app = weldContainer.instance().select(clazz).get();
        app.start(primaryStage, getParameters());
    }

    public abstract Class<? extends StartPoint> getStartPoint();

    @Override
    public void init() throws Exception {
        weld = new Weld();
    }

    @Override
    public void stop() throws Exception {
        weld.shutdown();
    }
}
