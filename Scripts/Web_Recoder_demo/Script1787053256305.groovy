import static com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('https://www.google.com')

WebUI.verifyTitle('Google')

WebUI.delay(2)

WebUI.closeBrowser()

