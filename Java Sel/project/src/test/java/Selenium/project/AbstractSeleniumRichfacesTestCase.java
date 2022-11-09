package Selenium.project;

/**
 * @author <a href="mailto:pjha@redhat.com">Prabhat Jha</a>
 * @version $Revision$
 */
public abstract class AbstractSeleniumRichfacesTestCase extends SeleneseTestCase {

    public DefaultSelenium selenium;

    protected DefaultSelenium createSeleniumClient(String url, String browser) {
        return new DefaultSelenium("localhost", 8444, browser, url);
    }

    public void stopSelenium() {
        selenium.stop();
        selenium = null;
    }

}

