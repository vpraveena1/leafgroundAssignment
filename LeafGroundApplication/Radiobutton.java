package LeafGroundApplication;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radiobutton {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Button.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("home")).click();
		driver.findElement(By.linkText("Radio Button")).click();
		driver.findElement(By.xpath("//input[@id='yes']")).click();
		driver.findElement(By.xpath("(//input[@name='news'])[1]")).click();
		driver.findElement(By.xpath("(//input[@class='myradio'])[3]")).click();
		
	}

}
