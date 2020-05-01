package build.com.Automation.testCases;

import org.testng.annotations.Test;

import build.com.Automation.lib.General;

public class OnlineShoping {

	@Test
	public static void onlineShoping() throws Exception{
		
		General g = new General();
		
		g.openApplication();
		g.signUP();
		g.login();
		g.addToCart();
		g.checkoutProcess();
		g.verifyTotalAmountOrder();
		g.closeApplication();
		
	}
}
