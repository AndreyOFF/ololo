package com.webdriver;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class GitHubTest {

    private static Logger logger = Logger.getLogger(GitHubTest.class);

    private String login;
    private String password;
    private String repository;
    private String URL;
    private WebDriver driver;

    @BeforeTest
    public void Init() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        this.login = "AndreyOFF";
        this.password = "34568936189212z";
        this.repository = "RepoX";
        this.URL = "https://github.com/login";
        this.driver = new ChromeDriver();
        logger.info("Starting...");

    }

    @Test
    public void SignUp() {
        this.driver.get(this.URL);
        GitHubLoginPage page = new GitHubLoginPage(this.driver);
        page.DoLogin(this.login, this.password);
        assertEquals(this.driver.getCurrentUrl(), "https://github.com/");
    }

   /* @Test
    public void CreateRepository() {
        this.URL = "https://github.com/new";
        this.driver.get(this.URL);
        GitHubCreateNewRepo page = new GitHubCreateNewRepo(this.driver);
        page.DoCreate(this.repository);
        assertEquals(this.driver.getCurrentUrl(), "https://github.com/" + this.login + "/" + this.repository);
    } */

}
