import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * 
 */

/**
 * @author charlie
 *
 */

public class TestSpace {



	@Test
	public void SanitySU() throws InterruptedException {
		WebDriver San = new FirefoxDriver();
		SU Sanity = new SU("a@a", "a", "a", "a");
		San.get("file:///Users/charlie/Desktop/Automation%20/projectAutomation/signUp/index.html");

		WebElement Button1  =  San.findElement(By.id("Sign-UpB"));
		Button1.click();
		San.findElement(By.id("FNTB")).sendKeys(Sanity.getFname());

		San.findElement(By.id("LNTB")).sendKeys(Sanity.getLname());

		San.findElement(By.xpath("//*[@id=\"EmailTB\"]")).sendKeys(Sanity.getEmail());

		San.findElement(By.id("PassTB")).sendKeys(Sanity.getPassword());;

		Thread.sleep(2000);

		assertEquals(true, SU.FnameBox(Sanity.getFname())); //call sanity Fname method
		assertEquals(true, SU.LnameBox(Sanity.getLname()));  //call snaity Fname
		assertEquals(true, SU.EmailBox(Sanity.getEmail())); //Email box method
		San.findElement(By.id("BGetS")).click();
		assertEquals(true, San.getPageSource().contains("Index of file:///"));

	}



	@Test
	public void LogSanity() throws InterruptedException 
	{
		WebDriver LogSan = new FirefoxDriver();
		Log Sani = new Log("a@a", "a");
		LogSan.get("file:///Users/charlie/Desktop/Automation%20/projectAutomation/signUp/index.html");

		LogSan.findElement(By.id("LoginB")).click();

		LogSan.findElement(By.id("ReEmailTB")).sendKeys(Sani.getEmail());

		LogSan.findElement(By.id("RePassTB")).sendKeys(Sani.getPassword());




		assertEquals(true, Log.ReMailBox(Sani.getEmail())); //call sanity method
		assertEquals(true, Log.PassBox(Sani.getPassword()));
		Thread.sleep(2000);
		LogSan.findElement(By.id("ReBGetS")).click();
		assertEquals(true, LogSan.getPageSource().contains("Index of file:///"));
	}








	@Test

	public void FunctionallitySu() throws InterruptedException 
	{


		WebDriver Fun = new FirefoxDriver();
		SU Functionallity = new SU ("Charlie@gmail.com", "CharLie12", "Charlie", "Ochayon");
		Fun.get("file:///Users/charlie/Desktop/Automation%20/projectAutomation/signUp/index.html");

		Fun.findElement(By.id("Sign-UpB")).click();

		Fun.findElement(By.id("FNTB")).sendKeys(Functionallity.getFname());

		Fun.findElement(By.id("LNTB")).sendKeys(Functionallity.getLname());

		Fun.findElement(By.xpath("//*[@id=\"EmailTB\"]")).sendKeys(Functionallity.getEmail());

		Fun.findElement(By.id("PassTB")).sendKeys(Functionallity.getPassword());;

		assertEquals(true, SU.FnameBox(Functionallity.getFname()));

		assertEquals(true, SU.LnameBox(Functionallity.getLname()));

		assertEquals(true, SU.EmailBox(Functionallity.getEmail()));

		assertEquals(true, SU.Pbox(Functionallity.getPassword()));

		Thread.sleep(2000);

		Fun.findElement(By.id("BGetS")).click();

		assertEquals(true, Fun.getPageSource().contains("Index of file:///"));
	}

	@Test
	public void Func2SU() throws InterruptedException 
	{
		WebDriver Fun2SU = new FirefoxDriver();

		SU Func2 = new SU ("Charie@museloop.com", "1234", "Charlie", "Ochayon");

		Fun2SU.get("file:///Users/charlie/Desktop/Automation%20/projectAutomation/signUp/index.html");

		Fun2SU.findElement(By.id("Sign-UpB")).click();

		Fun2SU.findElement(By.id("FNTB")).sendKeys(Func2.getFname());

		Fun2SU.findElement(By.id("LNTB")).sendKeys(Func2.getLname());

		Fun2SU.findElement(By.xpath("//*[@id=\"EmailTB\"]")).sendKeys(Func2.getEmail());

		Fun2SU.findElement(By.id("PassTB")).sendKeys(Func2.getPassword());;

		assertEquals(true, SU.FnameBox(Func2.getFname()));

		assertEquals(true, SU.LnameBox(Func2.getLname()));

		assertEquals(true, SU.EmailBox(Func2.getEmail()));

		assertEquals(true, SU.Pbox(Func2.getPassword()));

		Thread.sleep(2000);

		Fun2SU.findElement(By.id("BGetS")).click();

		assertEquals(true, Fun2SU.getPageSource().contains("Index of file:///"));
	}	

