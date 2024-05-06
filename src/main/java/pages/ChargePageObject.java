package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChargePageObject {

    private WebDriver driver;
    private WebDriverWait wait;

    public ChargePageObject(WebDriver _driver) {
        this.driver = _driver;
        this.wait = new WebDriverWait(driver, 60);
    }

    public void Cliquer_Charge(){
        WebElement charge = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-layout/div/div[1]/app-sidebar-cmp/div[2]/ul/li[4]/a/p")));
        charge.click();
    }

    public void Create(){
        WebElement create = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"mat-tab-content-0-0\"]/div/app-charging-station-templates-list/app-table/div/div[1]/div[1]/div[1]/button")));
        create.click();
    }

    public void SaisirTemplate(String Template){
        WebElement TemplateJSON = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#mat-input-1")));
        TemplateJSON.clear();
        TemplateJSON.sendKeys(Template);

    }

    public void enregistrer() {
        WebElement Field = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#mat-input-1")));
        Field.click();
        Field.sendKeys(Keys.ENTER);
    }}
