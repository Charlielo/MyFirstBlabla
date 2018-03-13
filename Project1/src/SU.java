import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SU extends Page{

	String Fname;
	String Lname;
	 private static SU FnameBox;

	





	/**
	 * @param Email
	 * @param Password
	 * @param fname
	 * @param lname
	 */
	public SU(String Email, String Password, String fname, String lname ) {
		super(Email, Password);
		Fname = fname;
		Lname = lname;

		
	}


	/**
	 * @return the fname
	 */
	public String getFname() {
		return Fname;
	}


	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		Fname = fname;
	}


	/**
	 * @return the lname
	 */
	public String getLname() {
		return Lname;
	}


	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		Lname = lname;
	}

/*	public WebElement findElement(By id) {
		// TODO Auto-generated method stub
		return null;
	}
*/

	public String getPageSource() {
	
		return "Index of file:///";
	}
	



	public static boolean FnameBox(String Fname) 
	{
		if(Fname.length()>=1) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

	public static boolean LnameBox(String Lname) 
	{
		if(Lname.length()>=1) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	
	
	public static boolean EmailBox(String Email) 
	{
		if(Email.contains("@")) 
		{
			return true;
		}
		else 
		{
			
			return false;
		}
	}
	
	public static boolean Pbox(String Password) 
	{
		if(Password.length()>=1) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public static final boolean Gui(String str) 
	{
		if(str.equals("/html/body/div")) 
		{
			return true;
		}
		else 
		{
			return false;
		}
			
	}






	
}
