import java.util.Scanner;

class Building {
    String name;
    String address;
    int floors;

    public void displayInfo() {
        System.out.println ("\n==== DATA GEDUNG ====");
        System.out.println("Nama Gedung  : " + name);
        System.out.println("Alamat Gedung: " + address);
        System.out.println("Jumlah Lantai: " + floors);
    }

    public void addNewBuilding () {
        Scanner input = new Scanner (System.in);
        System.out.println ("=== Masukan Data Gedung Baru ===");
        System.out.print ("Masukan Nama Gedung: ");
        this.name = input.nextLine ();
        System.out.print ("Masukan Alamat Gedung: ");
        this.address = input.nextLine ();
        System.out.print ("Masukan Jumlah Lantai: ");
        this.floors = input.nextInt ();
    }
}

public class Main {
    public static void main(String[] args) {
        Building gedungWalikota = new Building();
        gedungWalikota.addNewBuilding ();
        gedungWalikota.displayInfo ();
    }
}
