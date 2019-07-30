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

WebUI.setText(findTestObject('Page_Login/input_Remember login_WebPatterns_wt11blockwtUsernamewtUserNameInput'), 'pedro.paulino.dev')

WebUI.setEncryptedText(findTestObject('Page_Login/input_Remember login_WebPatterns_wt11blockwtPasswordwtPasswordInput'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Page_Login/input_Remember login_WebPatterns_wt11blockwtActionwtLoginButton'))

WebUI.click(findTestObject('Page_HomePage/div_Time SheetsSubmit and review the time your team members are allocating to each project'))

WebUI.click(findTestObject('Object Repository/Repository_MyTimeSheet/Page_MyTimeSheet/a_'))

WebUI.click(findTestObject('Object Repository/Repository_MyTimeSheet/Page_MyTimeSheet/span_Sun11_fa fa-fw fa-times'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Repository_MyTimeSheet/Page_MyTimeSheet/select_-AbsenceHolidaysOff-sickParental'), 
    '1687', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Repository_MyTimeSheet/Page_MyTimeSheet/select'), 'da69acaf-e56f-4028-b703-d824ab047ae6', 
    true)

WebUI.click(findTestObject('Object Repository/Repository_MyTimeSheet/Page_MyTimeSheet/div_HolidayVacationWeekend'))

WebUI.setText(findTestObject('Object Repository/Repository_MyTimeSheet/Page_MyTimeSheet/input_Development_ITUpTheme'), '8')

WebUI.setText(findTestObject('Object Repository/Repository_MyTimeSheet/Page_MyTimeSheet/input_Weekend_ITUpTheme (3)'), '8')

WebUI.setText(findTestObject('Object Repository/Repository_MyTimeSheet/Page_MyTimeSheet/input_Weekend_ITUpTheme'), '8')

WebUI.setText(findTestObject('Object Repository/Repository_MyTimeSheet/Page_MyTimeSheet/input_Weekend_ITUpTheme'), '8')

WebUI.click(findTestObject('Object Repository/Repository_MyTimeSheet/Page_MyTimeSheet/span'))

WebUI.setText(findTestObject('Object Repository/Repository_MyTimeSheet/Page_MyTimeSheet/input_Weekend_ITUpTheme'), '8')

WebUI.click(findTestObject('Object Repository/Repository_MyTimeSheet/Page_MyTimeSheet/input_Add Project_ITUpTheme_wt17blockwtMainContentwt7wtSubmitButton'))

