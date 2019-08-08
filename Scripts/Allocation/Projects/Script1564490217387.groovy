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

WebUI.setText(findTestObject('Page_Login/input_Remember login_WebPatterns_wt11blockwtUsernamewtUserNameInput'), 'laura.fidalgo.dev')

WebUI.setEncryptedText(findTestObject('Page_Login/input_Remember login_WebPatterns_wt11blockwtPasswordwtPasswordInput'), 
    'Y1Nh4jfnDFCge6QYsO1dtg==')

WebUI.click(findTestObject('Page_Login/input_Remember login_WebPatterns_wt11blockwtActionwtLoginButton'))

WebUI.click(findTestObject('Repository_Allocation/Repository_Projects/Page_HomePage/div_AllocationManage'))

WebUI.click(findTestObject('Repository_Allocation/Repository_Management/Repository_Projects/Page_AllocationCalendar/a_Projects'))

WebUI.click(findTestObject('Repository_Allocation/Repository_Projects/Page_Projects/input_Create a new Project_ITUpTheme_wt29blockwtMainContentwt45'))

WebUI.click(findTestObject('Repository_Allocation/Repository_Projects/Page_Projects/input_Create a new Project_ITUpTheme_wt29blockwtMainContentwt45_1'))

WebUI.click(findTestObject('Repository_Allocation/Repository_Projects/Page_Projects/input_Is Closed_ITUpTheme_wt29blockwtMainContentwtActiveCheckbox'))

WebUI.click(findTestObject('Repository_Allocation/Repository_Projects/Page_Projects/input_Is Closed_ITUpTheme_wt29blockwtMainContentwtActiveCheckbox_1'))

WebUI.setText(findTestObject('Repository_Allocation/Repository_Projects/Page_Projects/input_Create a new Project_ITUpTheme_wt29blockwtMainContentwtSearchInput'), 
    'Core')

WebUI.click(findTestObject('Repository_Allocation/Repository_Projects/Page_Projects/input_Create a new Project_ITUpTheme_wt29blockwtMainContentwt46'))

WebUI.click(findTestObject('Repository_Allocation/Repository_Projects/Page_Projects/input_Create a new Project_ITUpTheme_wt29blockwtMainContentwt14'))

WebUI.selectOptionByValue(findTestObject('Repository_Allocation/Repository_Projects/Page_Projects/select_(All Project Types)ProjectVacationsAbsence'), 
    '1', true)

WebUI.click(findTestObject('Repository_Allocation/Repository_Projects/Page_Projects/input_Create a new Project_ITUpTheme_wt29blockwtMainContentwt46'))

WebUI.click(findTestObject('Repository_Allocation/Repository_Projects/Page_Projects/input_Create a new Project_ITUpTheme_wt29blockwtMainContentwt14'))

WebUI.selectOptionByValue(findTestObject('Repository_Allocation/Repository_Projects/Page_Projects/select_(All Responsibles)'), 
    '2188', true)

WebUI.click(findTestObject('Repository_Allocation/Repository_Projects/Page_Projects/input_Create a new Project_ITUpTheme_wt29blockwtMainContentwt46'))

WebUI.click(findTestObject('Repository_Allocation/Repository_Projects/Page_Projects/input_Create a new Project_ITUpTheme_wt29blockwtMainContentwt14'))

WebUI.click(findTestObject('Repository_Allocation/Repository_Projects/Page_Projects/a_Create a new Project'))

WebUI.click(findTestObject('Repository_Allocation/Repository_Projects/Page_New Project/input_Is Active_ITUpTheme_wt69blockwtMainContentwt22'))

WebUI.closeBrowser()

