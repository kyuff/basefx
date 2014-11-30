package dk.kyuff.basefx.samples.presenter;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PersonPresenterTest {

    @Mock
    PersonPresenter.View view;

    StringProperty input;
    StringProperty label;
    StringProperty button;
    ObjectProperty<EventHandler<ActionEvent>> actions;

    @Before
    public void setUp() throws Exception {
        input = new SimpleStringProperty();
        label = new SimpleStringProperty();
        button = new SimpleStringProperty();
        actions = new SimpleObjectProperty<>();

        when(view.getInputText()).thenReturn(input);
        when(view.getLabelText()).thenReturn(label);
        when(view.getButtonText()).thenReturn(button);
        when(view.getOnAction()).thenReturn(actions);
    }

    @Test
    public void testInitialize() throws Exception {
        // setup
        PersonPresenter presenter = new PersonPresenter();

        // execute
        presenter.initialize(view);

        // verify
        assertEquals("", label.getValue());
        assertEquals("Type something here ...", input.getValue());
        assertEquals( "Click here", button.getValue());
    }

    @Test
    public void testOnActionClicked_1() throws Exception {
        // setup
        PersonPresenter presenter = new PersonPresenter();
        presenter.initialize(view);
        ActionEvent event = mock(ActionEvent.class);
        // .. typing stuff
        input.setValue("mocked text");

        // execute
        presenter.onButtonClicked(event);


        // verify
        assertEquals("mocked text", label.getValue());
    }

    /**
     * This method tests exactly the same thing. The difference is how
     * the action event is delivered to the presenter. The first method
     * is more easy to understand, but requires the event handler to be
     * defined as a method on the presenter. This version is possible to
     * use with lambda expressions, but have the trade-off of being harder
     * to understand down the line.
     *
     * @throws Exception
     */
    @Test
    public void testOnActionClicked_2() throws Exception {
        // setup
        PersonPresenter presenter = new PersonPresenter();
        presenter.initialize(view);
        ActionEvent event = mock(ActionEvent.class);
        // .. typing stuff
        input.setValue("mocked text");

        // execute
        actions.get().handle(event);

        // verify
        assertEquals("mocked text", label.getValue());
    }
}