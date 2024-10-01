package Lab1;

public class Main {
    public static void main(String[] args) {
        MatrixOperations MatrixOperations = new MatrixOperations();
        float[][] A = {
                {1.2F, 2.1F , 3.1F},
                {4.3F, 5.4F, 6.1F},
                {7.2F, 8.3F, 9.1F}
        };

        float[][] B = {
                {9.1F, 8.3F, 7.2F},
                {6.1F, 5.4F, 4.3F},
                {3.1F, 2.1F, 1.2F}
        };
        MatrixOperations.Matrix(A, B);
    }
}
