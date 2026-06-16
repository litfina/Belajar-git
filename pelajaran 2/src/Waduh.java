import java.util.Scanner;

// Class Building - cetakan/blueprint data rumah
class Building {
    String namaBangunan;
    String lokasi;
    int floor;

    // Method untuk input data
    public void inputData(Scanner input) {
        System.out.print("Masukan Nama Bangunan : ");
        namaBangunan = input.nextLine();
        System.out.print("Masukan Lokasi Bangunan : ");
        lokasi = input.nextLine();
        System.out.print("Masukan Jumlah Lantai : ");
        floor = input.nextInt();
        input.nextLine();
    }

    // Method untuk tampilkan data
    public void displayInfo() {
        System.out.println("=====================================");
        System.out.println("Nama Bangunan : " + namaBangunan);
        System.out.println("Lokasi        : " + lokasi);
        System.out.println("Jumlah Lantai : " + floor);
        System.out.println("=====================================");
    }
}

// Class Menu - handle menu & navigasi
class Menu {
    Scanner input = new Scanner(System.in);
    Building building = new Building(); // ← objek Building
    boolean kanjut = true;

    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void waitEnter() {
        System.out.println("Tekan Enter Untuk Kembali Ke Menu..");
        input.nextLine();
        clearScreen();
    }

    public void showMenu() {
        System.out.println("=====================");
        System.out.println("=== Data Perumahan ===");
        System.out.println("=====================");
        System.out.println("1. Data Pemilik Rumah");
        System.out.println("2. Tampilkan Data Rumah");
        System.out.println("3. Exit");
        System.out.print("Pilih Menu : ");
    }

    public void run() {
        do {
            showMenu();
            int milih = input.nextInt();
            input.nextLine();

            if (milih == 1) {
                building.inputData(input);   // ← pakai method Building
                building.displayInfo();      // ← pakai method Building
                waitEnter();

            } else if (milih == 2) {
                System.out.println("=====================================");
                System.out.println("Tunggu Update Selanjutnya");
                System.out.println("=====================================");
                waitEnter();

            } else if (milih == 3) {
                System.out.println("Selamat Tinggal");
                kanjut = false;

            } else {
                System.out.println("Pilihan Tidak Valid");
                waitEnter();
            }

        } while (kanjut);

        input.close();
    }
}

// Class utama - cukup jalankan saja
public class Waduh {
    public static void main(String[] args) {
        Menu menu = new Menu(); // ← bikin objek Menu
        menu.run();             // ← jalankan
    }
}