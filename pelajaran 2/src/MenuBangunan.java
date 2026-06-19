import java.util.Scanner;

public class MenuBangunan{
    Scanner input = new Scanner(System.in);
    
    public DataBangunan MengisiData(){
        DataBangunan db = new DataBangunan();

        System.out.print("Masukan Nama Kamu: ");
        String nama = input.nextLine();

        System.out.print("Masukan Usia Kamu: ");
        int usia = input.nextInt();
        input.nextLine();

        System.out.print("Masukan Nama Gedung Yang Kamu Tinggali: ");
        String gedung = input.nextLine();

        System.out.print("Masukan Lokasi Gedung Tempat Tinggal Kamu: ");
        String lokasi = input.nextLine();

        System.out.print("Masukan Berapa Lantai Gedung Kamu: ");
        int berapalantai = input.nextInt();
        input.nextLine();

        System.out.print("Masukan Usia Gedung Yang Kamu Tinggali Saat Ini: ");
        int usiabangunan = input.nextInt();
        input.nextLine();

        db.setdata(nama, usia, gedung, lokasi, berapalantai, usiabangunan);
        return db;
    }
    public void tutup() {
        input.close();
    }
}