package Apptest1.Buynewcar.andriodcase;

import java.util.List;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class BuycarPage extends BasePage {

	private List<WebElement> carNames;//brandName
	
	public BuycarPage(AndroidDriver wd) {
		super(wd);
//		initPage();
	}

	private void initPage() {
		carNames = findViewsById("brandName");
	}
	
	public void clickCar(String carName){
		for (WebElement e:carNames) {
			if(e.getText().equals(carName)){
				e.click();
				return;
			}
		}
	}
	
	public void scrollTo(String carName){
		wd.scrollTo(carName);
	}

}
