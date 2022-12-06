import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('001 Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_Digital Smart Care/input'), '082125677713')

WebUI.click(findTestObject('Object Repository/Page_Digital Smart Care/i_Rp_searchInput'))

WebUI.click(findTestObject('Object Repository/Page_Digital Smart Care/div_Manage Order'))

WebUI.click(findTestObject('Object Repository/Page_Digital Smart Care/span_Modify Offer'))

WebUI.click(findTestObject('Object Repository/Page_Digital Smart Care/button_Tambah'))

WebUI.click(findTestObject('Object Repository/Page_Digital Smart Care/span_Pilih paket anda_Select-arrow'))

WebUI.click(findTestObject('Page_Digital Smart Care/nama_paket'))

WebUI.click(findTestObject('Object Repository/Page_Digital Smart Care/button_Lanjut'))

WebUI.click(findTestObject('Page_Digital Smart Care/button_OK2'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Digital Smart Care/label_Completed'), 'Completed')

