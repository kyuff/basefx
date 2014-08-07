package dk.kyuff.basefx.samples.basic;

import dk.kyuff.basefx.core.FXView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.VBox;

import javax.enterprise.inject.Instance;
import javax.inject.Inject;

/**
 * User: swi
 * Date: 22/07/14
 * Time: 21.32
 */
public class BasicController {

    @FXML
    VBox stuff;

    @Inject
    @FXView("/subpage.fxml")
    Instance<VBox> subpage;

    public void onButtonClick(ActionEvent actionEvent) {
        System.out.println("Click!");
        stuff.getChildren().add(subpage.get());
    }

}
