import java.util.Scanner;

public class OperasiMatriks {
    Scanner scanner = new Scanner(System.in);

    public int[][] penjumlahanMatriks(int[][][] matriks){
        int row = matriks[0].length;
        int column = matriks[0][0].length;
        int[][] hasil = new int[row][column];

        for(int indexMatriks = 0; indexMatriks < matriks.length; indexMatriks++){
            for (int i = 0; i < row; i++){
                for(int j = 0; j < column; j++){
                    hasil[i][j] += matriks[indexMatriks][i][j];
                }
            }
        }
        return hasil;
    }

    public int[][] penguranganMatriks(int[][][] matriks){
        int row = matriks[0].length;
        int column = matriks[0][0].length;
        int[][] hasil = new int[row][column];

        for (int indexMatriks = 0; indexMatriks < matriks.length; indexMatriks++){
            for (int i = 0; i < row; i++){
                for (int j = 0; j < column; j++){
                    if (indexMatriks == 0){
                        hasil[i][j] = matriks[0][i][j];
                    }else {
                        hasil[i][j] -= matriks[indexMatriks][i][j];
                    }
                }
            }
        }
        return hasil;
    }

    public int[][] perkalianMatriks(int[][][] matriks){
        int row = matriks[0].length;
        int column = matriks[0][0].length;
        int[][] hasil = new int[row][column];

        for (int indexMatriks = 0; indexMatriks < matriks.length; indexMatriks++){
            for (int i = 0; i < row; i++){
                for (int j = 0; j < column; j++){
                    if (indexMatriks == 0){
                        hasil[i][j] = matriks[0][i][j];
                    }else {
                        hasil[i][j] *= matriks[indexMatriks][i][j];
                    }
                }
            }
        }
        return hasil;
    }

    public int[][] transposeMatriks(int[][] matriks){
        int row = matriks.length;
        int column = matriks[0].length;
        int[][] transposedMatrix = new int[column][row];

        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                transposedMatrix[j][i] = matriks[i][j];
            }
        }
        return transposedMatrix;
    }

    public int determinanMatriks(int[][] matriks){
        int n =  matriks.length;

        // jika matriks 1 x 1
        if (n == 1) {
            return matriks[0][0];
        }

        int determinant = 0;

        for (int i = 0; i < n; i++){
            determinant += matriks[0][i] * getCofactor(matriks, 0, i) * Math.pow(-1, i);
        }

        return determinant;
    }
    public int getCofactor(int[][] matriks, int row, int col) {
        int n = matriks.length - 1;
        int[][] cofactor = new int[n][n];

        int iCofactor = 0;
        int jCofactor = 0;

        for (int i = 0; i < matriks.length; i++){
            if (i == row) continue;

            for(int j = 0; j < matriks[i].length; j++){
                if (j == col) continue;

                cofactor[iCofactor][jCofactor] = matriks[i][j];
                jCofactor++;

                if (jCofactor == n){
                    jCofactor = 0;
                    iCofactor++;
                }
            }
        }
        return determinanMatriks(cofactor);
    }

    public void printMatriks(int[][] matriks){
        for (int[] row : matriks){
            for (int value : row){
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
