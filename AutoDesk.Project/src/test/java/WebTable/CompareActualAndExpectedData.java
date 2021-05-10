package WebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.annotations.Test;

public class CompareActualAndExpectedData {
	@Test
	public void captureOrgName()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Step1:get url
		driver.get("http://localhost:8888/");
		
		//Step2:login to the application
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		
		//Step3: Navigate to organizations names
		driver.findElement(By.linkText("Organizations")).click();
		
		String expData="TYSS1";
		boolean flag=false;
		
		//Step4:capture all the organization names
	List<WebElement> list=driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr[*]/td[3]/a"));
	for(WebElement wb:list)
	{
		String actData=wb.getText();
		if(expData.equals(expData))
		{
			wb.click();
			flag=true;
			break;
		}
		
	}
	if(flag)
	{
		System.out.println("Data is present");
	}
	else
	{
		System.out.println("Data is not present");
	}
		

		
		
		
	}

}
