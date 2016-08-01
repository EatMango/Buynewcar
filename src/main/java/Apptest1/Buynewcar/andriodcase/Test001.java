package Apptest1.Buynewcar.andriodcase;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import Apptest1.Buynewcar.base.AndroidAppBaseTest;

public class Test001 extends AndroidAppBaseTest {

	@Test
	public void test001() throws Exception {

		Thread.sleep(10 * 1000l);

		// 点击B版发起砍价按钮
		WebElement discuss = wd.findElementById("launch_bargain_btn");
		discuss.click();

		Thread.sleep(3 * 1000l);
		
		discuss = wd.findElementById("fl_noCarLayout");
		discuss.click();
		
		Thread.sleep(3 * 1000l);
		
		List<WebElement> listcarName = wd.findElementsById("brandName");
		for (WebElement car : listcarName) {
			if(car.getText().equals("奔驰")){
				car.click();
				break;
			}
		}
		
		Thread.sleep(3 * 1000l);
		
		listcarName = wd.findElementsById("car_name");
		for (WebElement car : listcarName) {
			if(car.getText().contains("奔驰GLK")){
				car.click();
				break;
			}
		}
		Thread.sleep(10 * 1000l);
	}
	
	
	@Test
	public void test002() throws Exception{
		HomePage homePage = new HomePage(wd);
		Thread.sleep(10*1000);
		homePage.clickDiscuss();
		Thread.sleep(1000);
		homePage.clickMine();
		Thread.sleep(10*1000);
	}
}
