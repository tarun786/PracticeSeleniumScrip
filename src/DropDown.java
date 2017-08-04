import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String args[])
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		
	Select value=new Select(driver.findElement(By.name("country")));
	//value.selectByValue("ARGENTINA");
		value.selectByVisibleText("ARGENTINA");
		for(int i=0;i<13;i++)
		{
		value.selectByIndex(i);
		value.deselectByIndex(i);
		}
		
			
			
		
	
	driver.quit();}
}
