package org.duchess.selenium.part4.ex2;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class PortofolioPage {
    @FindBy(id ="containment-portfolio")
    WebElement container;

    @FindBys({@FindBy(id="containment-portfolio")})
    List<WebElement> containers;

    @FindBy(how = How.LINK_TEXT, using="WEB")
    WebElement webLink;

    @FindBys({@FindBy(css="#containment-portfolio li:not(.hidden)")})
    List<WebElement> images;




    public WebElement getContainer() {
        //driver.findElements(By.cssSelector("#containment-portfolio")
        return container;
    }
    public List<WebElement> getContainers() {
        //driver.findElements(By.cssSelector("#containment-portfolio")
        return containers;
    }

    public void clickWebLink() {
        webLink.click();
    }

    public PortofolioPage waitForElements (WebDriver driver){
        (new WebDriverWait(driver, 10))
                .until(new ExpectedCondition<Boolean>() {
                    @Override
                    public Boolean apply(WebDriver driver) {
                        return images.size() == 4;
                    }
                });
        return this;
    }

    public List<WebElement> getImages(){
        return images;
    }

}
