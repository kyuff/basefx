package dk.kyuff.basefx.samples.github.stories;

import dk.kyuff.basefx.samples.github.steps.UserSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Ignore;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * User: swi
 * Date: 10/08/14
 * Time: 14.57
 */
@Ignore
public class SearchStory {

    @Steps
    UserSteps userSteps;

    @Given("I am on the frontpage")
    public void givenIAmOnTheFrontpage() {
        userSteps.openFrontpage();
    }

    @When("I enter angular into the search box")
    public void whenIEnterAngularIntoTheSearchBox() {
        userSteps.enterSearchTerm("angular");
        userSteps.clickSearchButton();
    }


    @When("I make an empty search")
    public void whenIMakeAnEmptySearch() {
        userSteps.enterSearchTerm("");
        userSteps.clickSearchButton();
    }

    @Then("I should see a list of projects with angular in the name")
    public void thenIShouldSeeAListOfProjectsWithAngularInTheName() {
        List<String> projectNames = userSteps.getProjectnames();
        boolean allMatch = projectNames.stream().allMatch(s -> s.contains("angular"));
        assertTrue(allMatch);
    }


    @Then("the result should be empty as well")
    public void thenTheResultShouldBeEmptyAsWell() {
        List<String> projectNames = userSteps.getProjectnames();
        assertEquals(0, projectNames.size());
    }
}
