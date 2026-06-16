import java.util.Scanner;

public class hasilcarakter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input Your Name : ");
        String namechar = input.nextLine();

        System.out.print("Input Your Age : ");
        int agechar = input.nextInt();
        input.nextLine();

        System.out.print("Class (Warrior/Mage/Archer/Tank) : ");
        String heroclas = input.nextLine();

        System.out.print("Gender (Male / Female) : ");
        boolean gender = input.nextLine().equalsIgnoreCase("Female"); // ← fix di sini

        Charakter playerCharacter = new Charakter();
        playerCharacter.createChar(namechar, agechar, heroclas, gender);
        System.out.println("Character creation complete! Get ready for your adventure!");
        input.close();
    }
}