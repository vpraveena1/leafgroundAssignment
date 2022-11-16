package LeafGroundApplication;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Button.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("home")).click();
		driver.findElement(By.linkText("Image")).click();
		driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
		driver.findElement(By.linkText("Image")).click();
		driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']")).click();
		driver.findElement(By.xpath("//img[@src='../images/keyboard.png']")).click();
		driver.findElement(By.linkText("Image")).click();
	}

}
