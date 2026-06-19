import java.util.Scanner;

public class menukalkulator{
    Scanner input = new Scanner(System.in);
    Kalkulator kalk = new Kalkulator();
    boolean lanjut = true;
        
        public void tampilMenu() {
        System.out.println("\n=== Kalkulator OOP ===");
        System.out.println("1. Tambah");
        System.out.println("2. Kurang");
        System.out.println("3. Kali");
        System.out.println("4. Bagi");
        System.out.println("5. Exit");
        System.out.print("Pilih: ");
    }

    public void inputangka (){
        System.out.print("angka 1 : ");
        double a1 = input.nextDouble();
        System.out.print("angka 2 : ");
        double a2 = input.nextDouble();
        kalk.setdata(a1, a2);
    }

    public void run (){
        do {
            tampilMenu();
            int Pilih = input.nextInt();

            if (Pilih == 5 ) {
                System.out.print("Error");
                lanjut = false;
                break;
            }
            inputangka();
            if (Pilih == 1) {kalk.tambah(); kalk.tampillkanhasil("+"); }
            else if (Pilih == 2 ) {kalk.kurang(); kalk.tampillkanhasil("-");}
            else if ( Pilih == 3) { kalk.kali(); kalk.tampillkanhasil("x"); }
            else if (Pilih == 4) {
                if (!kalk.bagi()) System.out.println("Tidak Bisa di Bagi 0 ");
                else kalk.tampillkanhasil("/");
            }
            else {System.out.println("Pilihan Tidak Valid"); }
        }while ( lanjut );

        input.close();
    }
}