package Apptest1.Buynewcar.andriodcase;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class BasePage {

	public AndroidDriver wd;
	
	public BasePage(AndroidDriver wd){
		this.wd = wd;
	}
	
	public WebElement findViewById(String id){
		return wd.findElementById(id);
	}
	
//	public WebElement findView(By by){
//		return wd.findElement(by);
//	}
	
	public List<WebElement> findViewsById(String id){
		return wd.findElementsById(id);
	}
	
}
