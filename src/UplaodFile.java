import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UplaodFile {

	public static void main(String[] args) throws IOException {
	
		String baseUrl = "http://yahoo-messenger.en.softonic.com/download";
		WebDriver driver = new FirefoxDriver();

		driver.get(baseUrl);
		WebElement uploadElement = driver.findElement(By.id("download-button"));
   String sourceLoaction=uploadElement.getAttribute("href");
   String wget_com="cmd /c wget -P c: "+ sourceLoaction;
   try
   {
	   Process pcb=Runtime.getRuntime().exec(wget_com);
	   int exitValue=pcb.waitFor();
	   System.out.println("Exit value for "+exitValue);
	   
   }
   catch (Exception e) {
	   System.out.println(e.toString());
	// TODO: handle exception
}
		// enter the file path onto the file-selection input field
		
//WebElement upload1=driver.findElement(By.className("entypo-upload"));
//upload1.click();

//upload1.sendKeys("C:\\newhtml.html");


	
	}
		
	}


