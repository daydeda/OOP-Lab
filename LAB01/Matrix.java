import java.util.Scanner;
public class Matrix {
    public static double sumColumn(double[][]m, int columnIndex){
        double sum = 0;
        for(int i = 0; i < m.length; i++){
            sum += m[i][columnIndex];
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row: ");
        double[][] matrix = new double[3][4];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = input.nextDouble();
            }
        }
        for(int j = 0; j < matrix[0].length; j++){
            System.out.println("Sum of the elements at column " + j + " is " + sumColumn(matrix, j));
        }
        input.close();
    }
}
