

public class Log extends Page{



	/**
	 * @param Email
	 * @param Password
	 * @param logMail
	 * @param logPass
	 */
	public Log(String Email, String Password ) {
		super(Email, Password);

	}

	public static boolean PassBox(String Email)
	{

		if(Email.length()>=1) 
		{
			return true;
		}

		else 
		{
			return false;
		}
	}	

	public static boolean ReMailBox(String Email) 
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

	public String getPageSource() {
		
		return "Index of file:///";
	}








}
