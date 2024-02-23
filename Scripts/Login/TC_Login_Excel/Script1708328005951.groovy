import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

TestData input = findTestData('Data Files/Data_Login/Login_Positif')
WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URLCONFNS)

WebUI.maximizeWindow()

for(int baris = 1; baris<=input.getRowNumbers();baris++) {
	WebUI.setText(findTestObject('Login_Spy/Login_Spy/Input_username'), input.getValue('username', baris))
	
	WebUI.setText(findTestObject('Login_Spy/Login_Spy/input_password'), input.getValue('password', baris))
	
	//WebUI.setText(findTestObject('Login_Spy/Login_Spy/input_password'), GlobalVariable.password)
	
	WebUI.click(findTestObject('Login_Spy/Login_Spy/button_login'))
	
	WebUI.delay(2)
	
	WebUI.takeScreenshot()
	
	WebUI.verifyTextPresent(input.getValue('message', baris), false)
}




