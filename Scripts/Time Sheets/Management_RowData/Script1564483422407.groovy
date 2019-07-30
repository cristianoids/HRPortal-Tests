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

WebUI.setText(findTestObject('Repository_TimeSheet/Repository_RowData/Page_Login/input_Remember login_WebPatterns_wt11blockwtUsernamewtUserNameInput'), 
    'laura.fidalgo.dev')

WebUI.setEncryptedText(findTestObject('Repository_TimeSheet/Repository_RowData/Page_Login/input_Remember login_WebPatterns_wt11blockwtPasswordwtPasswordInput'), 
    'Y1Nh4jfnDFCge6QYsO1dtg==')

WebUI.click(findTestObject('Repository_TimeSheet/Repository_RowData/Page_Login/input_Remember login_WebPatterns_wt11blockwtActionwtLoginButton'))

WebUI.click(findTestObject('Repository_TimeSheet/Repository_RowData/Page_HomePage/div_Time SheetsSubmit and review the time your team members are allocating to each project'))

WebUI.click(findTestObject('Repository_TimeSheet/Repository_RowData/Page_MyTimeSheet/a_Management'))

WebUI.click(findTestObject('Repository_TimeSheet/Repository_RowData/Page_MyTimeSheet/span_RowData'))

WebUI.click(findTestObject('Repository_TimeSheet/Repository_RowData/Page_RowData/td_28'))

WebUI.click(findTestObject('Repository_TimeSheet/Repository_RowData/Page_RowData/input_Download Time sheets_ITUpTheme_wt23blockwtMainContentwt60'))

WebUI.click(findTestObject('Repository_TimeSheet/Repository_RowData/Page_RowData/td_17'))

WebUI.click(findTestObject('Repository_TimeSheet/Repository_RowData/Page_RowData/input_Download Time sheets_ITUpTheme_wt23blockwtMainContentwt60'))

WebUI.setText(findTestObject('Repository_TimeSheet/Repository_RowData/Page_RowData/input_Download Time sheets_ITUpTheme_wt23blockwtMainContentwtproject'), 
    'Test')

WebUI.click(findTestObject('Repository_TimeSheet/Repository_RowData/Page_RowData/a_201801-ITUP-INT_TtT'))

WebUI.click(findTestObject('Repository_TimeSheet/Repository_RowData/Page_RowData/input_Download Time sheets_ITUpTheme_wt23blockwtMainContentwt60'))

WebUI.setText(findTestObject('Repository_TimeSheet/Repository_RowData/Page_RowData/input_Download Time sheets_ITUpTheme_wt23blockwtMainContentwtemployee'), 
    'Laura')

WebUI.click(findTestObject('Repository_TimeSheet/Repository_RowData/Page_RowData/input_Download Time sheets_ITUpTheme_wt23blockwtMainContentwt60'))

WebUI.click(findTestObject('Repository_TimeSheet/Repository_RowData/Page_RowData/input_Download Time sheets_ITUpTheme_wt23blockwtMainContentwt6'))

WebUI.setText(findTestObject('Repository_TimeSheet/Repository_RowData/Page_RowData/input_Download Time sheets_ITUpTheme_wt23blockwtMainContentwtemployee'), 
    'Laura')

WebUI.click(findTestObject('Repository_TimeSheet/Repository_RowData/Page_RowData/ui-autocomplete-item_Laura Fidalgo'))

WebUI.click(findTestObject('Repository_TimeSheet/Repository_RowData/Page_RowData/input_Download Time sheets_ITUpTheme_wt23blockwtMainContentwt60'))

WebUI.click(findTestObject('Repository_TimeSheet/Repository_RowData/Page_RowData/input_Is Billable_ITUpTheme_wt23blockwtMainContentwt10'))

WebUI.closeBrowser()

