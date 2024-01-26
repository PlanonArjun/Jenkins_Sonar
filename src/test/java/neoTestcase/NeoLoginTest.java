package neoTestcase;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vt.annotation.FrameworkAnnotation;
import com.vt.enums.CategoryType;
import com.vt.listeners.ListenerClass;
import com.vt.utilities.BaseClass;

import pages.NeoApplcationDashboard;
import pages.NeoApplication;

@Listeners(ListenerClass.class)

public class NeoLoginTest extends BaseClass {

	String UserName = "nagalakshmi@yopmail.com";
	String Password = "Welcome@123";

	@Test
	@FrameworkAnnotation(author = { "Amuthan", "Sachin" }, category = {CategoryType.REGRESSION})
	public void login() throws Exception {
		NeoApplication lp = new NeoApplication();
		lp.LoginIntoApplication(UserName, Password);
		System.out.println("Loging  sucessfully ");

		NeoApplcationDashboard nb = new NeoApplcationDashboard();
		nb.cryptoWalletsDetails();
	}
	
	

}
