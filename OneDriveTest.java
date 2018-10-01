package pucrs.com.live.onedrive;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OneDriveTest {
	private WebDriver driver;

	@BeforeClass
	public static void setupClass() {
		WebDriverManager.chromedriver().setup();
	}

	@Before
	public void setupTest() {
		driver = new ChromeDriver();

		String initialPage = "https://www.americanas.com.br";
		driver.get(initialPage);
	}

	/*@After
	public void teardown() {
		if (driver != null)
			driver.close();
	}
*/
	// TODO: change name of method

	@Test
	public void ChangeName() {
		WebDriverWait wait = new WebDriverWait(driver, 10);

	//	WebElement barra_pesquisa = driver.findElement(By.id("h_search-input"));
		
		//barra_pesquisa.sendKeys("Fone JBL");
		//barra_pesquisa.submit();
		
  WebElement button = driver.findElement(By.id("h_search-input"));
button.sendKeys("Fone JBL");
   button.submit();

	}
}
