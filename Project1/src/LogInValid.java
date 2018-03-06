import static org.junit.Assert.*;

import org.junit.*;

public class LogInValid extends Page 
{
	private Test1 MailLog;
	private Test1 PassLog;



	

	@Test
	public void testMail() 
	{

		MailLog = new Test1();
		
		assertEquals("Charlie@museloop.com", "C@a");

	}


}
