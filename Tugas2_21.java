import java.util.Scanner;
public class Tugas2_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahPoliteknik;

        System.out.println("=================- EVENT NASIONAL PORSENI -=================");
        System.out.println();
        System.out.print("Jumlah Politeknik: ");
        jumlahPoliteknik = sc.nextInt();
        sc.nextLine();
        System.out.println();

        for (int p = 1; p <= jumlahPoliteknik; p++) {
            System.out.println("=====- Data Politeknik ke-" + p + " -=====");
            System.out.print("Nama Politeknik: ");
            String namaPoliteknik = sc.nextLine();
            System.out.println();

            System.out.println("===- Cabang Olahraga: Badminton -===");
            System.out.print("Nama atlet ke-1: ");
            String b1 = sc.nextLine();
            System.out.print("Nama atlet ke-2: ");
            String b2 = sc.nextLine();
            System.out.print("Nama atlet ke-3: ");
            String b3 = sc.nextLine();
            System.out.print("Nama atlet ke-4: ");
            String b4 = sc.nextLine();
            System.out.print("Nama atlet ke-5: ");
            String b5 = sc.nextLine();

            System.out.println("Daftar Atlet Badminton dari " + namaPoliteknik + ":");
            System.out.println("1. " + b1);
            System.out.println("2. " + b2);
            System.out.println("3. " + b3);
            System.out.println("4. " + b4);
            System.out.println("5. " + b5);
            System.out.println();

            System.out.println("===- Cabang Olahraga: Tenis Meja -===");
            System.out.print("Nama atlet ke-1: ");
            String tm1 = sc.nextLine();
            System.out.print("Nama atlet ke-2: ");
            String tm2 = sc.nextLine();
            System.out.print("Nama atlet ke-3: ");
            String tm3 = sc.nextLine();
            System.out.print("Nama atlet ke-4: ");
            String tm4 = sc.nextLine();
            System.out.print("Nama atlet ke-5: ");
            String tm5 = sc.nextLine();

            System.out.println("Daftar Atlet Tenis Meja dari " + namaPoliteknik + ":");
            System.out.println("1. " + tm1);
            System.out.println("2. " + tm2);
            System.out.println("3. " + tm3);
            System.out.println("4. " + tm4);
            System.out.println("5. " + tm5);
            System.out.println();

            System.out.println("===- Cabang Olahraga: Basket -===");
            System.out.print("Nama atlet ke-1: ");
            String bb1 = sc.nextLine();
            System.out.print("Nama atlet ke-2: ");
            String bb2 = sc.nextLine();
            System.out.print("Nama atlet ke-3: ");
            String bb3 = sc.nextLine();
            System.out.print("Nama atlet ke-4: ");
            String bb4 = sc.nextLine();
            System.out.print("Nama atlet ke-5: ");
            String bb5 = sc.nextLine();

            System.out.println("Daftar Atlet Basket dari " + namaPoliteknik + ":");
            System.out.println("1. " + bb1);
            System.out.println("2. " + bb2);
            System.out.println("3. " + bb3);
            System.out.println("4. " + bb4);
            System.out.println("5. " + bb5);
            System.out.println();

            System.out.println("===- Cabang Olahraga: Bola Voly -===");
            System.out.print("Nama atlet ke-1: ");
            String bv1 = sc.nextLine();
            System.out.print("Nama atlet ke-2: ");
            String bv2 = sc.nextLine();
            System.out.print("Nama atlet ke-3: ");
            String bv3 = sc.nextLine();
            System.out.print("Nama atlet ke-4: ");
            String bv4 = sc.nextLine();
            System.out.print("Nama atlet ke-5: ");
            String bv5 = sc.nextLine();

            System.out.println("Daftar Atlet Bola Voly dari " + namaPoliteknik + ":");
            System.out.println("1. " + bv1);
            System.out.println("2. " + bv2);
            System.out.println("3. " + bv3);
            System.out.println("4. " + bv4);
            System.out.println("5. " + bv5);
            System.out.println();
        }
        System.out.println("=================- TERIMA KASIH -=================");
        sc.close();
    }
}
