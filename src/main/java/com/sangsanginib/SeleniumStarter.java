package com.sangsanginib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumStarter {
    public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
    public static final String WEB_DRIVER_PATH = "C:/chromedriver.exe";
    private String base_url1, base_url2, base_url3, base_url4, base_url5;
    private WebDriver driver1, driver2, driver3, driver4, driver5;

    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*SeleniumStarter seleniumStarter = new SeleniumStarter();
        seleniumStarter.crawl01();
        System.out.println("=========================================================================================");
        seleniumStarter.crawl02();
        System.out.println("=========================================================================================");
        seleniumStarter.crawl03();
        System.out.println("=========================================================================================");
        seleniumStarter.crawl04();
        System.out.println("=========================================================================================");
        seleniumStarter.crawl05();*/
        CrawlerPage01 crawlerPage01 = new CrawlerPage01();
        crawlerPage01.getBondsData();
    }

    public SeleniumStarter() {
        super();
        System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
        driver1 = new ChromeDriver();
        driver2 = new ChromeDriver();
        driver3 = new ChromeDriver();
        driver4 = new ChromeDriver();
        driver5 = new ChromeDriver();
        base_url1 = "https://www.samsungpop.com/?MENU_CODE=M1231752589437"; // 삼성증권
        base_url2 = "https://www.kbsec.com/go.able?linkcd=s010602010000"; // kb증권
        base_url3 = "https://securities.miraeasset.com/hks/hks4037/r03.do"; // 미래에셋증권
        base_url4 = "https://www.shinhansec.com/siw/wealth-management/bond-rp/590101/view.do"; // 신한투자증권
        base_url5 = "https://truefriend.com/main/mall/opendecision/DecisionInfo.jsp?cmd=TF02da010100"; // 한국투자증권
    }

    public void crawl01() {
        try {
            Thread.sleep(2000);
            driver1.get(base_url1);
            // driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"container\"]/div[3]")));
            driver1.manage().timeouts().getPageLoadTimeout();
            Thread.sleep(2000);
            // 삼성증권 데이터 프레임 전환
            driver1.switchTo().frame("frmContent");
            // time.sleep(50);
//          driver.findElement(By.ByCssSelector("//*[@id=\"tabArea\"]/ul/li[2]/a")).click();
//          System.out.println(driver.findElement(By.className("finductList")));
            System.out.println(driver1.getPageSource());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver1.close();
        }
    }

    public void crawl02() {
        try {
            Thread.sleep(2000);
            driver2.get(base_url2);
            driver2.manage().timeouts().getPageLoadTimeout();
            Thread.sleep(2000);
            System.out.println(driver2.getPageSource());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver2.close();
        }
    }

    public void crawl03() {
        try {
            Thread.sleep(2000);
            driver3.get(base_url3);
            driver3.manage().timeouts().getPageLoadTimeout();
            Thread.sleep(2000);
            System.out.println(driver3.getPageSource());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver3.close();
        }
    }

    public void crawl04() {
        try {
            Thread.sleep(2000);
            driver4.get(base_url4);
            driver4.manage().timeouts().getPageLoadTimeout();
            Thread.sleep(2000);
            System.out.println(driver4.getPageSource());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver4.close();
        }
    }

    public void crawl05() {
        try {
            Thread.sleep(2000);
            driver5.get(base_url5);
            driver5.manage().timeouts().getPageLoadTimeout();
            Thread.sleep(2000);
            System.out.println(driver5.getPageSource());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver5.close();
        }
    }
}
