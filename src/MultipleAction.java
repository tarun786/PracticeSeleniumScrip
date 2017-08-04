import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MultipleAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		WebElement link=driver.findElement(By.id("email"));
		
		Actions actions=new Actions(driver);//keyUp(link,Keys.SHIFT) //.contextClick()
		Action seriosOfActions=actions.moveToElement(link).click().
				keyDown(link, Keys.SHIFT)
				.sendKeys(link, "TARUN").
				
				doubleClick(link)
				
				.build();
		seriosOfActions.perform();
		driver.quit();
		
		
	}

}
