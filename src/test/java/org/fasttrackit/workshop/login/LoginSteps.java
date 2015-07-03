package org.fasttrackit.workshop.login;

import com.sun.javafx.geom.AreaOp;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.messaging.saaj.util.SAAJUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.fasttrackit.util.TestBaseNative;
import org.fasttrackit.workshop.pagefactory.login.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginSteps extends TestBaseNative {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoginSteps.class);

    LoginPage loginPage;

    @Given("^I open login page$")
    public void I_open_login_page() {
        driver.get("file:///D:/Testy/src/test/functional/login.html");

        //loginPage = PageFactory.initElements(driver, LoginPage.class);
    }

    @When("^I enter email \"([^\"]*)\"$")
    public void I_enter_email(String email) {
        WebElement element = driver.findElement(By.id("email"));
        element.sendKeys(email);
    }

    @Given("^i access the login page$")
    public void i_access_the_login_page()  {
        
    }

    @And("^i insert valid credential$")
    public void i_insert_valid_credential()  {
    }

    @When("^i click login button$")
    public void i_click_login_button()  {
    }

    @Then("^i check if user is logged in$")
    public void i_check_if_user_is_logged_in()  {
        // Express the Regexp above with the code you wish you had
        
    }

    @And("^i insert invalid credential$")
    public void i_insert_invalid_credential()  {
        // Express the Regexp above with the code you wish you had
        
    }

    @Then("^i expect invalid credential message$")
    public void i_expect_invalid_credential_message()  {
        // Express the Regexp above with the code you wish you had
        
    }




    @Given("^i open this url \"([^\"]*)\"$")
    public void i_open_this_url(String url) throws Throwable {
     driver.get(url);
    }

    @Then("^i send (\\d+) into search field$")
    public void i_send_into_search_field(int arg1) throws Throwable {
        System.out.println("numarul este " + arg1);
    }
}
