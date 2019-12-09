// Java code to illustrate boolean isEmpty() method 

import java.io.*; 
import java.util.*; 

public class GFG { 
	public static void main(String args[]) 
	{ 

		// creating an empty LinkedList 
		Collection<String> list = new LinkedList<String>(); 

		// use add() method to add elements in the list 
		list.add("Geeks"); 
		list.add("for"); 
		list.add("Geeks"); 

		// Output the present list 
		System.out.println("The list is: " + list); 

		// Check if list is empty 
		// using isEmpty() method 
		System.out.println("Is the LinkedList empty: "
						+ list.isEmpty()); 

		// Clearing the LinkedList 
		list.clear(); 

		// printing the new list 
		System.out.println("The new List is: " + list); 

		// Check if list is empty 
		// using isEmpty() method 
		System.out.println("Is the LinkedList empty: "
						+ list.isEmpty()); 
	} 
} 
