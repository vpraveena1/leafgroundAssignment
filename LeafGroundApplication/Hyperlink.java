package LeafGroundApplication;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hyperlink {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Button.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("home")).click();
		driver.findElement(By.linkText("HyperLink")).click();
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.findElement(By.linkText("HyperLink")).click();
		driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).click();
		driver.findElement(By.id("home")).click();
		driver.findElement(By.linkText("HyperLink")).click();
		driver.findElement(By.linkText("Verify am I broken?")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://testleaf.herokuapp.com/pages/Link.html");
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.findElement(By.linkText("How many links are available in this page?")).click();
	}

}
