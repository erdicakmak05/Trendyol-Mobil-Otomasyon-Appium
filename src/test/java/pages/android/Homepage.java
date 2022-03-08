package pages.android;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.time.Duration;

public class Homepage {

    public Homepage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(10)) ,this);
    }

    @FindBy(id = "trendyol.com:id/buttonSelectGenderMan")
    public MobileElement cinsiyetSecimi;

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc='Hesabım']")
    public MobileElement hesabimTab;

    @FindBy(id = "trendyol.com:id/editTextEmail")
    public MobileElement emailTextbox;

    @FindBy(id = "trendyol.com:id/editTextPassword")
    public MobileElement passwordTextbox;


    @FindBy(id = "trendyol.com:id/buttonLogin")
    public MobileElement girisYapButton;


    @FindBy(id = "com.google.android.gms:id/cancel")
    public MobileElement cancelEmailSelectButton;

    @FindBy(className = "android.view.ViewGroup")
    public MobileElement touchScreen;

    @FindBy(id = "trendyol.com:id/textViewWelcoming")
    public MobileElement nameSurnameText;


    @FindBy(id = "trendyol.com:id/snackbar_text")
    public MobileElement hataliLogin;
}
