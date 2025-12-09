/* grade average with for loop */

import java.util.Scanner;

public class GradeAverageFor
{
	public static void main(String [] args)
	{
		//declarations
		double grade, total, average;
		int n;
            //input
            try (Scanner kb = new Scanner(System.in)) {
                //input
                System.out.print("How many grades do you want to enter? ");
                n = kb.nextInt(); //its the numbers of numbers that the user will enter

//{
//int var = 5; // this variable is local to this block
//System.out.println("The value of var is: " + var); 
//}


//processing
total = 0; // you can declare it her as int i = 0 but have to remove the int in the for loop
for (int i = 0; i <n; i++) // this is where the managment of the loop happens
    // if you used ; it's only gonna ask you once/ one number and the block wont be part
    // of for loop
{
    System.out.print("Enter a grade: ");
    grade = kb.nextDouble();
    total = total + grade;		//we overwrite what is in total
}
// System.out.println("The value of i is:" +i); // this will give an error because i is only defined in the for loop
average = total / n;

//variables are locals to blocks
//output
System.out.println("The average is " + String.valueOf(average));
            }
	}
}