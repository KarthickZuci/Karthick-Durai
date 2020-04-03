package pages;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import frameWork.PropertyReader;

public class CaseCreation extends webAction {

	String newCase;
	
	//locators for case creation
	@FindBy(xpath="//div[@class='v-csslayout v-layout v-widget nav-menu-open-button v-csslayout-nav-menu-open-button']")
	public static WebElement btnHomepageMenu;
	@FindBy(xpath="//span[text()='Create Case']") 
	public static WebElement creatCaseOption;
	@FindBy(xpath="//div[text()='Case type']/following::input") 
	public static WebElement caseTypeSelection;
	@FindBy(xpath="//div[text()='Country']/following::input") 
	public static WebElement countrySelection;
	@FindBy(xpath="//div[text()='Application type']/following::input")
	public static WebElement applicationTypeSelection;
	@FindBy(xpath="//div[text()='Catchword']/following::input")
	public static WebElement catchwordField;
	@FindBy(xpath="//div[text()='Service level']/following::input")
	public static WebElement serviceLevelSelection;
	@FindBy(xpath="//div[text()='Team']/following::input") 
	public static WebElement teamSelection;
	@FindBy(xpath="//div[9]//div[1]//div[2]//input[1]") 
	public static WebElement desgCountries;
	@FindBy(xpath="//div[text()='Classes']/following::input") 
	public static WebElement classes;
	@FindBy(xpath="//span[text()='ADD CLASS']") 
	public static WebElement addButton;
	
	//extra fields
	/*@FindBy(xpath="//div[@class='v-button v-widget blue-button v-button-blue-button primary-button v-button-primary-button']") 
	public static WebElement btncaseCreationOk;*/
	
	//This method is to wait the driver upto expected conditions
	public void driverUntilWait() {
		
		WebDriverWait driverwait=new WebDriverWait(driver, 10);
		driverwait.until(ExpectedConditions.titleContains("1"));
	}
	
	//This method is to get the newly created case No.
	public void caseNO() {
		driverUntilWait();
		 newCase=driver.getTitle();
		
	}
		
