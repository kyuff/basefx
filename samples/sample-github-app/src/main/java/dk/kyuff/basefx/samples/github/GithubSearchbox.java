package dk.kyuff.basefx.samples.github;

import dk.kyuff.basefx.github.GithubClient;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import javax.inject.Inject;

/**
 * User: swi
 * Date: 24/07/14
 * Time: 16.22
 */
public class GithubSearchbox extends VBox {
    @FXML
    TextField textField;

    @Inject
    GithubClient github;

    public GithubSearchbox() {
        System.out.println("constructor for github search box");
    }

    public void initialize() {
        System.out.println("creating search box: " + github);
    }

    @FXML
    protected void doSomething() {
        System.out.println("The button was clicked!");
    }
}
