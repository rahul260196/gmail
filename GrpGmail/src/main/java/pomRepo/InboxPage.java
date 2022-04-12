package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InboxPage {
public WebDriver driver;
	
	 public InboxPage(WebDriver driver)  {
		PageFactory.initElements(driver, this);
	}
	 
	 @FindBy(xpath="//a[@role='button']") private WebElement accountButton;
	 @FindBy(xpath="//div[text()='Sign out']") private WebElement signoutButton;

	public WebElement getAccountButton() {
		return accountButton;
	}
	public WebElement getSignoutButton() {
		return signoutButton;
	}
	
	public void logout() {
		accountButton.click();
		signoutButton.click();
	}
	 

}
