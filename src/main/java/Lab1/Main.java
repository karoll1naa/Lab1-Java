package Lab1;

public class Main {
    public static void main(String[] args) {
        MatrixOperations MatrixOperations = new MatrixOperations();
        int[][] A = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] B = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };
        MatrixOperations.Matrix(A, B);
    }
}
