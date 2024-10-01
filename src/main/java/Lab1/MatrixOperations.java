package Lab1;

public class MatrixOperations {
    int recordBook = 5543;
    int C5 = recordBook % 5; //3
    int C7 = recordBook % 7; //6
    int C11 = recordBook % 11; //10

    public MatrixOperations() {}

    public void Matrix(int [][] A, int [][] B){
        try{
            this.showMatrix(B, "Initial matrix");
            int[][] C = bitwiseXor(A, B);
            this.showMatrix(C, "Matrix after Xor");
        }catch (Exception e){
            System.out.println("Error:" + e.getMessage());
        }

        }
    public void showMatrix(int [][] matrix, String text){
        System.out.println(text);
        for (int [] row : matrix) {
            for (int column : row) {
                System.out.print(column + "\t");
            }
            System.out.println();
        }
    }
    public static int[][] bitwiseXor(int[][] A, int [][] B){
        int rows = A.length;
        int cols = A[0].length;
        if (B.length != rows || B[0].length != cols) {
            throw new IllegalArgumentException("Matrices must have the same size");
        }
        int[][] C = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                C[i][j] = A[i][j] ^ B[i][j];
            }
        }
        return C;
    }
}

