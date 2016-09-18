package Final;

import junit.framework.TestCase;

public class EnqueueTest extends TestCase {
	
	public void testFailure() throws Exception {
		BaggageCounter test = new BaggageCounter();
	     boolean result = test.enqueue("Anvita");
	     assertEquals(true,result);
	 } 
	
}
