package Final;
import java.util.Arrays;

class GenericsDemo {
	
	public < T extends Comparable> T[] genericMethod(T[] arr)
	{	
		System.out.println();
		
		int n = arr.length;
		
		for(int i=0; i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(arr[j].compareTo(arr[i]) > 0)
				{
					T temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		System.out.println("Class type is : "+arr.getClass().getName());
		
		return arr;		
	}
	
	public static void main(String args[])
	{
		GenericsDemo g = new GenericsDemo();
		
		Integer[] arr1 = {5,3,4,2,1,7,6};
		Character[] arr2 = new Character[]{'x','r','t','a','s'};
		String[] arr3 = new String[]{"cmpe273","cmpe277","cmpe283"};
		
		Integer[] arr11 = g.genericMethod(arr1);
		System.out.println("Sorted List : "+Arrays.toString(arr11));
		
		Character[] arr21 = g.genericMethod(arr2);
		System.out.println("Sorted List : "+Arrays.toString(arr21));
		
		String[] arr31 = g.genericMethod(arr3);
		System.out.println("Sorted List : "+Arrays.toString(arr31));
		
	}

	
}
