package Matrix;

import java.util.Scanner;

public class Matrix {
    private int rows;
    private int cols;
    private int[][] data;
    public Matrix(int rows,int cols) {
        this.rows = rows;
        this.cols = cols;
        data = new int[rows][cols];
    }
    public void readMatrix() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i][j]=sc.nextInt();
            }
        }
    }

    public void displayMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j]+" ");
            }
            System.out.println();
        }
    }

    public Matrix addMatrix(Matrix matrix1, Matrix matrix2) {
        if((matrix1.rows != matrix2.rows) && (matrix1.cols!= matrix2.cols))
            return null;

        Matrix matrix3 = new Matrix(matrix1.rows,matrix1.cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix3.data[i][j]=matrix1.data[i][j]+matrix2.data[i][j];
            }
        }
        return matrix3;
    }

    public Matrix productMatrix(Matrix matrix1, Matrix matrix2) {
        if(matrix1.cols!=matrix2.rows) {
            return null;
        }
        Matrix matrix3 = new Matrix(matrix1.rows,matrix1.cols);
        for (int i = 0; i < matrix1.rows; i++) {
            for (int j = 0; j < matrix2.cols; j++) {
                for (int k = 0; k < matrix1.cols; k++) {
                    matrix3.data[i][j]+=matrix1.data[i][k]*matrix2.data[k][j];
                }
            }
        }
        return matrix3;
    }

    public Matrix transposeMatrix(Matrix matrix) {
        Matrix matrix1 = new Matrix(matrix.rows,matrix.cols);
        for (int i=0;i<matrix.rows;i++) {
            for (int j=0;j<matrix.cols;j++) {
                matrix1.data[i][j]=matrix.data[j][i];
            }
        }
        return matrix1;
    }
}
