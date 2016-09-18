package Final;

import junit.framework.TestCase;

public class DequeueTest extends TestCase {
	public void testFailure() throws Exception {
		BaggageCounter test = new BaggageCounter();
		test.enqueue("Anvita");
	     boolean result = test.dequeue();
	     if(result)
	    	 System.out.println("Customer serviced");
	     assertEquals(true,result);
	 }
}
