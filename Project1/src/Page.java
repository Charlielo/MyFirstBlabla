import org.openqa.selenium.WebElement;

public abstract class Page {
	
	protected static String Email;
	protected static String Password;
	protected static WebElement MainButton;
	public Page(String Email, String Password) {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return Email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		Email = email;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return Password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		Password = password;
	}
	/**
	 * @return the mainButton
	 */
	public WebElement getMainButton() {
		return MainButton;
	}
	/**
	 * @param mainButton the mainButton to set
	 */
	public void setMainButton(WebElement mainButton) {
		MainButton = mainButton;
	}

	
	
}
