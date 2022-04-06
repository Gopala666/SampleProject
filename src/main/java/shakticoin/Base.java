package shakticoin;

import java.io.File;

import java.net.MalformedURLException;

import java.net.URL;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.AndroidElement;

import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException

{

	AndroidDriver<AndroidElement> driver;

	File appDir = new File("src\\main\\java\\shakticoin");
	File app = new File(appDir, "app-release.apk");

	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
	capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

	driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	return driver;

}
public static void main(String[] args) throws MalformedURLException {
	capabilities();
}

}