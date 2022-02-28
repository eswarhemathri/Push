package com.adactin.baseclass;

import java.awt.AWTException;
import java.awt.Frame;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver;
	public static WebDriver brouserLaunch(String brousername) {
		
		if(brousername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Eswar\\Desktop\\eclipse\\Adactin\\driver\\chromedriver 98.exe");
			driver = new ChromeDriver();
		}
		else if (brousername.equalsIgnoreCase("fifefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Eswar\\eclipse-workspace\\Selinium_6Pm\\Driver\\firefox.exe");
			driver = new FirefoxDriver();
			
		}
		else
		{
		System.out.println("Invalid Browser");
		}
		
		driver.manage().window().maximize();
		
		return driver;
		}
	
/////////////////////////////////////////////////////////////////////////
	public static void launchUrl(String url) {
		driver.get(url);
	}
///////////////////////////////////////////////////////////////////////	
	public void closewindow()
	{
		driver.close();
	}
/////////////////////////////////////////////////////////////////////////	
	public void quitwindow()
	{
		driver.quit();
	}
///////////////////////////////////////////////////////////////////////////	
	
	public void navigateTo(String url)
	{
       driver.navigate().to(url);
		
	}
	
	public void navigateBack()
	{
       driver.navigate().back();
		
	}
	
	public void navigateForward()
	{
       driver.navigate().forward();;
		
	}
	
	public void refreshPage()
	{
       driver.navigate().refresh();;
		
	}
////////////////////////////////////////////////////////////////////////////	
	public void alertAccept() {
	
	driver.switchTo().alert().accept();
	
	}
	public void alertDismiss()
	{
	
		driver.switchTo().alert().dismiss();
	}
	
///////////////////////////////////////////////////////////////////////////////
	
	public static void actionClick(WebElement element) {
	
	 element.click();
		
	}
	
	public void contextClick(WebElement element) {
       
		Actions ac = new Actions(driver);
		ac.contextClick(element).build().perform();
	}
	
	public void doubleClick(WebElement element)
	{
		Actions ac = new Actions(driver);
		ac.doubleClick(element).build().perform();	
		
	}
	
	public void moveToElement(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();	
		
	}
	
	public void dragAndDrop(WebElement source,WebElement target) {
		Actions ac = new Actions(driver);
		ac.dragAndDrop(source, target).build().perform();	
		
	}
	
///////////////////////////////////////////////////////////////////////////////////	
	
	public void frameId(String Id) {
    
		driver.switchTo().frame(Id);
	}
	
	public void frameWebelement(WebElement element) {
	    
		driver.switchTo().frame(element);
	}
	
	public void frameIndex(int Index) {
	    
		driver.switchTo().frame(Index);
	}
	
//////////////////////////////////////////////////////////////////////////////////
	
	public void robotClass() throws AWTException {

Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	
//////////////////////////////////////////////////////////////////////////////
	public void getWindowHandles() {

		Set<String> all_Id = driver.getWindowHandles();
		
		for(String st : all_Id) {
			
			String title = driver.switchTo().window(st).getTitle();
			
		}
		}
	
	public void getWindowHandle() {

		Set<String> Id = driver.getWindowHandles();
		
		for(String st : Id) {
			
			String title = driver.switchTo().window(st).getTitle();
			
		}
		}
////////////////////////////////////////////////////////////////////////////////
	public static void selectbyValue(WebElement element,String value) {
    
		Select s = new Select(element);
		s.selectByValue(value);
	}
	
	public static void selectbyText(WebElement element,String value) {
	    
		Select s = new Select(element);
		s.selectByVisibleText(value);
	}
	
	public static void selectbyIndex(WebElement element,int string) {
	    
		Select s = new Select(element);
		s.selectByIndex(string);
	}
////////////////////////////////////////////////////////////////////////////////////
	
	public void is_enable(WebElement element)
	{
		Select s = new Select(element);
		
		boolean enabled = element.isEnabled();
		
		if (enabled==true) {
			System.out.println("Enable");
		} else {
            System.out.println("Not Enable");
		}
	}
	
	public void is_displayed(WebElement element)
	{
		Select s = new Select(element);
		
		boolean displayed = element.isDisplayed();
		
		if (displayed==true) {
			System.out.println("Display");
		} else {
            System.out.println("Not Display");
		}
	}
	
	public void is_selected(WebElement element)
	{
		Select s = new Select(element);
		
		boolean selected = element.isSelected();
		
		if (selected==true) {
			System.out.println("Selected");
		} else {
            System.out.println("Not Selected");
		}
	}
	
	public void is_multiple(WebElement element)
	{
		Select s = new Select(element);
		
		boolean element1 = s.isMultiple();
		
		if (element1==true) {
			System.out.println("multiple");
		} else {
            System.out.println("Not multiple");
		}
	}
/////////////////////////////////////////////////////////////////////////////////////////////
	
	public void getOption(WebElement element) {
		
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		
		for (WebElement webElement : options) {
		String text = webElement.getText();
		System.out.println(text);
	
		}
	}
	
	public void getFirstselectedoption(WebElement element) {

		Select s = new Select(element);
		List<WebElement> option = (List<WebElement>) s.getFirstSelectedOption();
	}
	
	public void getAllselectedoption(WebElement element) {

		Select s = new Select(element);
		List<WebElement> options = (List<WebElement>) s.getAllSelectedOptions();

	}
	
	
	public void getTitle() {

		String title = driver.getTitle();
        System.out.println("title");
		
	}
	
	public void getCurrentUrl() {

		String Url = driver.getCurrentUrl();
        System.out.println("Url");
		
	}
	
	public void getText(WebElement element) {

		String text = element.getText();
		System.out.println(text);
	}
	
	public void getAttribute(WebElement element,String name) {

		String attribute = element.getAttribute(name);
		System.out.println("attribute");
		
	}
////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static void implicitWait() {

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////
	public void screenShot() throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("path//name.format");
		FileUtils.copyFile(source, destination);
	}
	
	public void javaScriptExecuter(WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("argument[0], scrollIntoview();",element);
		js.executeScript("window.scrollBy(0,range);");
	}
//////////////////////////////////////////////////////////////////////////////////////////////	
	public static void sendKeys(WebElement element,String s) {

		element.sendKeys(s);
		
	}
	
	
	
	
	
}
