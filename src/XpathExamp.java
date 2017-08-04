import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathExamp {

	public static void main(String args[])
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/new.html");
		String innerText=driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
		System.out.println(innerText);
       driver.quit();		
	}
}
