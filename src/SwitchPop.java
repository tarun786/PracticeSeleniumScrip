import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchPop {

	public static void main(String args[])
	{
		WebDriver driver=new FirefoxDriver();
		String aletMsg="";
		driver.get("http://jsbin.com/usidix/1");
		driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
		aletMsg=driver.switchTo().alert().getText();
		//driver.switchTo().alert().accept();
		System.out.println(aletMsg);
		driver.close();
		
		
		
		
	}
	
}
