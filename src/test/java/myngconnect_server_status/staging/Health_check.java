package myngconnect_server_status.staging;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.compro.automation.utils.CSVHandler;

public class Health_check {
	CSVHandler login_details = null;
	public void health_login(RemoteWebDriver driver ) throws Exception {
	//String b = Integer.toString(i);
        //String baseurl = "s-www.myngconnect.com/";
        synchronized (driver){driver.wait(5000);}
        driver.get("http://s-www.myngconnect.com/login/teacher/login.spr");
	    driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.id("j_username")).sendKeys("systemadmin@cengage.com");
		driver.findElement(By.id("passwordField")).clear();
	    driver.findElement(By.id("passwordField")).sendKeys("Cengage123");
	    driver.findElement(By.id("imgLogin")).click();
 }
}