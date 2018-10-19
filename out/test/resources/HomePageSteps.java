import cucumber.api.PendingException;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class HomePageSteps {

private AppiumDriver appiumDriver;

    @When("^I launch Quikr app$")
    public void iLaunchQuikrApp() throws Throwable {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("appium-version", "1.0");
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "5.1");
        caps.setCapability("deviceName", "Android_S8");
//        capabilities.setCapability("app",
//                "/Users/nishant/Development/HelloAppium/app/quikr.apk");
        caps.setCapability("udid", "988776364442433137");
        caps.setCapability("appPackage", "us.owl.owlapp");
        caps.setCapability("appActivity", "com.owlcam.MainActivity");
        System.out.println(caps.toString());

        appiumDriver = new AppiumDriver(new
                URL("http://0.0.0.0:4723/wd/hub"), caps);
        appiumDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

    }

    @When("^I choose to log in using Google$")
    public void i_choose_to_log_in_using_Google() throws Throwable {
        appiumDriver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
    }


    @Then("^I see account picker screen with my email address \"([^\"]*)\"$")
    public void i_see_account_picker_screen_with_my_email_address(String expected) throws Throwable {
        Thread.sleep(5000);
//        Assert.assertEquals("Email Id matches", expected, appiumDriver.findElement(By.id("com.google.android.gms:id/account_name")).getText());

    }
}

