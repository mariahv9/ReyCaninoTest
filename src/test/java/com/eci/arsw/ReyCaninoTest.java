package com.eci.arsw;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReyCaninoTest {
    private WebDriver webDriver;

    @Before
    public void setUp () {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        webDriver =  new ChromeDriver();
    }

    //shouldOpenServices
    @Test
    public void shouldOpenServices() {
        webDriver.get("http://ec2-18-234-149-24.compute-1.amazonaws.com:8080/");
        webDriver.manage().window().maximize();
        WebElement element = webDriver.findElement(By.xpath("//*[@id=\"menu-wrapper\"]/div/div[2]/ul/li[2]"));
        element.click();
    }

    //shouldOpenPetShop
    @Test
    public void shouldOpenPetShop() {
        webDriver.get("http://ec2-18-234-149-24.compute-1.amazonaws.com:8080/");
        webDriver.manage().window().maximize();
        WebElement element = webDriver.findElement(By.xpath("//*[@id=\"menu-wrapper\"]/div/div[2]/ul/li[3]"));
        element.click();
    }

    //shouldOpenConsult
    @Test
    public void shouldOpenConsult() {
        webDriver.get("http://ec2-18-234-149-24.compute-1.amazonaws.com:8080/");
        webDriver.manage().window().maximize();
        WebElement element = webDriver.findElement(By.xpath("//*[@id=\"menu-wrapper\"]/div/div[2]/ul/li[4]"));
        element.click();
    }

    //shouldOpenCancel
    @Test
    public void shouldOpenCancel() {
        webDriver.get("http://ec2-18-234-149-24.compute-1.amazonaws.com:8080/");
        webDriver.manage().window().maximize();
        WebElement element = webDriver.findElement(By.xpath("//*[@id=\"menu-wrapper\"]/div/div[2]/ul/li[5]"));
        element.click();
//        String urlGet = "https://www.youtube.com/feed/trending";
//        assertEquals(urlGet, webDriver.getCurrentUrl());
    }

    //shouldOpenPeluqueria
    @Test
    public void shouldOpenPeluqueria() {
        webDriver.get("http://ec2-18-234-149-24.compute-1.amazonaws.com:8080/");
        webDriver.manage().window().maximize();
        WebElement element = webDriver.findElement(By.xpath("//*[@id=\"services\"]/div/div[2]/div[2]"));
        element.click();
    }

    //shouldOpenPaseo
    @Test
    public void shouldOpenPaseo() {
        webDriver.get("http://ec2-18-234-149-24.compute-1.amazonaws.com:8080/");
        webDriver.manage().window().maximize();
        WebElement element = webDriver.findElement(By.xpath("//*[@id=\"services\"]/div/div[2]/div[3]"));
        element.click();
    }

    //shouldOpenPetShopPremium
    @Test
    public void shouldOpenPetShopPremium() {
        webDriver.get("http://ec2-18-234-149-24.compute-1.amazonaws.com:8080/");
        webDriver.manage().window().maximize();
        WebElement element = webDriver.findElement(By.xpath("//*[@id=\"portfolio\"]/div/div[2]/div[1]"));
        element.click();
    }

    //shouldOpenMimoMiMascota
    @Test
    public void shouldOpenMimoMiMascota() {
        webDriver.get("http://ec2-18-234-149-24.compute-1.amazonaws.com:8080/");
        webDriver.manage().window().maximize();
        WebElement element = webDriver.findElement(By.xpath("//*[@id=\"portfolio\"]/div/div[2]/div[2]"));
        element.click();
    }

    //shouldOpenCanis
    @Test
    public void shouldOpenCanis() {
        webDriver.get("http://ec2-18-234-149-24.compute-1.amazonaws.com:8080/");
        webDriver.manage().window().maximize();
        WebElement element = webDriver.findElement(By.xpath("//*[@id=\"portfolio\"]/div/div[2]/div[3]"));
        element.click();
    }

    //shouldOpenLesPoilus
    @Test
    public void shouldOpenLesPoilus() {
        webDriver.get("http://ec2-18-234-149-24.compute-1.amazonaws.com:8080/");
        webDriver.manage().window().maximize();
        WebElement element = webDriver.findElement(By.xpath("//*[@id=\"portfolio\"]/div/div[2]/div[4]"));
        element.click();
    }

    //shouldOpenPetsWithoutParents
    @Test
    public void shouldOpenPetsWithoutParents() {
        webDriver.get("http://ec2-18-234-149-24.compute-1.amazonaws.com:8080/");
        webDriver.manage().window().maximize();
        WebElement element = webDriver.findElement(By.xpath("//*[@id=\"portfolio\"]/div/div[2]/div[5]"));
        element.click();
    }

    //shouldOpenCityStyle
    @Test
    public void shouldOpenCityStyle() {
        webDriver.get("http://ec2-18-234-149-24.compute-1.amazonaws.com:8080/");
        webDriver.manage().window().maximize();
        WebElement element = webDriver.findElement(By.xpath("//*[@id=\"portfolio\"]/div/div[2]/div[6]"));
        element.click();
    }

    //shouldOpenMundoMascota
    @Test
    public void shouldOpenMundoMascota() {
        webDriver.get("http://ec2-18-234-149-24.compute-1.amazonaws.com:8080/");
        webDriver.manage().window().maximize();
        WebElement element = webDriver.findElement(By.xpath("//*[@id=\"portfolio\"]/div/div[2]/div[7]"));
        element.click();
    }

    //shouldOpenCuatroPatas
    @Test
    public void shouldOpenCuatroPatas() {
        webDriver.get("http://ec2-18-234-149-24.compute-1.amazonaws.com:8080/");
        webDriver.manage().window().maximize();
        WebElement element = webDriver.findElement(By.xpath("//*[@id=\"portfolio\"]/div/div[2]/div[8]"));
        element.click();
    }

    //shouldMakeReserve
    @Test
    public void shouldMakeReserve() {
        webDriver.get("http://ec2-18-234-149-24.compute-1.amazonaws.com:8080/");
        webDriver.manage().window().maximize();
        shouldOpenServices();
        shouldOpenPeluqueria();
        WebElement date = webDriver.findElement(By.xpath("//*[@id=\"fechaShop\"]"));
        date.sendKeys("25/12/2020");
        WebElement submit = webDriver.findElement(By.xpath("//*[@id=\"findShop\"]"));
        submit.click();
        WebElement name = webDriver.findElement(By.xpath("//*[@id=\"name\"]"));
        name.sendKeys("Maria");
        WebElement email = webDriver.findElement(By.xpath("//*[@id=\"email\"]"));
        email.sendKeys("ma@gmail.com");
        WebElement pet = webDriver.findElement(By.xpath("//*[@id=\"petName\"]"));
        pet.sendKeys("Tommy");
        WebElement petRace = webDriver.findElement(By.xpath("//*[@id=\"breed\"]"));
        petRace.sendKeys("Shih Tzu");
        WebElement tel = webDriver.findElement(By.xpath("//*[@id=\"tel\"]"));
        tel.sendKeys("12345698");
        WebElement comment = webDriver.findElement(By.xpath("//*[@id=\"comment\"]"));
        comment.sendKeys("Dermatologico");
        WebElement reserve = webDriver.findElement(By.xpath("//*[@id=\"filas\"]/tr[1]/td[2]/input"));
        reserve.click();
    }

    //shouldConsult-cancel
    @Test
    public void shouldConsult() {
        webDriver.get("http://ec2-18-234-149-24.compute-1.amazonaws.com:8080/");
        webDriver.manage().window().maximize();
        WebElement cod = webDriver.findElement(By.xpath("//*[@id=\"codigo\"]"));
        cod.sendKeys("35ff26b1-0257-45cf-9a46-e2831c96d975");
        WebElement submit = webDriver.findElement(By.xpath("//*[@id=\"buscar\"]"));
        submit.click();
    }

    @After
    public void close() {
        webDriver.close();
    }
}
