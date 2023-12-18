import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperasiMatriks oprmatriks = new OperasiMatriks();

        System.out.println("Operasi matriks");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Transpose");
        System.out.println("5. Determinan");
        System.out.println("6. OBE");
        System.out.print("Masukkan pilihan");
        int pilihan = scanner.nextInt();

        switch (pilihan){
            case 1:
                oprmatriks.inputJumlahMatriks();
                break;
        }
    }
}
