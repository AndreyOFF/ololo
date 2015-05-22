package com.webdriver;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

import static org.testng.Assert.*;

public class GitHubLoginPage {

    private WebDriver driver;
    private static Logger logger = Logger.getLogger(GitHubLoginPage.class);

    @FindBy(id = "login_field")
    private WebElement login;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(name = "commit")
    private WebElement commit;

    public GitHubLoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
       logger.info("Initialize...");

    }

    public void DoLogin(String log, String pass) {
        login.sendKeys(log);
        password.sendKeys(pass);
        logger.info("Authorization...");
        commit.click();
    }

}
