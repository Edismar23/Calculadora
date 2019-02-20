package Calculadora;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;


public class App {
	public static void main( String[] args ) throws IOException    {
			WiniumDriver driver = null;
			WiniumDriverService service = null;
			DesktopOptions options = null;
    		options = new DesktopOptions();
    		options.setApplicationPath("C:\\Windows\\System32\\calc.exe");
    		File driverPath = new File("C:\\WiniumDriver\\Winium.Desktop.Driver.exe");
    		service = new WiniumDriverService.Builder().usingDriverExecutable(driverPath).usingPort(9999).withVerbose(true).withSilent(false).buildDesktopService();
    		service.start();
     		driver = new WiniumDriver(service, options);
    		WebElement calcFrame = driver.findElement(By.className("CalcFrame"));
    		calcFrame.findElement(By.id("132")).click();
    		calcFrame.findElement(By.id("93")).click();
    		calcFrame.findElement(By.id("134")).click();
    		calcFrame.findElement(By.id("121")).click();
    		service.stop();
   		
    }
	
}
