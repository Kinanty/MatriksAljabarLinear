import java.util.Scanner;

public class OperasiMatriks {
    public Scanner scanner = new Scanner(System.in);
    public int[][] inputNilaiMatriks(int rows, int columns, Scanner scanner) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Masukkan elemen pada posisi [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }
    public void inputJumlahMatriks(){
        System.out.print("Masukkan jumlah matriks yang akan dijumlahkan: ");
        int numMatrices = scanner.nextInt();

        // Memasukkan ukuran matriks
        System.out.print("Masukkan jumlah baris matriks: ");
        int rows = scanner.nextInt();

        System.out.print("Masukkan jumlah kolom matriks: ");
        int columns = scanner.nextInt();

        // Membuat array untuk menyimpan matriks-matriks
        int[][][] matrices = new int[numMatrices][rows][columns];

        // Memasukkan elemen-elemen matriks
        for (int k = 0; k < numMatrices; k++) {
            System.out.println("Masukkan elemen-elemen matriks ke-" + (k + 1) + ":");
            matrices[k] = inputNilaiMatriks(rows, columns, scanner);
        }

        // Menjumlahkan matriks
        int[][] sumMatrix = addMatrices(matrices);

        // Menampilkan hasil penjumlahan
        System.out.println("Hasil penjumlahan matriks:");
        printMatrix(sumMatrix);
    }
    public int[][] addMatrices(int[][][] matrices) {
        int numMatrices = matrices.length;
        int rows = matrices[0].length;
        int columns = matrices[0][0].length;
        int[][] result = new int[rows][columns];

        for (int k = 0; k < numMatrices; k++) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    result[i][j] += matrices[k][i][j];
                }
            }
        }

        return result;
    }
    public void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
