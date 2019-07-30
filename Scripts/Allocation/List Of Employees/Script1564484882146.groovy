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

WebUI.click(findTestObject('Repository_Allocation/Repository_ListEmployAlloc/Page_HomePage/div_AllocationManage'))

WebUI.click(findTestObject('Repository_Allocation/Repository_ListEmployAlloc/Page_AllocationCalendar/a_List Of Employees'))

WebUI.click(findTestObject('Repository_Allocation/Repository_ListEmployAlloc/Page_List Of Employees/input_Only free_ITUpTheme_wt46blockwtMainContentwt50'))

WebUI.click(findTestObject('Repository_Allocation/Repository_ListEmployAlloc/Page_List Of Employees/input_Only free_ITUpTheme_wt46blockwtMainContentwt50_1'))

WebUI.setText(findTestObject('Repository_Allocation/Repository_ListEmployAlloc/Page_List Of Employees/input_Only free_ITUpTheme_wt46blockwtMainContentwtSearchInput2'), 
    'Ana')

WebUI.click(findTestObject('Repository_Allocation/Repository_ListEmployAlloc/Page_List Of Employees/input_Only free_ITUpTheme_wt46blockwtMainContentwt18'))

WebUI.click(findTestObject('Repository_Allocation/Repository_ListEmployAlloc/Page_List Of Employees/input_Only free_ITUpTheme_wt46blockwtMainContentwt20'))

WebUI.click(findTestObject('Repository_Allocation/Repository_ListEmployAlloc/Page_List Of Employees/a_next'))

WebUI.click(findTestObject('Repository_Allocation/Repository_ListEmployAlloc/Page_List Of Employees/a_previous'))

WebUI.closeBrowser()

