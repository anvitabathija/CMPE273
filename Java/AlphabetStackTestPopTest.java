package Final;

import junit.framework.TestCase;

public class AlphabetStackTestPopTest extends TestCase {

	public void testFailure() throws Exception {
		Alphabets test = new Alphabets();
	   
		boolean result = test.pop();
		assertEquals(false,result);
		
		test.push();
		boolean result1 = test.pop();
		assertEquals(true,result1);
		
	 }
	
}
