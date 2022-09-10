package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import javax.swing.*;

public class CatalogCase extends BasePage {
    String searchtxt="kadın";
    String ColorGetTxt="SİYAH";
    String EMailTxt="ftmxmee@gmail.com";
    String AdressTitleTxt="Ev";
    String NameTxt="Fatma";
    String SurNameTxt="DEMİR";
    String PhoneNumberTxt="1111111111";
    String AdressTxt="Bu Bir Test Metinidir Lütfen Dikaate Almayınız. test:30 sk. no:25";
    String PostCodeTxt="06000";
    By CoociesAccept= new By.ById("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    By ToolTipMessage=new By.ByXPath("//a[@class='close js-tooltip-close']");
    By Search=new By.ByXPath("//form[@class='js-search-form']//input[@name='search_text']");
    By SearchIcon=new By.ByXPath("//button[@type='submit']//em[@class='input-icon icon-search']");
    By Clothing=new By.ByXPath("//a[contains(text(),'GİYİM & AKSESUAR')]");
    By ClothingControle= new By.ByXPath("//span[contains(text(),'kadın')]");
    By WomenUnderwear=new By.ByXPath("//a[@class='js-filter-link '][contains(text(),'Kadın İç Giyim')]");
    By WomenUnderWearControle=new By.ByXPath("//li[@class='breadcrumb-item']//a[@title='Kadın İç Giyim']");
    By WomenSock=new By.ByXPath("//a[@class='js-filter-link '][contains(text(),'Dizaltı Çorap')]");
    By WomenSockControle=new By.ByXPath("//li[@class='breadcrumb-item']//a[@title='Dizaltı Çorap']");
    By ScrollColor=new By.ByXPath("//div[normalize-space()='Cinsiyet']");
    By ScrollBasket=new By.ByXPath("(//td[contains(text(),'Ürünlerin Toplamı')])[3]");
    By SelectBlackColor=new By.ByXPath("//label[@for='attributes_integration_colourSİYAH']");
    By SelectSock=new By.ByXPath("(//div[@class='product-desc '])[2]");
    By BasketProductControle=new By.ByXPath("//a[@class='title'][contains(text(),'Doremi Kadın Desenli Dizaltı Çorap Fit15 Denye Siy')]");
    By AddToBasketIcon=new By.ByXPath("//button[@class='add-to-basket button green block with-icon js-add-basket']");
    By GoToBasket=new By.ByXPath("//a[@class='go-to-shop']");
    By ConfirmCartButton=new By.ByXPath("//a[@class='button green checkout-button block js-checkout-button']");

    By PopupClose=new By.ByXPath("//div[@class='closePopupPersona']");
    By ScrollMember=new By.ByXPath("//div[@class='title login-title']");
    By ContinueWithoutMember =new By.ByXPath("//a[normalize-space()='ÜYE OLMADAN DEVAM ET']");
    By EMail=new By.ByXPath("//input[@name='user_email']");
    By GoOnButton=new By.ByXPath("//button[normalize-space()='DEVAM ET']");
    By NewAdress=new By.ByXPath("//body/section[@class='js-main-wrapper']/section[@class='page-checkout js-page-checkout js-tab-box']/div[@class='container']/div[@class='checkout-addresses js-tab-content active']/div[@class='row']/div[@class='col-sm-9']/div[@class='checkout-delivery']/div[@class='addresses']/div[@class='list']/ul/li[@class='half']/a[1]");
    By AdressTitleLabel=new By.ByXPath("//input[@placeholder='Ev adresim, iş adresim vb.']");
    By NameLabel=new By.ByXPath("//input[@name='first_name']");
    By SurnameLabel=new By.ByXPath("//input[@name='last_name']");
    By PhoneNumberLabel=new By.ByXPath("//input[@name='phone_number']");
    By CityLabel=new By.ByXPath("//select[@name='city']");
    By SelectCity=new By.ByXPath("//option[normalize-space()='ANKARA']");
    By TownshipLabel=new By.ByXPath("//select[@name='township']");
    By SelectTownship=new By.ByXPath("//select[@name='township']//option[@value='66']");
    By DistrictLabel=new By.ByXPath("//select[@name='district']");
    By SelectDistrict=new By.ByXPath("//select[@name='district']//option[@value='5147']");
    By AdressLabel=new By.ByXPath("//textarea[@name='line']");
    By PostCodeLabel=new By.ByXPath("//input[@name='postcode']");
    By SaveButton=new By.ByXPath("//button[normalize-space()='KAYDET']");
    By SelectCargo=new By.ByXPath("//span[normalize-space()='Sendeo']");
    By SaveAndGoONButton=new By.ByXPath("//button[@class='button block green js-proceed-button']");
    By PaymentPageControle=new By.ByXPath("//div[normalize-space()='Masterpass ile Ödeme']");

    public CatalogCase(WebDriver driver) {
        super(driver);
    }

    public void WomenClothingFunction() {
        waitForSecond(2);
        click(CoociesAccept);
        waitForSecond(1);

        click(Search);
        send(Search, searchtxt);
        waitForSecond(2);

        if (isDisplay(ToolTipMessage) == true) {
            click(ToolTipMessage);
        }
        click(SearchIcon);

        click(Clothing);
        waitForSecond(1);
        Boolean ClothingControll = isDisplay(ClothingControle);
        Assert.assertTrue(ClothingControll);
        if (ClothingControll == true) {
            System.out.println("Kadın Giyim Sayfası Açıldı");
        }

        click(WomenUnderwear);
        waitForSecond(1);
        Boolean WomenUnderWearControll = isDisplay(WomenUnderWearControle);
        Assert.assertTrue(WomenUnderWearControll);
        if (WomenUnderWearControll == true) {
            System.out.println("Kadın İç Giyim Sayfası Açıldı");
        }

        waitForSecond(1);
        click(WomenSock);
        waitForSecond(1);
        Boolean WomenSockControll = isDisplay(WomenSockControle);
        Assert.assertTrue(WomenSockControll);
        if (WomenSockControll == true) {
            System.out.println("Kadın Dizaltı Çorap Sayfası Açıldı");
        }

        waitForSecond(1);
        System.out.println("Giyim--> Aksesuar--> Kadın İç Giyim-->Dizaltı Çorap");
    }

    public void ColorFunction() {
        scrollPageElement(drivers().findElement(ScrollColor));
        waitForSecond(1);

        click(SelectBlackColor);
        waitForSecond(1);
        String ColorTxtControl = find(SelectBlackColor)
                .getText();
        System.out.println(ColorTxtControl);
        Assert.assertEquals(ColorTxtControl, ColorGetTxt);
        System.out.println("Renk Siyah Seçildi");
        waitForSecond(1);
    }

    public void BasketControlFunction() {
        click(SelectSock);
        waitForSecond(1);

        click(AddToBasketIcon);
        waitForSecond(1);

        click(GoToBasket);
        waitForSecond(1);

        scrollPageElement(drivers().findElement(ScrollBasket));
        waitForSecond(1);

        Boolean ProductTxtControl = isDisplay(BasketProductControle);
        Assert.assertTrue(ProductTxtControl);
        if (ProductTxtControl == true) {
            System.out.println("Ürün Doğru Seçildi");
        }
        waitForSecond(1);

        click(ConfirmCartButton);
        waitForSecond(1);

        scrollPageElement(drivers().findElement(ScrollMember));
        waitForSecond(1);
        click(ContinueWithoutMember);
        waitForSecond(1);
        click(EMail);
        waitForSecond(1);
        send(EMail,EMailTxt);
        waitForSecond(1);
        click(GoOnButton);
        waitForSecond(1);
    }
    public void CompleteOrderFunction(){
        click(NewAdress);
        waitForSecond(1);
        click(AdressTitleLabel);
        send(AdressTitleLabel,AdressTitleTxt);
        waitForSecond(1);

        click(NameLabel);
        send(NameLabel,NameTxt);
        waitForSecond(1);

        click(SurnameLabel);
        send(SurnameLabel,SurNameTxt);
        waitForSecond(1);

        click(PhoneNumberLabel);
        send(PhoneNumberLabel,PhoneNumberTxt);
        waitForSecond(1);

        click(CityLabel);
        waitForSecond(1);
        click(SelectCity);
        waitForSecond(2);

        click(TownshipLabel);
        waitForSecond(1);
        click(SelectTownship);
        waitForSecond(2);

        scrollPageElement(drivers().findElement(NameLabel));
        waitForSecond(2);

        click(DistrictLabel);
        waitForSecond(1);
        click(SelectDistrict);
        waitForSecond(1);

        click(AdressLabel);
        send(AdressLabel,AdressTxt);
        waitForSecond(3);

        click(PostCodeLabel);
        send(PostCodeLabel,PostCodeTxt);
        waitForSecond(3);

        click(SaveButton);
        waitForSecond(3);

        click(SelectCargo);
        waitForSecond(2);

        click(SaveAndGoONButton);
        waitForSecond(2);

        Boolean PaymentPageControll = isDisplay(PaymentPageControle);
        Assert.assertTrue(PaymentPageControll);
        if (PaymentPageControll == true) {
            System.out.println("Ödeme Sayfası Açıldı");
        }

    }
}
