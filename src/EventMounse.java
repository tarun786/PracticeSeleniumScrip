import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class EventMounse {

public static void main(String args[])
{
	WebDriver driver=new FirefoxDriver();
	driver.get("http://newtours.demoaut.com/");
	
	WebElement link_home=driver.findElement(By.linkText("Home"));
//	WebElement td_home=driver.findElement(By.xpath("//html/body/div"+ "/table/tbody/tr/td[1]"+
//	"/table/tbody/tr/td" + "/table/tbody/tr/td" +"/table/tbody/tr/td"));
	
	WebElement td_home=driver.findElement(By.xpath("//html/body/div"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr"));
	Actions builder=new Actions(driver);
	Action mouseOverhome=builder.moveToElement(link_home).build();
	String bg_color=td_home.getCssValue("background-color");
	System.out.println("Before hover "+bg_color);
	mouseOverhome.perform();
	bg_color = td_home.getCssValue("background-color");
	System.out.println("After hover "+bg_color);
	driver.quit();
	
	
}


}
