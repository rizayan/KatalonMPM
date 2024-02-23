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

WebUI.click(findTestObject('Page_New Confins - Main/Page_New Confins - Main/Menu Lidt'))

WebUI.delay(2)

WebUI.switchToFrame(findTestObject('Page_New Confins - Main/Page_New Confins - Main/Page_New Confins - Main/Page_New Confins - Main/iframe_Welcome, Anita Gusti, KEDOYA, Credit Admin_treeContainer'), 
    0)

WebUI.click(findTestObject('Login_Spy/Login_Spy/Button_Loan'))

WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Baru/Page_New Confins - Main/a_New App Motorcycle'))

WebUI.click(findTestObject('Baru/Page_New Confins - Main/a_Add'))

WebUI.click(findTestObject('Object Repository/Baru/Page_New Confins - Main/input_Product Offering Name_ucLookupProdOfferuclProductOfferingimb'))

WebUI.click(findTestObject('Object Repository/Baru/Page_New Confins - Main/Page_New Confins - Main/input_Product Offering Name2'))

WebUI.click(findTestObject('Baru/Page_New Confins - Main/Page_New Confins - Main/input_Product1'))

WebUI.setText(findTestObject('Baru/Page_New Confins - Main/Page_New Confins - Main/input_Product1'), '%')

WebUI.click(findTestObject('Object Repository/Baru/Page_New Confins - Main/Page_New Confins - Main/input_Product Offering Name2'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Baru/Page_New Confins - Main/Page_New Confins - Main/a_SEARCH'))

WebUI.click(findTestObject('Baru/Page_New Confins - Main/a_Select'))

WebUI.click(findTestObject('Baru/Page_New Confins - Main/Page_New Confins - Main/Page_New Confins - Main/Page_New Confins - Main/a_Next'))

