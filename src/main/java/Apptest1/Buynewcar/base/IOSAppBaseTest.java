package Apptest1.Buynewcar.base;

import io.appium.java_client.ios.IOSDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IOSAppBaseTest {
	
	public IOSDriver wd;
	
	@Before
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium-version", "1.0");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "9.3.2");
        capabilities.setCapability("deviceName", "iPhone 6s");
        capabilities.setCapability("autoAcceptAlerts", true);
       // capabilities.setCapability("app", "/Users/hongyang/Documents/Projects/iOS/top-deals/build/Release-iphonesimulator/BuyNewCar2.0.app");
        try {
            wd = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @After
    public void tearDown() throws Exception {
       wd.quit();
    }
    
    
}
