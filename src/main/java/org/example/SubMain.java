package org.example;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.ArrayList;

public class SubMain {
    public static void main(String[] args){
        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://www.wikipedia.org/");

        //Obtener input y boton
        WebElement textInput = driver1.findElement(By.id("searchInput"));
        WebElement submitBtn = driver1.findElement(By.cssSelector("button"));

        //Interactuar con elementos
        textInput.sendKeys("Microsoft");
        submitBtn.click();

        //driver1.getTitle();

        //Obtener el título del resultado de busqueda
        WebElement title = driver1.findElement(By.tagName("h1"));

        if (title.getText().equalsIgnoreCase("microsoft")){
            System.out.println("Microsoft title found");
        } else {
            System.out.println("Title not found");
        }

        //Encontrar todos los "a" html tags
        List<WebElement> aElements = driver1.findElements(By.tagName("a"));

        for (WebElement atag: aElements
             ) {
            System.out.println(atag.getText());
        }

        driver1.quit();



    }
}

