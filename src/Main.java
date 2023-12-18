import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris: ");
        int row = scanner.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        int column = scanner.nextInt();
        int[][] matriks = new int[row][column];

        System.out.println("Masukkan nilai matriks");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                System.out.print("Masukkan nilai pada baris ke " + (i + 1) + " kolom ke " + (j + 1) + " :");
                matriks[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matriks: ");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }
    }
}
