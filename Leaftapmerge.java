package Ajay;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import week6day2.Alert;

public class Leaftapmerge {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		// TODO Auto-generated method stub
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String text=driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Create Lead")).click();
	    driver.findElement(By.linkText("Merge Leads")).click();
	    driver.findElement(By.xpath("//span[text()='From Lead']/following::img")).click();
	    Set<String> childWindow=driver.getWindowHandles();
	    List<String>openedWindow=new ArrayList<String>(childWindow);	 
	    driver.switchTo().window(openedWindow.get(1));
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	    driver.switchTo().window(openedWindow.get(0));
	    driver.findElement(By.xpath("//span[text()='To Lead']/following::img")).click();
	    Set<String> childWindow1=driver.getWindowHandles();
	    List<String>openedWindow1=new ArrayList<String>(childWindow1);	 
	    driver.switchTo().window(openedWindow1.get(1));
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//div[contains(@class,'x-grid3-cell-inner')]/following::a[@class='linktext'][14]")).click();
	    driver.switchTo().window(openedWindow1.get(0));
	    driver.findElement(By.xpath("//a[text()='Merge']")).click();
	     driver.switchTo().alert().accept();

	    }

}
