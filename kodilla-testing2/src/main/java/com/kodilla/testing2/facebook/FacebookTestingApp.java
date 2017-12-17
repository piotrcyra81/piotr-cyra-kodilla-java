package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_SELECT_DAY = "//div[@class=\"_5k_5\"]/span/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "//div[@class=\"_5k_5\"]/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//div[@class=\"_5k_5\"]/span/span/select[3]";
    public static final String XPATH_WAIT_FOR = "//select[1]";


    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR)).isDisplayed());

        WebElement selectDayCombo = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select fbDay = new Select(selectDayCombo);
        fbDay.selectByIndex(6);

        WebElement selectMonthCombo = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select fbMonth = new Select(selectMonthCombo);
        fbMonth.selectByIndex(7);

        WebElement selectYearCombo = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select fbYear = new Select(selectYearCombo);
        fbYear.selectByIndex(37);
    }
}