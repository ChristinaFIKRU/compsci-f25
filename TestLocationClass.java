// Christina F
// The Location Class tester code
// 11/4/25
import java.util.Scanner;

public class TestLocationClass{
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);

        System.out.print("Enter the num of rows & column:");
        int rows = input.nextInt();
        int cols = input.nextInt();

        double[][] array = new double [rows][cols];

        System.out.println("Enter the array:");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                array [i][j] = input.nextDouble();
            }
        }
        TheLocationClass location = TheLocationClass.locateLargest(array);

        System.out.println("The largest element is " + location.maxValue + ", and its located at (" + location.row + "," + location.column +")");

input.close();

    }
}