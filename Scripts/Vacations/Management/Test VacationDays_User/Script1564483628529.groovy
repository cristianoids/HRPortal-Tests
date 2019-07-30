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

WebUI.setText(findTestObject('Object Repository/Repository_Vacations/Test VacationDays_User/Page_Login/input_Remember login_WebPatterns_wt11blockwtUsernamewtUserNameInput'), 
    'ines.peguicha.dev')

WebUI.setEncryptedText(findTestObject('Object Repository/Repository_Vacations/Test VacationDays_User/Page_Login/input_Remember login_WebPatterns_wt11blockwtPasswordwtPasswordInput'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Repository_Vacations/Test VacationDays_User/Page_Login/input_Remember login_WebPatterns_wt11blockwtActionwtLoginButton'))

WebUI.click(findTestObject('Object Repository/Repository_Vacations/Test VacationDays_User/Page_HomePage/span_Let your employees schedule vacation and other absences review and choose whether to approve or not Customize holidays'))

WebUI.click(findTestObject('Object Repository/Repository_Vacations/Test VacationDays_User/Page_MyVacations/span_Management_Menu_DropDownArrow'))

WebUI.click(findTestObject('Object Repository/Repository_Vacations/Test VacationDays_User/Page_MyVacations/span_Vacation Days'))

WebUI.click(findTestObject('Object Repository/Repository_Vacations/Test VacationDays_User/Page_Vacation Days/a_Andr Vieira'))

WebUI.click(findTestObject('Object Repository/Repository_Vacations/Test VacationDays_User/Page_Vacation Day/div_Days By Law'))

WebUI.setText(findTestObject('Object Repository/Repository_Vacations/Test VacationDays_User/Page_Vacation Day/input_Days By Law_ITUpTheme_wt35blockwtMainContentwtVacationDays_DaysByLaw'), 
    '42')

WebUI.click(findTestObject('Object Repository/Repository_Vacations/Test VacationDays_User/Page_Vacation Day/input_Is Closed_ITUpTheme_wt35blockwtMainContentwt83'))

WebUI.closeBrowser()

