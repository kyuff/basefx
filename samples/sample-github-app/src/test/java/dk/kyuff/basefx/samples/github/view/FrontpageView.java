package dk.kyuff.basefx.samples.github.view;

import dk.kyuff.basefx.core.StartPoint;
import dk.kyuff.basefx.samples.github.BaseView;
import dk.kyuff.basefx.samples.github.GithubApp;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseButton;

/**
 * User: swi
 * Date: 10/08/14
 * Time: 15.55
 */
public class FrontpageView extends BaseView {

    @Override
    public Class<? extends StartPoint> getModuleClass() {
        return GithubApp.class;
    }

    public void typeSearchField(String searchTerm) {
        Node input = find("#input");
        click(input, MouseButton.PRIMARY);
        type("something weird");
        String value = ((TextField) input).getCharacters().toString();
        System.out.println("FOUND: " + value);
    }
}
