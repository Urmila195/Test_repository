
public class LauncgChromedriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\Driver\chromedriver_win32.exe");
		WebDriver.driver = new ChromeDriver();
		driver.get("https://qatest2.angular.nimbustest.xyz/login");
		System.out.println(driver.getTitle());
		
	}

}
//import la opption pn ny yetey
	