package Apptest1.Buynewcar.andriodcase;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class HomePage extends BasePage {

	// 买车按钮
	private WebElement buyCar;
	// 讨论按钮
	private WebElement discuss;
	// 我的按钮
	private WebElement mine;
	// 搜索按钮
	private WebElement search;
	// 通知按钮
	private WebElement message;
	
	public HomePage(AndroidDriver wd) {
		super(wd);
//		initPage();
	}
	
	/**
	 * 点击买车
	 */
	public void clickBuycar(){
		buyCar = findViewById("buycar_view");
		buyCar.click();
	}
	
	/**
	 * 点击讨论
	 */
	public void clickDiscuss(){
		discuss = findViewById("discuss_view");
		discuss.click();
	}
	
	/**
	 * 点击我的
	 */
	public void clickMine(){
		mine = findViewById("mine_view");
		mine.click();
	}
	/**
	 * 点击搜索
	 */
	public void clickSearch(){
		search = findViewById("menu_search");
		search.click();
	}
	/**
	 * 点击通知
	 */
	public void clickMessage(){
		message = findViewById("messageBT");
		message.click();
	}
}
