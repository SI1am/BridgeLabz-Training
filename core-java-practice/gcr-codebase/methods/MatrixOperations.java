package methods;

import java.util.*;

public class MatrixOperations {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows for the matrix: \n");
		int row =sc.nextInt();
		System.out.print("Enter the number of columns for the matrix: \n");
		int col =sc.nextInt();
        int[][] A = createMatrix(row, col);
        int[][] B = createMatrix(row, col);

        System.out.println("Matrix A:\n");
        display(A);
        System.out.println();

        System.out.println("Matrix B:\n");
        display(B);
        System.out.println();

        System.out.println("Addition:");
        System.out.println();
        display(add(A, B));
        System.out.println();

        System.out.println("Subtraction:");
        System.out.println();
        display(subtract(A, B));
        System.out.println();

        System.out.println("Multiplication:");
        System.out.println();
        display(multiply(A, B));
        System.out.println();
    }
	
    public static int[][] createMatrix(int r, int c) {
    	
        Random rand = new Random();
        int[][] m = new int[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                m[i][j] = rand.nextInt(10);

        return m;
    }

    public static int[][] add(int[][] a, int[][] b) {
        int[][] res = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                res[i][j] = a[i][j] + b[i][j];
        return res;
    }

    public static int[][] subtract(int[][] a, int[][] b) {
        int[][] res = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                res[i][j] = a[i][j] - b[i][j];
        return res;
    }

    public static int[][] multiply(int[][] a, int[][] b) {
        int[][] res = new int[a.length][b[0].length];

        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < b[0].length; j++)
                for (int k = 0; k < b.length; k++)
                    res[i][j] += a[i][k] * b[k][j];

        return res;
    }

    public static void display(int[][] m) {
        for (int[] row : m) {
            for (int val : row)
                System.out.print(val + "\t");
            System.out.println();
        }
    }

    
}
