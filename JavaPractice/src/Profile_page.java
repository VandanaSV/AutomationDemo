import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
public class Profile_page {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vandana.Vikraman\\Desktop\\selenium\\Drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://10.206.3.91/ILSWeb/Logon.aspx?language=en-US");
		//Thread.sleep(2000);
		WebElement userName=driver.findElement(By.id("ctl00_MPContent_txtUserName"));						
		userName.sendKeys("ElizabethArmstrong");
		WebElement btnNext=driver.findElement(By.id("ctl00_MPContent_btnNext"));
		btnNext.click();
		WebElement pwd=driver.findElement(By.id("ctl00_MPContent_txtPwd"));
		pwd.sendKeys("Default123");
		WebElement btnLogin=driver.findElement(By.id("ctl00_MPContent_btnLogIn"));
		btnLogin.click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "Loan List");
		driver.findElement(By.xpath("//a[@id='ctl00_MPUserMenu_UserMenu_linkChangeProfile']")).click();
		userName.clear();
		pwd.clear();
		WebElement SecQues=driver.findElement(By.cssSelector("select[id='ctl00_MPContent_ddlQues1']"));
		Select s=new Select(SecQues);
		s.selectByIndex(0);
		driver.switchTo().alert().g
	}

}
