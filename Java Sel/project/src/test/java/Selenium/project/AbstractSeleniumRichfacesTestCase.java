package Selenium.project;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestCase;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author <a href="mailto:pjha@redhat.com">Prabhat Jha</a>
 * @version $Revision$
 */
public abstract class AbstractSeleniumRichfacesTestCase extends SeleneseTestCase
{

   public DefaultSelenium selenium;

   protected DefaultSelenium createSeleniumClient(String url, String browser) {
      return new DefaultSelenium("localhost", 8444,browser, url);
   }


   public void startSeleniumClient(String browser){
      selenium = createSeleniumClient("http://localhost:8080/", browser);
      selenium.start();
   }

   public void stopSelenium() {
      selenium.stop();
      selenium = null;
   }   

}

