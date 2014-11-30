package dk.kyuff.basefx.samples.presenter;

import dk.kyuff.basefx.core.AbstractWeldApplication;
import dk.kyuff.basefx.core.StartPoint;
import javafx.application.Application;

public class PresenterMain extends AbstractWeldApplication {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public Class<? extends StartPoint> getStartPoint() {
        return PresenterApp.class;
    }
}
