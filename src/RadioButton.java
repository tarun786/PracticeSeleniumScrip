import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		WebElement web=driver.findElement(By.id("u_0_e"));
		
	for(int i=0;i<2;i++)
	{
		web.click();
		System.out.println(web.isSelected());
		
	}
		
	}

}
