package dk.kyuff.basefx.samples.github;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.loadui.testfx.GuiTest;
import org.loadui.testfx.utils.FXTestUtils;

import static org.junit.Assert.assertEquals;

public class GithubAppTest extends GuiTest {

    @Rule
    public WeldRule weldRule = new WeldRule(GithubApp.class);

    public GithubAppTest() {
        System.out.println("constructing test");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("setUp");
        FXTestUtils.awaitEvents();
    }

    @Override
    protected Parent getRootNode() {
        System.out.println("getting root node");
        return weldRule.getRootNode();
    }

    @Test
    public void testHelloWorld() throws Exception {
        System.out.println("running this::testHelloWorld");
        // setup
        Node input = find("#input");

        // execute
        String value = ((TextField) input).getCharacters().toString();

        // verify
        assertEquals("angular", value);

    }

    @Test
    public void testHelloMyself() throws Exception {
        System.out.println("running this::testHelloMyself");
        // setup
        Node input = find("#input");

        // execute
        String value = ((TextField) input).getCharacters().toString();

        // verify
        assertEquals("angular", value);

    }

}