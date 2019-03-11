package cse360assign3;

public class Main 
{
	public static void main(String [] args)
	{
		OrderedIntList list = new OrderedIntList();
		list.insert(11);
		list.insert(2);
		list.insert(33);
		list.insert(4);
		list.insert(5);
		list.insert(60);
		list.insert(33);
		list.insert(8);
		list.insert(39);
		
		//list.print();
		System.out.println(list.toString());
		
		//System.out.println("The current size of the ");
		System.out.println("\nThe current size of the array is: " + list.size());
		System.out.println("\nThe current length of the array is: " + list.length() + "\n");
		
		list.delete(8);
		list.delete(10);
		list.delete(2);
		list.delete(5);
		list.delete(4);
		
		//System.out.println(list);
		//list.print();
		System.out.println(list.toString());
		
		System.out.println("\nThe current size of the array is: " + list.size());
		System.out.println("\nThe current length of the array is: " + list.length());
	}
}
