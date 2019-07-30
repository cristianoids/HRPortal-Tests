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

WebUI.click(findTestObject('Object Repository/Repository_Allocation/Repository_Management/Page_Login/div_CDATAOsInputPrompt'))

WebUI.setText(findTestObject('Object Repository/Repository_Allocation/Repository_Management/Page_Login/input_Remember login_WebPatterns_wt11blockwtUsernamewtUserNameInput'), 
    'laura.fidalgo.dev')

WebUI.setEncryptedText(findTestObject('Object Repository/Repository_Allocation/Repository_Management/Page_Login/input_Remember login_WebPatterns_wt11blockwtPasswordwtPasswordInput'), 
    'Y1Nh4jfnDFCge6QYsO1dtg==')

WebUI.sendKeys(findTestObject('Object Repository/Repository_Allocation/Repository_Management/Page_Login/input_Remember login_WebPatterns_wt11blockwtPasswordwtPasswordInput'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Repository_Allocation/Repository_Management/Page_HomePage/div_AllocationManage'))

WebUI.click(findTestObject('Object Repository/Repository_Allocation/Repository_Management/Page_AllocationCalendar/a_Management'))

WebUI.click(findTestObject('Object Repository/Repository_Allocation/Repository_Management/Page_AllocationCalendar/span_Grant Roles'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Repository_Allocation/Repository_Management/Page_Grant Roles/select_User'), 
    '6524', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Repository_Allocation/Repository_Management/Page_Grant Roles/select_User'), 
    '2004', true)

WebUI.closeBrowser()