	@Test
	public void Func3SU() throws InterruptedException 
	{

		WebDriver Fun3SU = new ChromeDriver();

		SU Func3 = new SU("cHaRliE@Walla.com", "CW8765", "Marley", "BOB");

		Fun3SU.get("file:///Users/charlie/Desktop/Automation%20/projectAutomation/signUp/index.html");

		Fun3SU.findElement(By.id("Sign-UpB")).click();

		Fun3SU.findElement(By.id("FNTB")).sendKeys(Func3.getFname());

		Fun3SU.findElement(By.id("LNTB")).sendKeys(Func3.getLname());

		Fun3SU.findElement(By.xpath("//*[@id=\"EmailTB\"]")).sendKeys(Func3.getEmail());

		Fun3SU.findElement(By.id("PassTB")).sendKeys(Func3.getPassword());;

		assertEquals(true, SU.FnameBox(Func3.getFname()));

		assertEquals(true, SU.LnameBox(Func3.getLname()));

		assertEquals(true, SU.EmailBox(Func3.getEmail()));

		assertEquals(true, SU.Pbox(Func3.getPassword()));

		Thread.sleep(2000);

		Fun3SU.findElement(By.id("BGetS")).click();

		assertEquals(true, Func3.getPageSource().contains("Index of file:///"));
	}		

	@Test
	public void Func4SU() throws InterruptedException 
	{
		WebDriver Fun4SU = new SafariDriver();

		SU Func4 = new SU("char23@nanna.co.il", "mopsi45", "charls", "BanANA");

		Fun4SU.get("file:///Users/charlie/Desktop/Automation%20/projectAutomation/signUp/index.html");

		Fun4SU.findElement(By.id("Sign-UpB")).click();

		Fun4SU.findElement(By.id("FNTB")).sendKeys(Func4.getFname());

		Fun4SU.findElement(By.id("LNTB")).sendKeys(Func4.getLname());

		Fun4SU.findElement(By.xpath("//*[@id=\"EmailTB\"]")).sendKeys(Func4.getEmail());

		Fun4SU.findElement(By.id("PassTB")).sendKeys(Func4.getPassword());;

		assertEquals(true, SU.FnameBox(Func4.getFname()));

		assertEquals(true, SU.LnameBox(Func4.getLname()));

		assertEquals(true, SU.EmailBox(Func4.getEmail()));

		assertEquals(true, SU.Pbox(Func4.getPassword()));

		Thread.sleep(2000);

		Fun4SU.findElement(By.id("BGetS")).click();

		//assertEquals(true, Fun4SU.getPageSource().contains("Charlie"));
	}		


	@Test
	public void FuncLog() throws InterruptedException 
	{
		WebDriver FuncL = new FirefoxDriver();

		Log Func1L = new Log("Charlie@gmail.com", "CharLie12");

		FuncL.get("file:///Users/charlie/Desktop/Automation%20/projectAutomation/signUp/index.html");

		FuncL.findElement(By.id("LoginB")).click();

		FuncL.findElement(By.id("ReEmailTB")).sendKeys(Func1L.getEmail());

		FuncL.findElement(By.id("RePassTB")).sendKeys(Func1L.getPassword());

		assertEquals(true, Log.ReMailBox(Func1L.getEmail()));

		assertEquals(true, Log.PassBox(Func1L.getPassword()));

		Thread.sleep(2000);

		FuncL.findElement(By.id("ReBGetS")).click();

		assertEquals(true, FuncL.getPageSource().contains("Index of file:///"));
	}

	@Test
	public void funcLog2() throws InterruptedException 
	{
		WebDriver FuncL2 = new FirefoxDriver();

		Log Func2L = new Log("Charie@museloop.com", "1234");

		FuncL2.get("file:///Users/charlie/Desktop/Automation%20/projectAutomation/signUp/index.html");

		FuncL2.findElement(By.id("LoginB")).click();

		FuncL2.findElement(By.id("ReEmailTB")).sendKeys(Func2L.getEmail());

		FuncL2.findElement(By.id("RePassTB")).sendKeys(Func2L.getPassword());

		assertEquals(true, Log.ReMailBox(Func2L.getEmail()));

		assertEquals(true, Log.PassBox(Func2L.getPassword()));

		Thread.sleep(2000);

		FuncL2.findElement(By.id("ReBGetS")).click();

		assertEquals(true, FuncL2.getPageSource().contains("Index of file:///"));
	}

	@Test
	public void funcLog3() throws InterruptedException 
	{
		WebDriver FuncL3 = new FirefoxDriver();

		Log Func3L = new Log("cHaRliE@Walla.com", "CW8765");

		FuncL3.get("file:///Users/charlie/Desktop/Automation%20/projectAutomation/signUp/index.html");

		FuncL3.findElement(By.id("LoginB")).click();

		FuncL3.findElement(By.id("ReEmailTB")).sendKeys(Func3L.getEmail());

		FuncL3.findElement(By.id("RePassTB")).sendKeys(Func3L.getPassword());

		assertEquals(true, Log.ReMailBox(Func3L.getEmail()));

		assertEquals(true, Log.PassBox(Func3L.getPassword()));

		Thread.sleep(2000);

		FuncL3.findElement(By.id("ReBGetS")).click();

		assertEquals(true, FuncL3.getPageSource().contains("Index of file:///"));

	}

