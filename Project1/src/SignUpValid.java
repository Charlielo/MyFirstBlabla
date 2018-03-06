import static org.junit.Assert.*;
import org.junit.*;

import org.junit.Test;
import org.openqa.selenium.WebElement;

public class SignUpValid extends Page 
{
	
	private String  Fname;
	private String Lname;

	
	

	




	

	public SignUpValid(String Fname, String Lname, String Email, String Password) {
		super( "C@a", "a");
		
	}


	@Test 
	public void SanityF()
	{
		Fname = new Test1();
		assertEquals(true,Fname.isEmpty("c"));
	}
	

	@Test
	public void SanityL() 
	{
	
		Lname = new Test1();
		
		assertEquals(true,Lname.isEmpty("C"));
		
		
	}
	@Test
	public void SanityM() 
	{
	
		Mail = new Test1();
		
		
		assertEquals(true,Mail.mail("a@v"));
		
		
	}
	
	@Test
	public void SanityP() 
	{
		
		Pass = new Test1();
		
		assertEquals(true,Pass.password("a"));
		
	}
	

		
		
		
	
	@Test
	public void Endverify() 
	{
		
		NextPage = new Test1();
		
		assertEquals("Index of file:///", "Index of file:///");
		
		
	}
	
	}




