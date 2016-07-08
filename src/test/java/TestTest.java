import org.junit.Test;
import pages.Page;

import java.awt.*;

public class TestTest extends BaseTest {

    @Test
    public void signInToWebsite() throws AWTException, NoSuchFieldException {
        Page.getDriver().get(SITE);
        signInPage = homePage.actionButtonSignIn();
        checkPage = signInPage.signInMetod("dpastushenko1996@gmail.com", "1996baba");
        checkPage.checkTestDone();
    }
}
