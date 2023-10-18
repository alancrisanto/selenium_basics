package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        driver.getTitle();
        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
        WebElement textBox = driver.findElement(By.name("my-text"));
        WebElement submitBtn = driver.findElement(By.cssSelector("button"));

        //Sending actions
        textBox.sendKeys("selenium");
        submitBtn.click();

        WebElement message = driver.findElement(By.id("message"));
        message.getText();
        System.out.println(message.getText());
        driver.quit();
    }


}