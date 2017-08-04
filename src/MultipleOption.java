import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleOption {

	
	public static void main(String args[])
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://jsbin.com/osebed/2");
		WebElement web=driver.findElement(By.id("fruits"));
		
		Select se=new Select(web);
		
			
		se.selectByVisibleText("Banana");
		se.selectByVisibleText("Apple");
		
		//List<WebElement> option=se.getOptions(); 
		//List<WebElement> option=se.getAllSelectedOptions();
		WebElement option= se.getFirstSelectedOption();
		
	/*	for(WebElement webElemnt:option1)
		{
			System.out.println(webElemnt.getText());
		}
		*/
		
		System.out.println("First option is "+option.getText());
		
		driver.quit();
	}
}
