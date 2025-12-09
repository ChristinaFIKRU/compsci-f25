/*
 * examples of void methods
 *all types must be consistent
 * values that are sent into methods are called arguments
 * the variables in the method header that receive the values are called parameters
 * if theres only one statment you can skip the curly braces
 */

import java.util.*;
public class Greetings{
    public static void main (String[] args)
    {
        Scanner kb = new Scanner(System.in); 
        displayMessage();   //Method call
        Greetings.displayMessage(); 

        displayMessage("Any string");
        System.out.print("Enter your name:");

        String name = kb.nextLine();
        //displayMessage(name);

        System.out.print("How many times do you want to display your name? ");
        int ntimes = kb.nextInt();
        displayMessage(name, ntimes); //ok
      // displayMessage(ntimes, name); //error because you cant type int before string



    }
    public static void displayMessage(String s, int n)// to pass an argument
{// s and n are local variables to the method, theyre only known inside the method
    for (int i = 1;  i <= n; i++){ // for each variable you have to specify the type
        System.out.println(s);
    }
}
    public static void displayMessage(String s) //method overloading
{
    System.out.println(s);
}
    public static void displayMessage()//function definition
    {
        System.out.println("Hello Word");

    }


}