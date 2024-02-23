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

TestData input = findTestData('Data Files/Customer')
for(int baris = 1; baris<=input.getRowNumbers();baris++) {
	WebUI.switchToDefaultContent()
	if(input.getValue('type', baris) == 'Personal') {
		WebUI.click(findTestObject('Object Repository/Baru3/Page_New Confins - Main/input_'+input.getValue('type', baris)))
		WebUI.click(findTestObject('Object Repository/Baru3/Page_New Confins - Main/input_Customer Name'))
		
		WebUI.setText(findTestObject('Object Repository/Baru3/Page_New Confins - Main/input_Customer Name_Value'), input.getValue('nama',baris))
		
		WebUI.click(findTestObject('Object Repository/Baru3/Page_New Confins Bro/SEARCHBARU'))
		
		WebUI.click(findTestObject('Object Repository/Baru3/Page_New Confins - Main/a_Select (1)'))
		
		id= WebUI.getAttribute(findTestObject('Object Repository/Baru3/Page_New Confins - Main/input_ID Number'), 'Value')
		
		println(id)
		
		if(id==input.getValue('id',baris)) {
			println('benar')
		}
		npwp = WebUI.getAttribute(findTestObject('Object Repository/Baru3/Page_New Confins - Main/input_NPWP'),'Value')
		
		println(npwp)
		
		if(npwp == input.getValue('npwp',baris)) {
			println('benar')
		}
		
		WebUI.click(findTestObject('Object Repository/Baru3/Page_New Confins Bro 2/input_-_lb_Form_SaveCont'))
	}else if(input.getValue('type', baris)=='Company') {
		println('yes')
	}
	
}

	

