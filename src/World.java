import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class World {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver f;
		
		
			f=new FirefoxDriver();
			
			
			//f.get("http://www.javatpoint.com");
			//f.navigate().to("http://www.jaiswaltkj.webs.com");
			f.navigate().to("http://www.popuptest.com/popuptest2.html");
			
			Thread.sleep(5000);
			String name=f.getTitle();
			f.navigate().refresh();
			f.navigate().back();
			f.navigate().forward();
		String pageSource=f.getPageSource();
			System.out.println("hi this is automation testing "+name);
			//System.out.println(pageSource);
			System.out.println(f.getCurrentUrl());
			
		//f.close();
			f.quit();
		
}
}