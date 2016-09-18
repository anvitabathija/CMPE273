package Final;
import java.io.*;

class Alphabet
{
	char value;
	Alphabet next;

	public Alphabet()
	{
		value = 0;
		next = null;
	}

	public Alphabet(char n)
	{
		value = n;
		next = null;
	}

	public void setNext(Alphabet v)
	{
		next = v;
	}
	
	
	public Alphabet getNext()
	{
		return next;
	}
	
	public char getValue()
	{
		return value;
	}
}

class Alphabets
{
	
	public Alphabet first;
	public Alphabet top;
	
	public Alphabets()
	{
		first = null;
		top = null;
	}

	public boolean push()
	{
		try
		{
			if(first==null && top==null)
			{
				int val = 65;
				char new_insert = (char) val;
				first = new Alphabet(new_insert);
				top = first;
				System.out.println(new_insert+" added");
				return true;
			}
			else
			{
				char a = top.getValue();
				int current_max = a;
				int new_max = current_max + 1;
				
				if(new_max < 91)
				{
					char new_top = (char) new_max;
					Alphabet newobj = new Alphabet(new_top);
					
					newobj.next = top;
					top = newobj;
					System.out.println(new_top+" added");
					return true;
				}
				else
				{
					System.out.println("Last alphabet reached");
					return false;
				}
			}
		}catch(Exception e)
		{
			System.out.println("Exception caught : "+e.toString());
			return false;
		}
	}
	
	public boolean pop()
	{
		try
		{
			if(top!=null)
			{
				char a = top.getValue();
				int current_top = Integer.valueOf(a);
				
				if(current_top>65)
				{
					System.out.println(a+" popped");
					top = top.next;
				}
				else
				{
					if(current_top == 65)
					{
						System.out.println(a+" popped");
						top = null;
						first = null;
					}	
				}
				return true;
			}
			else
			{
				return false;
			}
		}catch(Exception e)
		{
			System.out.println("Exception caught : "+e.toString());
			return false;
		}
	}
	
	public void display()
	{
		Alphabet current = top;
		
		if(first!=null)
		{
			while(current.next != null)
			{
				System.out.print(current.getValue()+ " ");
				current = current.next;
			}
			System.out.println(current.getValue()+ " ");
		}
		else
		{
			System.out.println("List empty");
		}	
	}
}


public class AlphabetStack {

	public static void main(String args[])
	{
		Alphabets obj = new Alphabets();
		try
		{
			int option;
			do
			{
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					
				System.out.println("Choose one option : ");
				
				System.out.println("1 : Insert");
				System.out.println("2 : Remove");
				System.out.println("3 : Display");
				System.out.println("4 : Quit");
				option = Integer.valueOf(br.readLine());
				
				switch(option)
				{
				case 1:
					boolean push = obj.push();
					if(push)
						System.out.println("Successful add");
					else
						System.out.println("Maximum alphabet reached");
					break;
					
				case 2:
					boolean pop = obj.pop();
					if(pop)
						System.out.println("Successful pop");
					else
						System.out.println("Last element reached");
					break;
					
				case 3: 
					obj.display();
					break;
					
				case 4:
					System.out.println("Thank you");
					break;
					
				default:
					System.out.println("Invalid option");
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
