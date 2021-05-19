import java.util.Arrays;
import java.util.List;

public class Aufgabe8 {

    public static void main(String[] args) {
        double [][] test = myMatrixRandom(5,10);
        myMatrixPrint(test);
    }

    public static double[][] myMatrixRandom(int row, int col) {
        double[][] a = new double[row][col];
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[i].length; j++){
                a[i][j] = Math.random();
            }
        }
        return a;
    }

    public static void myMatrixPrint(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Wert von [" + i + "][" + j + "] ist : " + matrix[i][j]);
            }
        }
    }

    public static void myMatrixSwapRows(double[][] matrix, int row1, int row2){
        double [] temp = new double [matrix[row1].length];
        temp = matrix[row1];
        matrix[row1] = matrix[row2];
        matrix[row2] = temp;
    }

    public static double[][] myMatrixTranspose(double[][] matrix) {
        double [][] temp = new double [matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                temp [j][i] = matrix[i][j];
            }
        }
        return temp;
    }

}
