package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="identifier") private WebElement emailTextField;
	@FindBy(name="password") private WebElement passwordTextField;
	@FindBy(xpath="//span[text()='Next']") private WebElement nextFirstButton;
	@FindBy(xpath="//span[text()='Next']") private WebElement nextSecondButton;
	public WebElement getEmailTextField() {
		return emailTextField;
	}
	public WebElement getPasswordTextField() {
		return passwordTextField;
	}
	public WebElement getNextFirstButton() {
		return nextFirstButton;
	}
	public WebElement getNextSecondButton() {
		return nextSecondButton;
	}


}
