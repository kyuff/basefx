package dk.kyuff.basefx.samples.github.steps;

import dk.kyuff.basefx.samples.github.view.FrontpageView;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import java.util.ArrayList;
import java.util.List;

/**
 * User: swi
 * Date: 10/08/14
 * Time: 15.22
 */
public class UserSteps {

    @Steps
    FrontpageView view;

    @Step
    public void clickSearchButton() {
        System.out.println("THE SEARCH BUTTON WAS CLICKED!");
    }

    public void openFrontpage() {
        view.open();
    }

    public void enterSearchTerm(String searchTerm) {
        view.typeSearchField(searchTerm);
    }

    public List<String> getProjectnames() {
        System.out.println("Getting project names!");
        return new ArrayList<>();
    }
}
