package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplication {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		Thread.sleep(2000);
		WebElement eleuserName = driver.findElement(By.id("username"));
		eleuserName.sendKeys("Demosalesmanager");
		
		WebElement elePassword = driver.findElement(By.id("password"));
		elePassword.sendKeys("crmsfa");
		
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HCL Tech");
		
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sangeetha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sangeetha");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("R");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Testlead");
		driver.findElement(By.id("createLeadForm_dataSourceId")).sendKeys("Cold Call");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("03/6/90");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("TestLead");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("30000");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("ASIC53463");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("RE$%6");
		driver.findElement(By.id("createLeadForm_marketingCampaignId")).sendKeys("Automobile");
		
		driver.findElement(By.id("createLeadForm_industryEnumId")).sendKeys("Computer Software");
		driver.findElement(By.id("createLeadForm_ownershipEnumId")).sendKeys("Partnership");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Adding the details for Lead Page");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Adding the details for Lead Page");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("30000");
		
		
		//contact information 
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("22");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("123");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("43252454");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Raji");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Test@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.hcl.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("US");
		
		//Primary Address
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("sekar");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("3, Winston");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Kingwood");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Raji");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Houston");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Texas");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("6790086");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("002");
		
		//Submit
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.findElement(By.id("sectionHeaderTitle_leads")).getText());
		
		
		//
		
		
		

	}

}
