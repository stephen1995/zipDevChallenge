package stepDefinitions;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.SelectionPage;

public class SelectionDefinition extends BaseClass {
    public SelectionPage selection = new SelectionPage();
    public WebElement elementToCheck;
    @Given("the user has visit primefaces page")
    public void the_user_has_visit_primefaces_page() {
        BaseClass.setup("https://www.primefaces.org/primereact-v5/#/datatable/selection");
    }
    @When("he checks the checkbox with name {string}")
    public void he_checks_the_checkbox_with_name(String string) {
        elementToCheck = selection.selectCheckBox(string);
        elementToCheck.click();

    }
    @Then("the checkbox is checked")
    public void the_checkbox_is_checked() {
        Assert.assertEquals(elementToCheck.getAttribute("aria-checked"),"true","Checkbox is not checked.");
    }
}
