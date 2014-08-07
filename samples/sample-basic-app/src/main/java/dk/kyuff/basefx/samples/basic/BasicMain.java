package dk.kyuff.basefx.samples.basic;

import dk.kyuff.basefx.core.AbstractWeldApplication;
import dk.kyuff.basefx.core.StartPoint;
import javafx.application.Application;

/**
 * User: swi
 * Date: 22/07/14
 * Time: 20.37
 */
public class BasicMain extends AbstractWeldApplication {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public Class<? extends StartPoint> getStartPoint() {
        return BasicApp.class;
    }
}
