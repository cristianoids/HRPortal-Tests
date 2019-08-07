import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class LoginSteps_BDD {
	@Given ("User navigates to login page")
	def navigateToLoginPage(){
		println ("\n I am inside NavigateToLoginPage")
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://internal.itup.pt/Menu_HRPortal/NoPermission.aspx')
	}

	@When ("User enters (.*) and (.*)")
	def entercredentials(String username, String password){
		println ("\n I am inside entercredentials")
		println ("Username:"+username)
		println ("Password:"+ password)
		WebUI.setText(findTestObject('Repository_Login/Page_Login/input_Remember login_WebPatterns_wt11blockwtUsernamewtUserNameInput'),
				'meri.hayrapetyan.dev')
		WebUI.setEncryptedText(findTestObject('Repository_Login/Page_Login/input_Remember login_WebPatterns_wt11blockwtPasswordwtPasswordInput'),
				'aeHFOx8jV/A=')
	}

	@And ("Clicks on login button")
	def clickLogin(){
		println ("\n I am inside clickLogin")
		WebUI.click(findTestObject('Repository_Login/Page_Login/input_Remember login_WebPatterns_wt11blockwtActionwtLoginButton'))
	}

	@Then ("User is navigated to Menu page")
	def verifyHomepage(){
		println ("\n I am inside Menu page")
		WebUI.closeBrowser()
	}
}





