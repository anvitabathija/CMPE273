package Final;
import java.io.*;

class Customer
{
	String name;
	Customer next;

	public Customer()
	{
		name = "";
		next = null;
	}

	public Customer(String n)
	{
		name = n;
		next = null;
	}

	public void setNext(Customer v)
	{
		next = v;
	}
	
	
	public Customer getNext()
	{
		return next;
	}
	
}

class BaggageCounter
{
	
	public Customer last;
	public Customer service;
	
	public BaggageCounter()
	{
		last = null;
		service = null;
	}

	public boolean enqueue(String name)
	{
		if(last==null && service==null)
		{
			last = new Customer(name);
			service = last;
			System.out.println("First Customer added");
		}
		else
		{
			Customer temp = new Customer(name);
			last.setNext(temp);
			last = temp;
			
			System.out.println("New Customer added");
		}
		return true;
	}	

	public void display()
	{
		if(service!=null)
		{
			Customer current = service;
		
			System.out.println();
			System.out.println("Line Sequence");
			System.out.println();
			while(current.next != null)
			{
				System.out.print(current.name+" ");
				current = current.next;
			}
			System.out.println(current.name);
		}
		else
		{
			System.out.println("No customer in line");
		}
	}

	public boolean dequeue()
	{
		if(service != null)
		{
			Customer current = service;
			Customer newService = service.next;
					
			current.name = "";
			current.setNext(null);
			
			service = newService;
			
			return true;
		}
		
		
		return false;
	}
}

class AirportBaggageQueue
{
	public static void main(String args[])
		{
			try
			{	
				BaggageCounter line = new BaggageCounter();
				int option = 0;
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
				do
				{
				System.out.println("1 : Add new customer");
				System.out.println("2 : Service one customer");
				System.out.println("3 : View Queue");
				System.out.println("4 : Quit");
				System.out.println("Select one option : ");
				String option1 = br.readLine();
				option = Integer.valueOf(option1);
				
				switch(option)
				{
				case 1: 
					System.out.println("Enter name of the customer : ");
					String newname = br.readLine();
					boolean resultenqueue = line.enqueue(newname);
					if(resultenqueue)
						System.out.println("customer added");
					break;
				
				case 2: 
					System.out.println("Thank you");
					boolean resultdequeue = line.dequeue();
					if(resultdequeue)
						System.out.println("One customer serviced");
					else
						System.out.println("No customer in line");
					break;
				
				case 3:
					System.out.println("Thank you, the list is as below");
					line.display();
					break;
					
				case 4:
					System.out.println("Thank you");
					break;
					
				default:
					System.out.println("Wrong input");
					break;
				
				}
				}
				while(option!=4);
				
			}
			catch(Exception e)
			{
				System.out.println("Exception caught : "+e.toString());
			}
		
		}
}