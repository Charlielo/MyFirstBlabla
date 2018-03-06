import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Test1 
{
	 
		WebDriver fire = new FirefoxDriver();

		
		fire.get("file:///Users/charlie/Desktop/Automation%20/projectAutomation/signUp/index.html");

		fire.findElement(By.id("Sign-UpB")).click();

		fire.findElement(By.id("FNTB"));

		fire.findElement(By.id("LNTB"));

		fire.findElement(By.id("EmailTB"));

		fire.findElement(By.id("PassTB"));

		Thread.sleep(2000);

		fire.findElement(By.id("BGetS")).click();

		WebElement Button = 	fire.findElement(By.xpath("/html/body/p/label/input"));

		fire.get("file:///Users/charlie/Desktop/Automation%20/projectAutomation/signUp/index.html");

		fire.findElement(By.id("LoginB")).click();

		fire.findElement(By.id("ReEmailTB"));

		fire.findElement(By.id("RePassTB"));

		WebElement LogBut = fire.findElement(By.xpath("//*[@id=\"ReBGetS\"]"));

	

	public boolean isEmpty(String str) 
	{
		if(str.length()>=1) 
		{

			return true;

		}
		else 
		{
			return false;
		}



	}

	public boolean isEmpty2(String stl) 
	{
		if(stl.length()>=1) 
		{

			return true;

		}
		else 
		{
			return false;
		}

	}




	public boolean mail(String mail) 
	{

		if(mail.contains("@")) 
		{
			return true;
		}


		else {
			return false;

		}

	}

	public boolean password(String password) 
	{

		if(password.length()>=1) 
		{

			return true;

		}
		else 
		{
			return false;
		}


	}

	public boolean NextPage(String next) 
	{	
		if(next.contains("Index of file:///")==true)
		{
			return true;

		}
		else
		{
			return false;

		}

	}

	public boolean LogClick(String LogTab)
	{
		if(LogTab.contains("Welcome Back!")==true) 
		{
			return true;

		}
		else 
		{
			return false;

		}




	}

	public boolean ReMail(String m)
	{
		if(m.length()>=1) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	


}

