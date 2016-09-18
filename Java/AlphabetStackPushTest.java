package Final;

import junit.framework.TestCase;

public class AlphabetStackPushTest extends TestCase {
	public void testFailure() throws Exception {
		Alphabets test = new Alphabets();
	    boolean result = true;
		for(int i = 0;i < 26;i++)
			result = test.push();
	     
			assertEquals(true,result);
			
		boolean result1 = test.push();
		assertEquals(false,result1);
	 }
}
