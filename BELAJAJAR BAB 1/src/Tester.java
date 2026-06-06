import java.util.Scanner;

public class Tester {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean kanjut = true;

        do {
            System.out.println("=====================");
            System.out.println("=== Data Perumahan ===");
            System.out.println("=====================");
            System.out.println("1. Data Pemilik Rumah");
            System.out.println("2. Tampilkan Data Rumah");
            System.out.println("3. Exit");
            System.out.print("Pilih Menu : ");
            int milih = input.nextInt();
            input.nextLine();

            if (milih == 1) {
                String namabangunan, lokasi;
                int floar;

                System.out.print("Masukan Nama Bangunan : ");
                namabangunan = input.nextLine();
                System.out.print("Masukan Lokasi Bangunan : ");
                lokasi = input.nextLine();
                System.out.print("Masukan Jumlah Lantai : ");
                floar = input.nextInt();
                input.nextLine();

                System.out.println("=====================================");
                System.out.println("Nama Bangunan : " + namabangunan);
                System.out.println("Lokasi        : " + lokasi);
                System.out.println("Jumlah Lantai : " + floar);
                System.out.println("=====================================");
                System.out.print("Tekan Enter untuk kembali ke menu...");
                input.nextLine();
                clearScreen(); // ← clear!

            } else if (milih == 2) {
                System.out.println("=====================================");
                System.out.println("Tunggu Update Selanjutnya");
                System.out.println("=====================================");
                System.out.print("Tekan Enter untuk kembali ke menu...");
                input.nextLine();
                clearScreen(); // ← clear!

            } else if (milih == 3) {
                System.out.println("Selamat Tinggal");
                kanjut = false;

            } else {
                System.out.println("Pilihan Tidak Valid");
                System.out.print("Tekan Enter untuk kembali ke menu...");
                input.nextLine();
                clearScreen(); // ← clear!
            }

        } while (kanjut);

        input.close();
    }
}