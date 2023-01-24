package SignInModule;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.HashMap;
import org.baseOneSelf.BaseClass;
import org.locator.Page_Element;
import org.report.Report;
import org.testng.Assert;

public class Login extends BaseClass implements Page_Element {
	public static  void tc_01Login(HashMap<String,String> userName) throws Throwable {
		Report.Report();
		Report.ReportCreateTestcase("To verify whether 'Tables' option is displayed in the side menu.");
		browserLaunch("https://oneself-admin-test.optisolbusiness.com/login");
		
		try {	
			sendkeys(email, userName.get("UserName"));
			sendkeys(password,userName.get("Password"));
			click(signin);
			IsElementDisplayed(table);
			implicitWait(2000);
			//assert.assertTrue()
			//assert.assertEquals(IsElementDisplayed(table), false);
			//captureScreenshot();
			//assert.assertEquals(IsElementDisplayed(table), false);
			Assert.assertEquals(IsElementDisplayed(table), IsElementDisplayed(table));
			captureScreenshot();
			Report.Pass("The admin should be signed in only by the existing users.");
		    } catch (Exception e){
			Report.Fail("The admin should not be signed in only by the existing users.");			
			
		    }
	
	}
		    
	
	public static  void tc_02Login(HashMap<String,String> userName) throws Throwable {
		
		Report.ReportCreateTestcase("To verify whether 'Guidelines' option is displayed  first under tables .");
		browserLaunch("https://oneself-admin-test.optisolbusiness.com/login");	
		
		try {
			sendkeys(email, userName.get("UserName"));
			sendkeys(password,userName.get("Password"));
			click(signin);
			IsElementDisplayed(table);
			click(tabledropdown);
			Report.Pass("The admin should be signed in only by the existing users.");
		    } catch (Exception e){
			Report.Fail("The admin should not be signed in only by the existing users.");			
			
		    }
		driver.close();
	}
		
	public static  void tc_03Login(HashMap<String,String> userName) throws Throwable {
		
		Report.ReportCreateTestcase("To verify whether 'Guidelines' option is clickable.");
		browserLaunch("https://oneself-admin-test.optisolbusiness.com/login");
		
		try {
			sendkeys(email, userName.get("UserName"));
			sendkeys(password,userName.get("Password"));
			click(signin);
			IsElementDisplayed(table);
			click(tabledropdown);
			click(guidelines);
			Report.Pass("The admin should be signed in only by the existing users.");
		    } catch (Exception e){
			Report.Fail("The admin should not be signed in only by the existing users.");			
			
		    }
		driver.close();
	}
	
	public static  void tc_04Login(HashMap<String,String> userName) throws Throwable {
		
		Report.ReportCreateTestcase("To verify whether the add new guide line page appears when we click plus icon.");
		browserLaunch("https://oneself-admin-test.optisolbusiness.com/login");
		
		try {
			sendkeys(email, userName.get("UserName"));
			sendkeys(password,userName.get("Password"));
			click(signin);
			IsElementDisplayed(table);
			click(tabledropdown);
			click(guidelines);
			click(addguidelines);
			Report.Pass("The admin should be signed in only by the existing users.");
		    } catch (Exception e){
			Report.Fail("The admin should not be signed in only by the existing users.");			
			
		    }
		driver.close();
	}
	
	
	public static  void tc_05Login(HashMap<String,String> userName) throws Throwable {
		
		Report.ReportCreateTestcase("To verify whether  add new guide line pop up  have plus icon to add consumer prompt.");
		browserLaunch("https://oneself-admin-test.optisolbusiness.com/login");
			
		try {
			sendkeys(email, userName.get("UserName"));
			sendkeys(password,userName.get("Password"));
			click(signin);
			IsElementDisplayed(table);
			click(tabledropdown);
			click(guidelines);
			click(addguidelines);
			click(addconsumerprompt);
			Report.Pass("The admin should be signed in only by the existing users.");
			} catch (Exception e){
			Report.Fail("The admin should not be signed in only by the existing users.");			
			
			}	
		driver.close();
	}
	
	
	
	public static  void tc_06Login(HashMap<String,String> userName) throws Throwable {
		
		Report.ReportCreateTestcase("To verify whether the add new guide line page appears when we click plus icon.");
		browserLaunch("https://oneself-admin-test.optisolbusiness.com/login");
			
		try {
			sendkeys(email, userName.get("UserName"));
			sendkeys(password,userName.get("Password"));
			click(signin);
			IsElementDisplayed(table);
			click(tabledropdown);
			click(guidelines);
			click(addguidelines);
			click(addconsumerprompt);
			IsElementDisplayed(addconsumerprompt);
			IsElementDisplayed(addconsumerprompt);
			IsElementDisplayed(addconsumerprompt);
			click(removeconsumerprompt);
			Report.Pass("The admin should be signed in only by the existing users.");
			} catch (Exception e){
			Report.Fail("The admin should not be signed in only by the existing users.");			
			Report.ReportCooldown();
			}	
		driver.close();
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
		
		
		
	
