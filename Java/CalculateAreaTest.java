package Final;

import junit.framework.TestCase;

public class CalculateAreaTest extends TestCase {
	public void testFailure() throws Exception {
		Rectangle r1 = new Rectangle();
		int a1 = r1.area(3, 4);
		assertEquals(12,a1);
		int p1 = r1.perimeter(3, 4);
		assertEquals(14,p1);
		
		Triangle t1 = new Triangle();
		int a2 = t1.area(3, 4);
		assertEquals(6,a2);
		int p2 = t1.perimeter(3, 4);
		assertEquals(10,p2);
		
	}
}
