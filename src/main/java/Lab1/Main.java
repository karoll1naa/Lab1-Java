package Lab1;

public class Main {
    public static void main(String[] args) {
        MatrixOperations MatrixOperations = new MatrixOperations();
        float[][] A = {
                {1.0F, 2.0F, 3.0F},
                {4.0F, 5.0F, 6.0F},
                {7.0F, 8.0F, 9.0F}
        };

        float[][] B = {
                {9.0F, 8.0F, 7.0F},
                {6.0F, 5.0F, 4.0F},
                {3.0F, 2.0F, 1.0F}
        };
        MatrixOperations.Matrix(A, B);
    }
}
