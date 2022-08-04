package com.selenide.demo.tests;

import com.selenide.demo.webdriver.Browser;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.open;

public class BrowserTest {

    @BeforeEach
    public void setUp() {
        System.out.println("Starting Browser session...");
        open("https://www.saucedemo.com/");
    }

    @Test
    public void Test_testThisSite_MW() {
        System.out.println("Successfully opened the page...");
        open("https://www.saucedemo.com/");

    }

    @AfterEach
    public void teatDown() {
        System.out.println("Closing Browser session...");
        Browser.closeBrowser();
    }
}
