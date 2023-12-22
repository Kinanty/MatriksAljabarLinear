import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperasiMatriks oprmatriks = new OperasiMatriks();

        int jumlahMatriks;
        int row;
        int column;
        int[][][] matriks;
        int indexMatriks;
        int pilihan;

        do {
            System.out.println("Operasi matriks");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Transpose");
            System.out.println("5. Determinan");
            System.out.println("6. OBE");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jumlah matriks: ");
                    jumlahMatriks = scanner.nextInt();
                    System.out.print("Masukkan jumlah baris matriks: ");
                    row = scanner.nextInt();
                    System.out.print("Masukkan jumlah kolom matriks: ");
                    column = scanner.nextInt();

                    matriks = new int[jumlahMatriks][row][column];
                    for (indexMatriks = 0; indexMatriks < jumlahMatriks; indexMatriks++) {
                        System.out.println("Masukkan elemen-elemen matriks ke-" + (indexMatriks + 1) + ": ");
                        for (int i = 0; i < row; i++) {
                            for (int j = 0; j < column; j++) {
                                System.out.print("Elemen baris ke-[" + (i + 1) + "] kolom ke-[" + (j + 1) + "]: ");
                                matriks[indexMatriks][i][j] = scanner.nextInt();
                            }
                        }
                    }
                    int[][] sumMatriks = oprmatriks.penjumlahanMatriks(matriks);
                    System.out.println("Hasil penjumlahan matriks: ");
                    oprmatriks.printMatriks(sumMatriks);
                    break;
                case 2:
                    System.out.print("Masukkan jumlah matriks: ");
                    jumlahMatriks = scanner.nextInt();
                    System.out.print("Masukkan jumlah baris matriks: ");
                    row = scanner.nextInt();
                    System.out.print("Masukkan jumlah kolom matriks: ");
                    column = scanner.nextInt();

                    matriks = new int[jumlahMatriks][row][column];
                    for (indexMatriks = 0; indexMatriks < jumlahMatriks; indexMatriks++) {
                        System.out.println("Masukkan elemen-elemen matriks ke-" + (indexMatriks + 1) + ": ");
                        for (int i = 0; i < row; i++) {
                            for (int j = 0; j < column; j++) {
                                System.out.print("Elemen baris ke-[" + (i + 1) + "] kolom ke-[" + (j + 1) + "]: ");
                                matriks[indexMatriks][i][j] = scanner.nextInt();
                            }
                        }
                    }

                    int[][] subMatriks = oprmatriks.penguranganMatriks(matriks);
                    System.out.println("Hasil pengurangan matriks: ");
                    oprmatriks.printMatriks(subMatriks);
                    break;
                case 3:
                    System.out.print("Masukkan jumlah matriks: ");
                    jumlahMatriks = scanner.nextInt();
                    System.out.print("Masukkan jumlah baris matriks: ");
                    row = scanner.nextInt();
                    System.out.print("Masukkan jumlah kolom matriks: ");
                    column = scanner.nextInt();

                    matriks = new int[jumlahMatriks][row][column];
                    for (indexMatriks = 0; indexMatriks < jumlahMatriks; indexMatriks++) {
                        System.out.println("Masukkan elemen-elemen matriks ke-" + (indexMatriks + 1) + ": ");
                        for (int i = 0; i < row; i++) {
                            for (int j = 0; j < column; j++) {
                                System.out.print("Elemen baris ke-[" + (i + 1) + "] kolom ke-[" + (j + 1) + "]: ");
                                matriks[indexMatriks][i][j] = scanner.nextInt();
                            }
                        }
                    }

                    int[][] multiplyMatrix = oprmatriks.perkalianMatriks(matriks);
                    System.out.println("Hasil perkalian matriks: ");
                    oprmatriks.printMatriks(multiplyMatrix);
                    break;
                case 4:
                    System.out.print("Masukkan jumlah baris matriks: ");
                    row = scanner.nextInt();
                    System.out.print("Masukkan jumlah kolom matriks: ");
                    column = scanner.nextInt();

                    int[][] tMatriks = new int[row][column];
                    System.out.println("Masukkan elemen-elemen matriks:");
                    for (int i = 0; i < row; i++) {
                        for (int j = 0; j < column; j++) {
                            System.out.print("Elemen baris ke-[" + (i + 1) + "] kolom ke-[" + (j + 1) + "]: ");
                            tMatriks[i][j] = scanner.nextInt();
                        }
                    }

                    System.out.println("Matriks sebelum transpose: ");
                    oprmatriks.printMatriks(tMatriks);

                    int[][] transposedMatrix = oprmatriks.transposeMatriks(tMatriks);

                    System.out.println("Matriks setelah transpose: ");
                    oprmatriks.printMatriks(transposedMatrix);
                    break;
                case 5:
                    System.out.print("Masukkan ukuran matriks (n x n): ");
                    int n = scanner.nextInt();

                    int[][] detMatrix = new int[n][n];
                    System.out.println("Masukkan elemen-elemen matriks: ");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < n; j++) {
                            System.out.print("Elemen baris ke-[" + (i + 1) + "] kolom ke-[" + (j + 1) + "]: ");
                            detMatrix[i][j] = scanner.nextInt();
                        }
                    }

                    int determinan = oprmatriks.determinanMatriks(detMatrix);
                    System.out.println("Determinan matriks: " + determinan);
                    break;
            }
        } while (pilihan != 0);
    }
}
