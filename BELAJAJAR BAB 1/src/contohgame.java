import java.util.Scanner;

public class contohgame{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("---selamat datang di dunia fantasy ---");

        System.out.println("Masukan Nama Kamu ");
        String name = s.nextLine();

        System.out.println("Masukan Usia Kamu");
        int age = s.nextInt();

        if ( age < 17) {
            System.out.println("Usia Tidak Mencukupi");
        }

    }
}