	//This method is to perform the case creation process
	public void caseCreation() throws IOException, InterruptedException, AWTException  {
		
			excelFileReaderOfNumeric("CaseCreation_Patent");
				driverWait();
				btnHomepageMenu.click();
				driverWait();
				creatCaseOption.click();
				driverWait();
				//Enter the case type
				//excelFileReaderOfNumeric("CaseCreation_Patent", "Case type");
				System.out.println(excelHashMap.size());
				caseTypeSelection.sendKeys(excelHashMap.get("Case type"));
				driverWait();
				keyboardAction().keyPress(KeyEvent.VK_ENTER);
				keyboardAction().keyRelease(KeyEvent.VK_ENTER);
				driverWait();
				//Enter the country
			//	excelFileReaderOfNumeric("CaseCreation_Patent", "Country");
				countrySelection.sendKeys(excelHashMap.get("Country"));
				driverWait();
				keyboardAction().keyPress(KeyEvent.VK_ENTER);
				keyboardAction().keyRelease(KeyEvent.VK_ENTER);
				driverWait();
				//Enter the application type
				//excelFileReaderOfNumeric("CaseCreation_Patent", "Application type");
				driverWait();
				driverWait();
				driverUntilWait(applicationTypeSelection);
				applicationTypeSelection.sendKeys(excelHashMap.get("Application type"));
				driverWait();
				keyboardAction().keyPress(KeyEvent.VK_ENTER);
				keyboardAction().keyRelease(KeyEvent.VK_ENTER);
				driverWait();
				//Enter the catchword
				//excelFileReaderOfNumeric("CaseCreation_Patent", "Catchword");
				catchwordField.sendKeys(excelHashMap.get("Catchword"));
				driverWait();
				//Enter the service level
				//excelFileReaderOfNumeric("CaseCreation_Patent", "Service level");
				serviceLevelSelection.sendKeys(excelHashMap.get("Service level"));
				driverWait();
				keyboardAction().keyPress(KeyEvent.VK_ENTER);
				keyboardAction().keyRelease(KeyEvent.VK_ENTER);
				driverWait();
				//Enter the team
				//excelFileReaderOfNumeric("CaseCreation_Patent", "Team");
				teamSelection.sendKeys(excelHashMap.get("Team"));
				driverWait();
				keyboardAction().keyPress(KeyEvent.VK_ENTER);
				keyboardAction().keyRelease(KeyEvent.VK_ENTER);
				driverWait();
				//Enter the Designation Countries
				driverWait();
				//excelFileReaderOfNumeric("CaseCreation_Patent", "Designation");
				desgCountries.sendKeys(excelHashMap.get("Designation"));
				driverWait();
				keyboardAction().keyPress(KeyEvent.VK_ENTER);
				keyboardAction().keyRelease(KeyEvent.VK_ENTER);
				driverWait();
				//Enter the Classes
				driverWait();
				System.out.println(excelCellValue);
				//excelFileReaderOfNumeric("Classes");
				//excelFileReaderOfNumeric("CaseCreation_Patent", "Classes");
				classes.sendKeys(excelHashMap.get("Classes"));
				driverWait();
				keyboardAction().keyPress(KeyEvent.VK_ENTER);
				keyboardAction().keyRelease(KeyEvent.VK_ENTER);
				driverWait();
				//Click Add Button
				driverWait();
				addButton.click();
				driverWait();
				keyboardAction().keyPress(KeyEvent.VK_ENTER);
				keyboardAction().keyRelease(KeyEvent.VK_ENTER);
				driverWait();
				keyboardAction().keyPress(KeyEvent.VK_ENTER);
				keyboardAction().keyRelease(KeyEvent.VK_ENTER);	
				driverWait();
//				} else {
//				
//				driverWait();
//				btnHomepageMenu.click();
//				driverWait();
//				creatCaseOption.click();
//				driverWait();
//				//Enter the case type
//				caseTypeSelection.sendKeys(excelFileReader("Case type"));
//				driverWait();
//				keyboardAction().keyPress(KeyEvent.VK_ENTER);
//				keyboardAction().keyRelease(KeyEvent.VK_ENTER);
//				driverWait();
//				//Enter the country
//				countrySelection.sendKeys(excelFileReader("Country"));
//				driverWait();
//				keyboardAction().keyPress(KeyEvent.VK_ENTER);
//				keyboardAction().keyRelease(KeyEvent.VK_ENTER);
//				driverWait();
//				//Enter the application type
//				applicationTypeSelection.sendKeys(excelFileReader("Application type"));
//				driverWait();
//				keyboardAction().keyPress(KeyEvent.VK_ENTER);
//				keyboardAction().keyRelease(KeyEvent.VK_ENTER);
//				driverWait();
//				//Enter the catchword
//				catchwordField.sendKeys(excelFileReader("Catchword"));
//				driverWait();
//				//Enter the service level
//				serviceLevelSelection.sendKeys(excelFileReader("Service level"));
//				driverWait();
//				keyboardAction().keyPress(KeyEvent.VK_ENTER);
//				keyboardAction().keyRelease(KeyEvent.VK_ENTER);
//				driverWait();
//				//Enter the team
//				teamSelection.sendKeys(excelFileReader("Team"));
//				driverWait();
//				keyboardAction().keyPress(KeyEvent.VK_ENTER);
//				keyboardAction().keyRelease(KeyEvent.VK_ENTER);
//			}
//			
						driverUntilWait();
			caseNO();
//			//Generate the report with created CaseNo.
			message = incrementSteps() + " Case Creation - Created Case No : "+newCase; 
//			
			excelFileWriter("Create_CaseNo",newCase);
//			
//			 			
//		} catch (Exception e) {
//			e.printStackTrace();
//			Assert.fail("Case Creation Process not completed");
//		}
//	}
	
	}								
		}
