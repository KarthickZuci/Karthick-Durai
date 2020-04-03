package test;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import frameWork.Log;
import frameWork.PropertyReader;
import pages.CaseCreation;

public class TestCasePatent extends CaseCreation{
	@BeforeClass
	public void testBeforeClass() throws IOException {
		before_Class(); 
	}
	
	@Test
	public void testCaseCreation() {
		String case_to_be_create=PropertyReader.readProperty("casetype_TestCaseTwo");
		testCaseID = "Patricia_CaseCreation";
		Log.startTestCase(testCaseID, "Test_Patricia_CaseCreation");
		try {
			//initialize the element
			message = incrementSteps() + " Initialize elements";
			initializeElement();
			Log.getReport(message);
			message = incrementSteps() + " Login to Patricia";
			//login into the application
			loginToPatricia();
			Log.getReport(message);
			//case creation
			caseCreation();
			Log.getReport(message);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		Log.endTestCase("Test_Patricia_CaseCreation");		
	}

	@AfterClass
	public void testAfterClass() throws InterruptedException {
		closeDriver();
	}
				
}