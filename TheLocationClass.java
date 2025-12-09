// Christina F
// The Location Class - location for locating
// 11/4/25

public class TheLocationClass{
    public int row; 
    public int column;
    public double maxValue;

public TheLocationClass(){}  //no arg constructor

public TheLocationClass (int row, int column, double maxValue){
    this.row = row;
    this.column = column;
    this.maxValue = maxValue;
} 

public static TheLocationClass locateLargest(double [] [] a){
    int maxRow = 0; 
    int maxCol = 0; 
    double maxValue = a [0][0];

for (int i = 0; i < a.length; i++){
    for (int j = 0; j < a[i].length; j++){
        if (a[i][j] > maxValue){
            maxValue = a[i][j];
            maxRow = i; 
            maxCol = j;

        }
    }
}
    return new TheLocationClass (maxRow, maxCol, maxValue);
}
}
