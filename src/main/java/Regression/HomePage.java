package Regression;

import base.MobileAPI2;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;

public class HomePage  extends MobileAPI2 {


@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.ImageView\n")
    WebElement WalmartLogo;
@FindBy(id = "com.walmart.android:id/search_src_text")
    WebElement SearchBox;
@FindBy(id ="com.walmart.android:id/notification_item_time")
    WebElement SearchButton;
@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout\n")
    WebElement SearchItem;
@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.RelativeLayout[3]/android.widget.TextView")
    WebElement SelectItem;
@FindBy(id = "Open navigation drawer")
    WebElement OpenNavigation;
@FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout\n")
    WebElement SignIn;
@FindBy(id = "com.walmart.android:id/create_account")
    WebElement CreateAccount;
@FindBy(id = "com.walmart.android:id/firstname")
    WebElement FirstName;
@FindBy(id = "com.walmart.android:id/lastname")
    WebElement LastName;
@FindBy(id= "\tcom.walmart.android:id/email")
    WebElement EmailAddress;
@FindBy(id="com.walmart.android:id/password")
    WebElement Password;
@FindBy(id="com.walmart.android:id/create_button")
    WebElement CreateUserAccount;

@FindBy(id = "com.walmart.android:id/add_to_cart_button_button")
    WebElement AddToCart;

@FindBy(id = "android:id/text1")
    WebElement Quantity;

public void WalmartLogoVerification(){
    if(WalmartLogo.isDisplayed()){
        Assert.assertTrue(true);
    }
}

public void SearchBoxVerification(){
    SearchBox.sendKeys("tv");
}

public void SearchButton() throws InterruptedException {
    SearchBox.sendKeys("tv");
    Thread.sleep(5000);
    SearchButton.click();
}

public void SearchItemVerification()  {
    SearchBox.sendKeys("tv");
    try {
        Thread.sleep(5000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    SearchItem.click();
}

public void SelectItemVarification(){
    SearchBox.sendKeys("tv");
    SearchItem.click();
    SelectItem.click();
}
public void AddItemToCart(){
    SearchBox.sendKeys("tv");
    SearchItem.click();
    SelectItem.click();
    AddToCart.click();
}

public void OpenNavigationButton(){
    OpenNavigation.click();
}

public void SignInButton(){
    OpenNavigation.click();
    SignIn.click();
}

public void ClickOnCreateAnAccount(){
    OpenNavigation.click();
    SignIn.click();
    CreateAccount.click();
}
public void OpenNewAccount(){
    OpenNavigation.click();
    SignIn.click();
    CreateAccount.click();
    FirstName.sendKeys("Tom");
    LastName.sendKeys("Peter");
    EmailAddress.sendKeys("tompeter@gmail.com");
    Password.sendKeys("tompeter1234");
    CreateUserAccount.click();
}

public void MouseOverVerification(){
    Actions action = new Actions(appiumDriver);
    action.moveToElement(appiumDriver.findElement(By.linkText("Electronics"))).build().perform();
    appiumDriver.findElement(By.linkText("Electronics")).click();
}
public void TakeScreenShot(){
    File file = ((TakesScreenshot) appiumDriver).getScreenshotAs(OutputType.FILE);
    try {
        FileUtils.copyFile(file, new File("src\\test\\resources\\ScreenShots\\walmart.png"));
    } catch (IOException e) {
        e.printStackTrace();
    }
}

public void ClearQuantityField(){
    SearchBox.sendKeys("tv");
    SearchItem.click();
    SelectItem.click();
    AddToCart.click();
}

public void QuantityField(){
    SearchBox.sendKeys("tv");
    SearchItem.click();
    SelectItem.click();
    AddToCart.click();
    Quantity.clear();
    Quantity.sendKeys("2");
}
}
