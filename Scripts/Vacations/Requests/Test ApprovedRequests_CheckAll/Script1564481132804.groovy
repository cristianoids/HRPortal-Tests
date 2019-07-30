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

WebUI.navigateToUrl('https://internal.itup.pt/Menu_HRPortal/NoPermission.aspx')

WebUI.setText(findTestObject('Object Repository/Repository_Vacations/Test Aprove_Requests_CheckAll/Page_Login/input_Remember login_WebPatterns_wt11blockwtUsernamewtUserNameInput'), 
    'ines.peguicha.dev')

WebUI.setEncryptedText(findTestObject('Object Repository/Repository_Vacations/Test Aprove_Requests_CheckAll/Page_Login/input_Remember login_WebPatterns_wt11blockwtPasswordwtPasswordInput'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Repository_Vacations/Test Aprove_Requests_CheckAll/Page_Login/input_Remember login_WebPatterns_wt11blockwtActionwtLoginButton'))

WebUI.click(findTestObject('Object Repository/Repository_Vacations/Test Aprove_Requests_CheckAll/Page_HomePage/div_VacationLet your employees schedule vacation and other absences review and choose whether to approve or not Customize holidays'))

WebUI.click(findTestObject('Object Repository/Repository_Vacations/Test Aprove_Requests_CheckAll/Page_MyVacations/a_Requests'))

WebUI.click(findTestObject('Object Repository/Repository_Vacations/Test Aprove_Requests_CheckAll/Page_MyVacations/span_Approved Requests'))

WebUI.click(findTestObject('Object Repository/Repository_Vacations/Test Aprove_Requests_CheckAll/Page_MyTeamVacations/input_Employees_ITUpTheme_wt14blockwtMainContentWebPatterns_wt9blockwtItemsWebPatterns_wt20blockwtTitlewtCheckEmployees'))

WebUI.closeBrowser()

