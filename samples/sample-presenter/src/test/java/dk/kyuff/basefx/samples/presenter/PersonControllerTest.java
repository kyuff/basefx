package dk.kyuff.basefx.samples.presenter;

import javafx.scene.control.Button;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
@Ignore
public class PersonControllerTest {

    PersonController controller;

    @Mock
    Button button;

    @Before
    public void setUp() throws Exception {
        controller = new PersonController();
        controller.button = button;
    }

    @Test
    public void testInitialize() throws Exception {
        assertTrue(true);
    }
}