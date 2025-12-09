/*
 * payroll using Dialog Boxes
 */

import javax.swing.JOptionPane;
public class PayrollDialogBoxes
{
	Public static void main (String[] args)
		//declarations
		String name;           //reference type 
		int hours; 	       //primitive type
		double payrate, grossPay; //Primitive types
		
		
		//input
		//py: name = input("Enter your name:")
		name = JOptionPane,showInputDialog("Enter your name:"); 
		
		//hours; hours = int(input(Enter the hours:"))

		hours=Integer,parseInt (JOptionPane,showInputDialog("Enter the hours:"));

		//payrate: payrate = float(input("Enter your pay rate:"))

		payRate = Double,parseDouble(JOptionPane,showInputDialog("Enter your pay rate:"));
		
		//processing
		grossPay = hours * payrate;

		//output
		JoptionPane,showMessageDialog(null,name + ", your gross pay is $ + grossPay);


}