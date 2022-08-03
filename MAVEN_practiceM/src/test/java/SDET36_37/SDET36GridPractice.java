package SDET36_37;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SDET36GridPractice {

	public static void main(String[] args) throws MalformedURLException 
	{
		//step 1: load the URL
		URL url=new URL("http://localhost:4444/wd/hub");
		
		//step 2: set desired capabilities
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		//step 3: load remote web driver
		RemoteWebDriver driver=new RemoteWebDriver(url,cap);
		
		//step 4: load the app
		driver.get("https://gmail.com");//done
	}

}
