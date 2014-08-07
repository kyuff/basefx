package dk.kyuff.basefx.samples.github;

import dk.kyuff.basefx.core.AbstractWeldApplication;
import dk.kyuff.basefx.core.StartPoint;
import javafx.application.Application;

/**
 * User: swi
 * Date: 23/07/14
 * Time: 20.13
 */
public class GithubMain extends AbstractWeldApplication {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public Class<? extends StartPoint> getStartPoint() {
        return GithubApp.class;
    }
}
