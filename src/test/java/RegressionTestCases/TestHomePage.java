package RegressionTestCases;

import Regression.HomePage;
import base.MobileAPI2;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends MobileAPI2 {

    HomePage homePage;

    @BeforeMethod
    public void init() {
        homePage = PageFactory.initElements(appiumDriver, HomePage.class);
    }

    //@Test
    public void WalmartLogoValidation(){
        homePage.WalmartLogoVerification();
    }

    //@Test
    public void SearchBoxValidationTest(){
        homePage.SearchBoxVerification();
    }

    //@Test
    public void SearchButtonVerification() throws InterruptedException {
        homePage.SearchButton();
    }

   //@Test
    public void SearchItemValidation()  {
        homePage.SearchItemVerification();
    }

   // @Test
    public void SelectItemValidation(){
        homePage.SelectItemVarification();
    }

    //@Test
    public void AddProductToCart(){
        homePage.AddItemToCart();
    }

   // @Test
    public void QuantityBoxVerification(){
        homePage.QuantityField();
    }

   // @Test
    public void OpenNavigationDrawer(){
        homePage.OpenNavigationButton();
    }

   // @Test
    public void SignInButtonVerification(){
        homePage.SignInButton();
    }

   // @Test
    public void CreateNewAccount(){
        homePage.ClickOnCreateAnAccount();
    }

    //@Test
    public void UserAccount(){
        homePage.OpenNewAccount();
    }

  //  @Test
    public void MuseMovementValidation(){
        homePage.MouseOverVerification();
    }

   @Test
    public void getScreenshot(){
        homePage.TakeScreenShot();
    }



}
