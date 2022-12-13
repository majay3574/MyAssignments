package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {
	public static void main(String[] args) {
		//create the object
		ChromeDriver driver=new ChromeDriver();
		//load the Url 
		driver.get("http://leaftaps.com/opentaps/control/main");
		//it is use to maximize the browser
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCsr");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.partialLinkText("Create")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CAPCOM");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ajay");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Michael");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ajay");
		
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
		
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Software Tester");
		
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("0");
		
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("1234");
		
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Michael");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSE");
		
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("10000");
		
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("C");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("629004");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("xxxx");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("majay3574@gmail.com");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8428543434");
		
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("???");
		
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("temp Not available");
		
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("NA");
		
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Nanganallur");
		
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
		
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("620001");
		
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("NA");
		
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("NA");
		
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("Chennai P.o");
	
		driver.findElement(By.className("smallSubmit")).click();
		
	}

}
