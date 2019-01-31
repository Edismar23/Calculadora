package Calculadora;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*
public class App{
	static WiniumDriver driver = null;
	static WiniumDriverService service = null;
	static DesktopOptions options = null;
	
	@BeforeMethod
	public static void main( String[] args ) throws IOException {
		options = new DesktopOptions();
		options.setApplicationPath("C:\\Windows\\System32\\calc.exe");
		File driverPath = new File("C:\\WiniumDriver\\Winium.Desktop.Driver.exe");
		service = new WiniumDriverService.Builder().usingDriverExecutable(driverPath).usingPort(9999).withVerbose(true).withSilent(false).buildDesktopService();
		service.start();
		driver = new WiniumDriver(service, options);
 		
}
	
	@Test
	public void calcular() throws InterruptedException{
		System.out.println("sdsffsf");
		WebElement calcFrame = driver.findElement(By.className("CalcFrame"));
		WebElement menu = calcFrame.findElement(By.className("MenuBar"));
		WebElement viewMenu = menu.findElement(By.className("Ver"));
		viewMenu.click();
		viewMenu.findElement(By.name("Estandar")).click();
		calcFrame.findElement(By.id("132")).click();
		calcFrame.findElement(By.id("93")).click();
		calcFrame.findElement(By.id("134")).click();
		calcFrame.findElement(By.id("121")).click();
	}	
}
*/

public class App {
	public static void main( String[] args ) throws IOException    {
		try {
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
    		//WebElement menu = calcFrame.findElement(By.className("MenuBar"));
    		//WebElement viewMenu = menu.findElement(By.className("Ver"));
    		//viewMenu.click();
    		//viewMenu.findElement(By.name("Estandar")).click();
    		calcFrame.findElement(By.id("132")).click();
    		calcFrame.findElement(By.id("93")).click();
    		calcFrame.findElement(By.id("134")).click();
    		calcFrame.findElement(By.id("121")).click();
    		}catch (Exception e)
		{
    			e.printStackTrace();
		}   		
    }
}
