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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://internal.itup.pt/Menu_HRPortal/NoPermission.aspx')

WebUI.setText(findTestObject('Object Repository/Repository Allocation2/Repository_ListOfEmployees/Page_Login/input_Remember login_WebPatterns_wt11blockwtUsernamewtUserNameInput'), 
    'ines.peguicha.dev')

WebUI.setEncryptedText(findTestObject('Object Repository/Repository Allocation2/Repository_ListOfEmployees/Page_Login/input_Remember login_WebPatterns_wt11blockwtPasswordwtPasswordInput'), 
    'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Repository Allocation2/Repository_ListOfEmployees/Page_Login/input_Remember login_WebPatterns_wt11blockwtActionwtLoginButton'))

WebUI.click(findTestObject('Object Repository/Repository Allocation2/Repository_ListOfEmployees/Page_HomePage/div_AllocationManage your projects by easily defining allocation resources Visualize all your projects in a comprehensive way'))

WebUI.click(findTestObject('Repository Allocation2/Repository_MyAllocation/Repository_ListOfEmployees/Page_AllocationCalendar/a_List Of Employees'))

WebUI.setText(findTestObject('Object Repository/Repository Allocation2/Repository_ListOfEmployees/Page_List Of Employees/input_Only free_ITUpTheme_wt46blockwtMainContentwtSearchInput2'), 
    'ana')

WebUI.click(findTestObject('Object Repository/Repository Allocation2/Repository_ListOfEmployees/Page_List Of Employees/input_Only free_ITUpTheme_wt46blockwtMainContentwt18'))

WebUI.click(findTestObject('Object Repository/Repository Allocation2/Repository_ListOfEmployees/Page_List Of Employees/input_Only free_ITUpTheme_wt46blockwtMainContentwt20'))

WebUI.click(findTestObject('Object Repository/Repository Allocation2/Repository_ListOfEmployees/Page_List Of Employees/input_Only free_ITUpTheme_wt46blockwtMainContentwt50'))

WebUI.closeBrowser()

