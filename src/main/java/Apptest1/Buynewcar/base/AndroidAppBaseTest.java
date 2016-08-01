package Apptest1.Buynewcar.base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AndroidAppBaseTest {

	public AndroidDriver wd;

	@Before
	public void setUp() throws Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		//小米4
//		capabilities.setCapability("platformVersion", "5.1.1");
//		capabilities.setCapability("deviceName", "fd10984a");
		//oppo
//		capabilities.setCapability("platformVersion", "5.1.1");
//		capabilities.setCapability("deviceName", "b480c6b1");
		// honor
		capabilities.setCapability("platformVersion", "4.4.2");
		capabilities.setCapability("deviceName", "F8UDU16329001259");
		
		capabilities.setCapability("appPackage", "cn.com.buynewcar");
		capabilities.setCapability("appActivity", "cn.com.buynewcar.MainActivity");
//		capabilities.setCapability("app", "/Users/heaven/Downloads/MaiCheDaRen.apk");
		try {
			wd = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),capabilities);
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

