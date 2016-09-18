package Final;
import java.util.Arrays;

class ThreadDemo implements Runnable
{
	private Thread t;
	private int arr[];
	private String threadname;
	int n;
	
	ThreadDemo(String name, int arr_a[])
	{
		threadname = name;
		System.out.println("New Thread initiated: "+threadname);
		n = arr_a.length;
		arr = arr_a;
	}
	
	public void start()
	{
		System.out.println("Thread started : "+threadname);
		t = new Thread(this, threadname);
		t.start();		
	}

	public void run()
	{		
		try
		{
			for(int i=0; i < n; i++)
			{
				System.out.println("Thread "+threadname+": "+(arr[i]*arr[i]));
				Thread.sleep(100);
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Exception caught : "+e.toString());
		}
		
		System.out.println("Thread "+threadname+" finished");
	}
}

class ThreadMain
{
	public static void main(String args[])
	{
		int arr1[] = new int[]{1,2,3,4,5,6,7,8,9};
		int arr2[] = new int[]{10,11,12,13,14,15};
		
		ThreadDemo square1 = new ThreadDemo("Square 1",arr1);
		square1.start();
		
		ThreadDemo square2 = new ThreadDemo("Square 2",arr2);
		square2.start();
	}
}