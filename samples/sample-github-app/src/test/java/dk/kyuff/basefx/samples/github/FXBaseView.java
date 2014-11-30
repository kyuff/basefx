package dk.kyuff.basefx.samples.github;

import org.loadui.testfx.utils.FXTestUtils;

/**
 * User: swi
 * Date: 11/08/14
 * Time: 15.07
 */
public class FXBaseView {

    public void open() {
        FXTestUtils.launchApp(GithubMain.class);
        FXTestUtils.awaitEvents();
    }

}
