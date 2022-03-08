package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.android.Homepage;
import utilities.ConfigReader;
import utilities.Driver;

public class US1001_PositiveLoginTest {

    Homepage homepage = new Homepage();


    @Given("kullanici trendyol uygulamasını acar")
    public void kullanici_trendyol_uygulamasini_acar() {
        Driver.getAppiumDriver();
        homepage.cinsiyetSecimi.click();
    }
    @Given("kullanici hesabım tab ina tiklar")
    public void kullanici_hesabim_tab_ina_tiklar() {
        homepage.hesabimTab.click();
        homepage.cancelEmailSelectButton.click();
    }

    @Then("kullanici mail olarak {string} girer")
    public void kullaniciMailOlarakGirer(String mail) {
        homepage.emailTextbox.sendKeys(ConfigReader.getProperty(mail));
    }

    @And("kullanici password olarak {string} girer")
    public void kullaniciPasswordOlarakGirer(String password) {
        homepage.passwordTextbox.sendKeys(ConfigReader.getProperty(password));
    }


    @And("kullanici giris yap butonuna tiklar")
    public void kullaniciGirisYapButonunaTiklar() {
        homepage.girisYapButton.click();
        Driver.getAppiumDriver().navigate().back();
        //homepage.touchScreen.click();
    }

    @And("kullanicinin basarili olarak giris yaptıgı test edilir")
    public void kullanicininBasariliOlarakGirisYaptigiTestEdilir() {
        String actualNameSurname = homepage.nameSurnameText.getText();
        String expectedNameSurname = ConfigReader.getProperty("UserNameSurname");
        Assert.assertEquals(expectedNameSurname,actualNameSurname);
    }

    @And("kullanici uygulamayi kapatir")
    public void kullaniciUygulamayiKapatir() {
        Driver.quitAppiumDriver();
    }
}
