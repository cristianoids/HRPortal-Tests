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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://internal.itup.pt/Menu_HRPortal/')

WebUI.setText(findTestObject('Page_Login/input_Remember login_WebPatterns_wt11blockwtUsernamewtUserNameInput'), 'ines.peguicha.dev')

WebUI.setEncryptedText(findTestObject('Page_Login/input_Remember login_WebPatterns_wt11blockwtPasswordwtPasswordInput'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Page_Login/input_Remember login_WebPatterns_wt11blockwtActionwtLoginButton'))

WebUI.click(findTestObject('Page_HomePage/div_Time SheetsSubmit and review the time your team members are allocating to each project'))

WebUI.click(findTestObject('Page_MyTimeSheet/span_Approve Time Sheets_fa fa-fw fa-check-circle'))

WebUI.click(findTestObject('Object Repository/Repository_ApproveTimeSheet/Page_ListOfEmployeesToApproveTS/div_Pedro Paulino'))

WebUI.click(findTestObject('Object Repository/Repository_ApproveTimeSheet/Page_ListOfEmployeesToApproveTS/input_Total 40 hours'))