	@Test
	public void funcLog4() throws InterruptedException 
	{
		WebDriver FuncL4 = new FirefoxDriver();

		Log Func4L = new Log("char23@nanna.co.il", "mopsi45");

		FuncL4.get("file:///Users/charlie/Desktop/Automation%20/projectAutomation/signUp/index.html");

		FuncL4.findElement(By.id("LoginB")).click();

		FuncL4.findElement(By.id("ReEmailTB")).sendKeys(Func4L.getEmail());

		FuncL4.findElement(By.id("RePassTB")).sendKeys(Func4L.getPassword());

		assertEquals(true, Log.ReMailBox(Func4L.getEmail()));

		assertEquals(true, Log.PassBox(Func4L.getPassword()));

		Thread.sleep(2000);

		FuncL4.findElement(By.id("ReBGetS")).click();

		assertEquals(true, FuncL4.getPageSource().contains("Index of file:///"));

	}



	@Test
	public void Gui() 
	{
		WebDriver Gu1 = new FirefoxDriver();

		Gu1.get("file:///Users/charlie/Desktop/Automation%20/projectAutomation/signUp/index.html");

		boolean Gui = Gu1.findElement(By.xpath("/html/body/div")).isDisplayed();

	}

	@Test

	public void ErrorH() throws InterruptedException 
	{

		WebDriver Er = new FirefoxDriver();

		SU Er1 = new SU("@A@", "#", "%", "");

		Er.get("file:///Users/charlie/Desktop/Automation%20/projectAutomation/signUp/index.html");

		Er.findElement(By.id("Sign-UpB")).click();

		Er.findElement(By.id("FNTB")).sendKeys(Er1.getFname());

		Er.findElement(By.id("LNTB")).sendKeys(Er1.getLname());

		Er.findElement(By.xpath("//*[@id=\"EmailTB\"]")).sendKeys(Er1.getEmail());

		Er.findElement(By.id("PassTB")).sendKeys(Er1.getPassword());

		Thread.sleep(2000);

		Er.findElement(By.id("BGetS")).click();

		assertEquals(false, SU.Gui(Er1.getFname()));
	}
	@Test

	public void ErrorH2() throws InterruptedException 
	{

		WebDriver Er2 = new FirefoxDriver();

		SU Erl2 = new SU("arnona", "", "", "1");

		Er2.get("file:///Users/charlie/Desktop/Automation%20/projectAutomation/signUp/index.html");

		Er2.findElement(By.id("Sign-UpB")).click();

		Er2.findElement(By.id("FNTB")).sendKeys(Erl2.getFname());

		Er2.findElement(By.id("LNTB")).sendKeys(Erl2.getLname());

		Er2.findElement(By.xpath("//*[@id=\"EmailTB\"]")).sendKeys(Erl2.getEmail());

		Er2.findElement(By.id("PassTB")).sendKeys(Erl2.getPassword());

		Thread.sleep(2000);

		Er2.findElement(By.id("BGetS")).click();

		assertEquals(false, SU.Gui(Erl2.getFname()));
	}
	
	
	
	
	@Test
	public void ErrorHlog() throws InterruptedException 
	{
		WebDriver ErL = new FirefoxDriver();

		Log Erl1 = new Log("@a@", "#");

		ErL.get("file:///Users/charlie/Desktop/Automation%20/projectAutomation/signUp/index.html");

		ErL.findElement(By.id("LoginB")).click();

		ErL.findElement(By.id("ReEmailTB")).sendKeys(Erl1.getEmail());

		ErL.findElement(By.id("RePassTB")).sendKeys(Erl1.getPassword());

		assertEquals(true, Log.ReMailBox(Erl1.getEmail()));

		assertEquals(true, Log.PassBox(Erl1.getPassword()));

		Thread.sleep(2000);

		ErL.findElement(By.id("ReBGetS")).click();

		assertEquals(false, ErL.getPageSource().contains("Index of file:///"));

	}

	@Test
	public void ErrorHlog2() throws InterruptedException 
	{
		WebDriver ErL2 = new FirefoxDriver();

		Log Erl2 = new Log("a@@@  Q", "@#$%");

		ErL2.get("file:///Users/charlie/Desktop/Automation%20/projectAutomation/signUp/index.html");

		ErL2.findElement(By.id("LoginB")).click();

		ErL2.findElement(By.id("ReEmailTB")).sendKeys(Erl2.getEmail());

		ErL2.findElement(By.id("RePassTB")).sendKeys(Erl2.getPassword());

		assertEquals(true, Log.ReMailBox(Erl2.getEmail()));

		assertEquals(true, Log.PassBox(Erl2.getPassword()));

		Thread.sleep(2000);

		ErL2.findElement(By.id("ReBGetS")).click();

		assertEquals(false, ErL2.getPageSource().contains("Index of file:///"));

	}




}
