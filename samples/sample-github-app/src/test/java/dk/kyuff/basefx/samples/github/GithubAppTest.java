package dk.kyuff.basefx.samples.github;

import dk.kyuff.basefx.core.FXMLLoaderProducer;
import dk.kyuff.basefx.core.FXViewProducer;
import dk.kyuff.basefx.github.GithubClientProducer;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import org.jglue.cdiunit.AdditionalClasses;
import org.jglue.cdiunit.CdiRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.loadui.testfx.GuiTest;
import org.loadui.testfx.controls.Commons;
import org.loadui.testfx.utils.FXTestUtils;

import javax.enterprise.inject.Instance;
import javax.inject.Inject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.loadui.testfx.Assertions.*;

@RunWith(CdiRunner.class)
@AdditionalClasses({FXViewProducer.class, FXMLLoaderProducer.class, MainController.class, GithubClientProducer.class})
public class GithubAppTest extends GuiTest {

    @Inject
    Instance<GithubApp> app;

    @Before
    public void setUp() throws Exception {
        // JavaFX needs time to start up
        FXTestUtils.awaitEvents();
    }

    @Override
    protected Parent getRootNode() {
        return app.get().getRootNode();
    }

    @Test
    public void testHelloWorld() throws Exception {
        // setup
        Node input = find("#input");

        // execute
        String value = ((TextField)input).getCharacters().toString();

        // verify
        assertEquals("angular", value);

    }

}