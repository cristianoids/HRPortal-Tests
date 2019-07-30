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

WebUI.setText(findTestObject('Page_Login/input_Remember login_WebPatterns_wt11blockwtUsernamewtUserNameInput'), 'laura.fidalgo.dev')

WebUI.setEncryptedText(findTestObject('Page_Login/input_Remember login_WebPatterns_wt11blockwtPasswordwtPasswordInput'), 
    'Y1Nh4jfnDFCge6QYsO1dtg==')

WebUI.click(findTestObject('Page_Login/input_Remember login_WebPatterns_wt11blockwtActionwtLoginButton'))

WebUI.click(findTestObject('Page_HomePage/div_Time SheetsSubmit and review the time your team members are allocating to each project'))

WebUI.click(findTestObject('Page_MyTimeSheet/a_Management'))

WebUI.click(findTestObject('Page_MyTimeSheet/span_Report'))

WebUI.click(findTestObject('Object Repository/Repository_Report/Page_Report/span_(Org OSQuay 2)_fa fa-fw fa-angle-down'))

WebUI.click(findTestObject('Object Repository/Repository_Report/Page_Report/span_(Org OSQuay 2)_fa fa-fw fa-angle-down'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Repository_Report/Page_Report/select_(Select status)CompleteNot CompleteTo ApproveOvertime'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Repository_Report/Page_Report/input_Report_ITUpTheme_wt8blockwtMainContentwt17'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Repository_Report/Page_Report/select_(Select status)CompleteNot CompleteTo ApproveOvertime'), 
    '__ossli_0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Repository_Report/Page_Report/select_'), '772', true)

WebUI.click(findTestObject('Object Repository/Repository_Report/Page_Report/input_Report_ITUpTheme_wt8blockwtMainContentwt17'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Repository_Report/Page_Report/select_20202019201820172016'), 
    '2018', true)

WebUI.click(findTestObject('Object Repository/Repository_Report/Page_Report/input_Report_ITUpTheme_wt8blockwtMainContentwt17'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Repository_Report/Page_Report/select_JanuaryFebruaryMarchAprilMayJuneJulyAugustSeptemberOctoberNovemberDecember'), 
    '__ossli_4', true)

WebUI.click(findTestObject('Object Repository/Repository_Report/Page_Report/input_Report_ITUpTheme_wt8blockwtMainContentwt17'))

WebUI.click(findTestObject('Object Repository/Repository_Report/Page_Report/input_Report_ITUpTheme_wt8blockwtMainContentwt26'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Repository_Report/Page_Report/select_'), '__ossli_0', true)

WebUI.click(findTestObject('Object Repository/Repository_Report/Page_Report/input_Report_ITUpTheme_wt8blockwtMainContentwt17'))

WebUI.click(findTestObject('Object Repository/Repository_Report/Page_Report/input_Report_ITUpTheme_wt8blockwtActionswtExportButton'))

WebUI.closeBrowser()

