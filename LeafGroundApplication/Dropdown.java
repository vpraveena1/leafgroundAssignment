package LeafGroundApplication;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Button.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("home")).click();
		driver.findElement(By.linkText("Drop down")).click();
		WebElement drop1 = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		Select dp1= new Select(drop1);
		dp1.selectByIndex(1);
		WebElement drop2 = driver.findElement(By.xpath("//select[@name='dropdown2']"));
		Select dp2= new Select(drop2);
		dp2.selectByIndex(1);
		WebElement drop3 = driver.findElement(By.xpath("//select[@id='dropdown3']"));
		Select dp3= new Select(drop3);		
		dp3.selectByIndex(1);
		WebElement drop4 = driver.findElement(By.xpath("//select[@class='dropdown']"));
		Select dp4= new Select(drop4);
		dp4.selectByIndex(1);
		
		
				driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[5]/select")).sendKeys("Selenium");
		
		driver.findElement((By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"))).sendKeys("selenium");
	}

}
