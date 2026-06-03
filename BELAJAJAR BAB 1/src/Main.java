import java.util.Scanner; //mengimpor liblary untuk menbaca input

public class Main {  // ← M kapital
    public static void main(String[] args) {  // ← m kecil
        Scanner c = new Scanner(System.in);
        double totalnilai = 0;

        System.out.println("=== Program Analisa Nilai Siswa ===");
        
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahsiswa = c.nextInt();
        c.nextLine();

        for (int i = 1; i <= jumlahsiswa; i++) {
            System.out.print("Masukan Nilai Siswa ke-" + i + ": ");
            double nilaisaya = c.nextDouble();
            c.nextLine();
            totalnilai += nilaisaya;
            
            if (nilaisaya >= 75) {
                System.out.println(" ---> Status Lulus");
            } else if (nilaisaya >= 50) {
                System.out.println(" ---> Status Remedial");
            } else {
                System.out.println(" ---> Status Tidak Lulus");
            }
            System.out.println("-------------------------------------");
        }

        if (jumlahsiswa > 0) {
            double rataRata = totalnilai / jumlahsiswa;
            System.out.println("Rata-Rata nilai kelas: " + rataRata);
        } else {
            System.out.println("Tidak ada siswa yang dianalisa.");
        }

        c.close();
    }
}