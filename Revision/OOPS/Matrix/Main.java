package Matrix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows =sc.nextInt();
        int cols = sc.nextInt();
        Matrix matrix1 = new Matrix(rows,cols);
        matrix1.readMatrix();
     //   matrix1.displayMatrix();
            Matrix matrix2 = matrix1.transposeMatrix(matrix1);
            matrix2.displayMatrix();
//        int rows1 =sc.nextInt();
//        int cols1 = sc.nextInt();
//        Matrix matrix2 = new Matrix(rows1,cols1);
//        matrix2.readMatrix();
//
//        Matrix sumMatrix = matrix1.addMatrix(matrix1,matrix2);
//        if(sumMatrix!=null)
//            sumMatrix.displayMatrix();




    }
}
