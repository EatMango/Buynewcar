package Apptest1.Buynewcar.andriodcase;

/**
 * 首页
 *
 */

import org.junit.Test;
import org.openqa.selenium.WebElement;

import Apptest1.Buynewcar.base.AndroidAppBaseTest;

public class NewBuyCarMainFragment extends AndroidAppBaseTest{

	@Test
	public void openTest() throws Exception{
		// 暂停10秒
		Thread.sleep(100*1000l);
		
		//点击讨论
		WebElement discuss =wd.findElementById("discuss_view");
		
		//点击我
		discuss =wd.findElementById("mine_view");
		
		//点击热门车型
		discuss=wd.findElementById("");
		
		
		//点击搜索
		discuss=wd.findElementById("menu_search");
		
		//点击通知
		discuss=wd.findElementById("messageBT");
		
		//点击B版发起砍价按钮
		discuss = wd.findElementById("launch_bargain_btn");
		discuss.click();
		
		Thread.sleep(5*1000l);
		
		//选择砍价车型
		discuss = wd.findElementById("fl_noCarLayout");
		discuss.click();
		
		Thread.sleep(5*1000l);
		
		//NewBuyCarMainFragment(首页)
		
	}
}
