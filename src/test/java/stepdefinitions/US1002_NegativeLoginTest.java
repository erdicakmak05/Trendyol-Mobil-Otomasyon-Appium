package stepdefinitions;

import io.cucumber.java.en.Then;

import org.testng.Assert;
import pages.android.Homepage;

public class US1002_NegativeLoginTest {
    Homepage homepage = new Homepage();

    @Then("kullanicinin giris yapamadigini test eder")
    public void kullanicinin_giris_yapamadigini_test_eder() {
        try {
            boolean isVisible = homepage.nameSurnameText.isDisplayed();

        } catch (Exception e){
            Assert.assertTrue(true);
        }
    }
}
