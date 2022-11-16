package LeafGroundApplication;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Editpage {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Edit.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("email")).sendKeys("vpraveena@gmail.com");
		driver.findElement(By.xpath("//input[@value='Append']")).click();
		driver.findElement(By.xpath("//input[@value='TestLeaf']")).click();
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).click();
		System.out.println(driver.getTitle());
		

	}

}
