import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To get enable the test chrome
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.selenium.dev/downloads/");

	}

}
