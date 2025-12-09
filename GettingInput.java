/*
 * Getting an input from the user
 */ 
import java.util.Scanner;
Public class GettingInput
{
	public static void main (String[] args)
	{
		//declarations 
		String s = JOptionPane.showInputDialog(“What is your name?");
		String name;        //reference type
		int age;   	    //primitive type

		Scanner kb_num= new Scanner (system.in); //reference type
		Scanner kb_num= new Scanner (system.in);
		//input
		//python: name input("Enter your name: ")

		System.out.print("Enter your name: ");
		name = kb.nextLine();

		System.out.print("Enter your name: ");
		name = kb.nextInt();	

		//kb.nextLine();	

		System.out.print("Enter your name: ");
		age = kb.nextLine();		

		// processing


		//output
		System.out.println("Your name is:" +name);
		System.out.println("Your age is:" +age); 


	}


}