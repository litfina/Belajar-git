import java.util.Scanner;

public class tenaryoperator {
    public static void main(String[] args) {
        int input, x;
        Scanner inputScanner = new Scanner(System.in);
        
        System.out.print("Masukan nilai A : ");
        input = inputScanner.nextInt();

        x = (input == 10) ? (input*input) : (input/2);

        System.out.println("Hasil Inpunt : " + x); //tanda ? ini sebagai tanda tenary tenary hanya bisa di gunakna kalo hanya if else bukan banyak if else nya 
    }
}