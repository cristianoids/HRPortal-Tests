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

WebUI.callTestCase(findTestCase('Directory/Management/Test JobTitles'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://internal.itup.pt/Directory/JobTitle_List.aspx')

WebUI.click(findTestObject('Object Repository/Page_Directory - Job Titles/a_Add Job Title_1'))

WebUI.setText(findTestObject('Object Repository/Page_Directory - Job Titles/input_Job Title_ITUpTheme_wt4blockwtMainContentwtJobTitleTable_rowsctl34wtJobTitle_Name'), 
    'Teste')

WebUI.click(findTestObject('Object Repository/Page_Directory - Job Titles/i_Job Title_fa fa-check_1'))

