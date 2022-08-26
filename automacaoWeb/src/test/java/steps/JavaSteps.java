package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;

import java.util.concurrent.TimeUnit;


public class JavaSteps {

    WebDriver driver ;



    @Given("^I'm on the website$")
    public void i_m_on_the_website() throws Exception {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com.br/ebooks-kindle/b/?ie=UTF8&node=5475882011&ref_=nav_cs_kindle_books");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //driver.findElement(By.xpath("//div[@id='nav-xshop']//a[contains(text(),\"eBooks Kindle\")]")).click();
    }

    @When("^I click on digital ebooks$")
    public void i_click_on_digital_ebooks() throws Exception {
        driver.findElement(By.xpath("//li//a//div[@class='sl-sobe-carousel-sub-card-image']//img[@alt='eBooks Gratuitos']")).click();
        //driver.findElement(By.xpath("//*[@alt='X-Site']")).click();

    }

    @Then("^the digital ebook is shown$")
    public void the_digital_ebook_is_shown() throws Exception {
        String areaEbook = driver.findElement(By.xpath("//h1[normalize-space()='eBooks Gratuitos']")).getText();
        Assert.assertEquals("eBooks Gratuitos", areaEbook);
        //System.out.println(areaEbook);
        driver.quit();
    }

    @When("^I click on the books area$")
    public void i_click_on_the_books_area() throws Exception {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^the ebook area is shown$")
    public void the_ebook_area_is_shown() throws Exception {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^I click on the non-books area$")
    public void i_click_on_the_non_books_area() throws Exception {
        driver.findElement(By.xpath("//div[@id=\"nav-xshop\"]//a[contains(text(),'Música')]")).click();

    }

    @Then("^the ebook area is no shown$")
    public void the_ebook_area_is_no_shown() throws Exception {
        String noEbookArea = driver.findElement(By.xpath("//span[normalize-space()='3 MESES GRÁTIS']")).getText();
        System.out.println(noEbookArea);
        Assert.assertNotEquals("eBooks Gratuitos", noEbookArea);
        driver.quit();

    }


}
