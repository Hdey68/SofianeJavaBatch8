package com.syntax.class28;

public class Main {
    public static void main(String[] args) {
        WebDriver webDriver=new ChromeDriver();
        webDriver.openBrowser();
        webDriver.closeBrowser();
        webDriver.maximizeWindow();
        webDriver.findElement();
        WebDriver webDriver1=new FirefoxDriver();
        webDriver1.openBrowser();
        webDriver1.closeBrowser();
        webDriver1.maximizeWindow();
        webDriver1.findElement();
    }
}
interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Code to open browser");
    }
    @Override
    public void closeBrowser() {
        System.out.println("Code to close browser");
    }
    @Override
    public void maximizeWindow() {
        System.out.println("Code to maximize window");
    }
    @Override
    public void findElement() {
        System.out.println("Code to find elements");
    }
}
class FirefoxDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Code to open  Firefox browser");
    }
    @Override
    public void closeBrowser() {
        System.out.println("Code to close Firefox browser");
    }
    @Override
    public void maximizeWindow() {
        System.out.println("Code to maximize window in Firefox");
    }
    @Override
    public void findElement() {
        System.out.println("Code to find Elements in Firefox");
    }
}
