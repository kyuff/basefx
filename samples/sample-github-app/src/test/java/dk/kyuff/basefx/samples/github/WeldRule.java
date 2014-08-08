package dk.kyuff.basefx.samples.github;

import dk.kyuff.basefx.core.StartPoint;
import javafx.scene.Parent;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/**
 * User: swi
 * Date: 08/08/14
 * Time: 16.29
 */
public class WeldRule implements TestRule {

    private final WeldContainer container;
    private Class<? extends StartPoint> clazz;
    private Weld weld = new Weld();
    private StartPoint startPoint;

    public WeldRule(Class<? extends StartPoint> clazz) {
        this.clazz = clazz;
        container = weld.initialize();
        System.out.println("constructing rule");
    }

    public Parent getRootNode() {
        startPoint = container.instance().select(clazz).get();

        return startPoint.getRootNode();
    }


    @Override
    public Statement apply(Statement statement, Description description) {
        System.out.println("outter apply");
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                System.out.println("inner apply before");
                statement.evaluate();
                System.out.println("inner apply after");
                weld.shutdown();
            }
        };

    }
}
