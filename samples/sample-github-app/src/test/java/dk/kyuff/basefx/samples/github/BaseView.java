package dk.kyuff.basefx.samples.github;

import dk.kyuff.basefx.core.StartPoint;
import javafx.scene.Parent;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.loadui.testfx.GuiTest;
import org.loadui.testfx.utils.FXTestUtils;

/**
 * User: swi
 * Date: 10/08/14
 * Time: 20.13
 */
public abstract class BaseView extends GuiTest {

    private final WeldContainer container;
    private Weld weld = new Weld();
    private StartPoint startPoint;

    public BaseView() {
        super();
        this.container = weld.initialize();
    }

    @Override
    protected final Parent getRootNode() {
        startPoint = container.instance().select(getModuleClass()).get();
        return startPoint.getRootNode();
    }

    public final void open() {
        // Just need to put the thread to sleep to avoid a ThreadDeath
        sleep(1000);
        try {
            setupStage();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        FXTestUtils.awaitEvents();
    }

    public abstract Class<? extends StartPoint> getModuleClass();
}
