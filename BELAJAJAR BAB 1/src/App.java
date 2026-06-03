import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String name;
        int age;

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter your name: ");
            name = input.nextLine();

            System.out.print("Enter your age: ");
            age = input.nextInt();
        }

        System.out.println("nama :" + name);
        System.out.println("Umur :" + age);
    }
}