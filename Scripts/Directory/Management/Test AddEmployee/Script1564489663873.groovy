import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://internal.itup.pt/Directory/Employee_Edit.aspx')

WebUI.setText(findTestObject('Page_Directory - New Employee/input_Name_ITUpTheme_wt151blockwtMainContentwtEmployee_FirstName'), 
    'teste7')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Directory - New Employee/select'), '776', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Directory - New Employee/select_ (1)'), '772', true)

WebUI.setText(findTestObject('Object Repository/Page_Directory - New Employee/input_Email'), 'beaa@gmail.com')

WebUI.setText(findTestObject('Page_Directory - New Employee/input_Entry Date_ITUpTheme_wt151blockwtMainContentwtEmployee_EntryDate'), 
    '2019-02-13')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Directory - New Employee/select_-IT'), '4', true)

WebUI.click(findTestObject('Page_Directory - New Employee/input_Required field_ITUpTheme_wt151blockwtMainContentwt110'))

WebUI.closeBrowser()

