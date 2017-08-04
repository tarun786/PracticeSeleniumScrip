import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.impl.entity.StrictContentLengthStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindLinkWorking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
String baseUrl = "http://newtours.demoaut.com/";

String consTiltle="Under Construction: Mercury Tours";
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
driver.get(baseUrl);
List<WebElement> linkElement=driver.findElements(By.tagName("a"));
String allLink[]=new String[linkElement.size()];
int i=0;
for(WebElement e:linkElement)
{
	allLink[i]=e.getText();
	i++;
}

//test each link

for(String t:allLink)
{
	
	driver.findElement(By.linkText(t)).click();;
	if(driver.getTitle().equals(consTiltle))
	{
		System.out.println("\"" + t + "\"" + "is under construction.");
			}
	else
	{
		System.out.println("\"" + t + "\""
                + " is working.");
	}
	driver.navigate().back();
}
driver.quit();

	}
}
