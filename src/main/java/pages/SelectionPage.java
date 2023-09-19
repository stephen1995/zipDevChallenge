package pages;

import base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SelectionPage extends BaseClass {

    public WebElement selectCheckBox(String text){
        return driver.findElement(By.xpath("//h5[contains(text(),'Checkbox')]/following-sibling::div//td[contains(text(),'"+text+"')]/preceding-sibling::td//div[@role='checkbox']"));
    }

    public SelectionPage(){
        PageFactory.initElements(driver,this);
    }



}
