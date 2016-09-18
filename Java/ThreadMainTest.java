package Final;

import junit.framework.TestCase;

public class ThreadMainTest extends TestCase {
	
	public void testFailure() throws Exception {
		
		int arr1[] = new int[]{7,5};
		ThreadDemo square1 = new ThreadDemo("Square 1",arr1);
		square1.start();
	}
}
