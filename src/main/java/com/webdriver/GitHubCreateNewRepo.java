package com.webdriver;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GitHubCreateNewRepo {
    private WebDriver driver;
    private static Logger logger = Logger.getLogger(GitHubCreateNewRepo.class);

    @FindBy(id = "repository_name")
    private WebElement name;

    @FindBy(id = "repository_description")
    private WebElement description;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    private WebElement create;

    public GitHubCreateNewRepo(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void DoCreate(String name, String description) {
        this.name.sendKeys(name);
        this.description.sendKeys(description);
        this.create.click();
        logger.info("Creating repository \"" + name + "\"");
    }

    public void DoCreate(String name) {
        this.name.sendKeys(name);
        this.create.click();
        logger.info("Creating repository \"" + name + "\"");
    }

}
