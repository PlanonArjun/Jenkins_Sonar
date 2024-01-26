package orangeHRMS_TESTS;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;
import com.vt.utilities.BaseClass;
import pages.OrangeHRMLoginPage;

public final class OrangeHRMTests extends BaseClass {

	@Test()
	public void loginLogoutTest() {
		Map<String, String> data = new HashMap<String, String>();
		data.put("username", "Admin");
		data.put("password", "admin123");

		new OrangeHRMLoginPage().enterUserName(data.get("username")).enterPassWord(data.get("password")).clickLogin()
				.clickDashboardUsername().clickLogout();

	}

}
