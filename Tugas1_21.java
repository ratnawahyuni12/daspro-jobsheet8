import java.util.Scanner;
public class Tugas1_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N;
        char ulang;

        System.out.println("======================- PERSEGI ANGKA -======================");
        System.out.println("catatan : angka yang dimasukkan dari rentang 3 hingga 9 saja!");
        System.out.println();
        
        do {
            do {
                System.out.print("Masukkan nilai N = ");
                N = sc.nextInt();

                if (N < 3 || N > 9) {
                    System.out.println("Nilai N minimal 3 dan maksimal 9! silahkan coba lagi!");
                }
            } while (N < 3 || N > 9);
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    if (i == 1 || i == N || j == 1 || j == N) { 
                        System.out.print(N + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }

            System.out.print("Apakah anda ingin mencoba lagi? (y/n): ");
            ulang = sc.next().charAt(0);
            System.out.println();

        } while (ulang == 'y' || ulang == 'Y');
        System.out.println("======================- SELESAI -======================");

        sc.close();
    }
}