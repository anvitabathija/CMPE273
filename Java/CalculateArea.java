package Final;
import java.io.*;

interface Calculate
{
	public int area(int h, int w);
	public int perimeter(int h, int w);
}

class Rectangle implements Calculate {

	public int area(int h, int w)
	{
		return (h * w);
	}
	
	public int perimeter(int h, int w)
	{
		return (2 * (h + w));
	}
	
}

class Triangle implements Calculate {

	public int area(int h, int b)
	{
		return ((h * b) / 2);
		
	}
	
	public int perimeter(int h, int b)
	{
		//assuming a isosceles triangle
		return (b + h + h); 
	}
	
}


public class CalculateArea
{
	public static void main(String args[])
	{
		int ans = 0;;
		do
		{
			try
			{
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				int a;
				int p;
				System.out.println("Choose 1 option : ");
				System.out.println("1 : Rectangle");
				System.out.println("2 : Triangle");
				System.out.println("3 : Quit");
				ans = Integer.valueOf(br.readLine());
				
				switch(ans)
				{
					case 1:
						Rectangle s = new Rectangle();
						System.out.println("Enter height of rectangle : ");
						int h1 = Integer.valueOf(br.readLine());
						System.out.println("Enter width of rectangle : ");
						int w1 = Integer.valueOf(br.readLine());
						a = s.area(h1,w1);
						p =s.perimeter(h1,w1);
						System.out.println("Area of rectange is : "+a);
						System.out.println("Perimeter of rectange is : "+p);
						break;
						
					case 2:
						Triangle t = new Triangle();
						System.out.println("Enter height of triangle: ");
						int h2 = Integer.valueOf(br.readLine());
						System.out.println("Enter base of triangle : ");
						int b2 = Integer.valueOf(br.readLine());
						a = t.area(h2,b2);
						p = t.perimeter(h2,b2);
						System.out.println("Area of triangle is : "+a);
						System.out.println("Perimeter of triangle is : "+p);
						break;
					case 3:
						System.out.println("Thank you");
						break;
					default:
						System.out.println("Incorrent option");
						break;
						
				}
			}
			catch(Exception e)
			{
				System.out.println("Exception caught : "+e.toString());
			}
	}while(ans!=3);
		
	}
}
