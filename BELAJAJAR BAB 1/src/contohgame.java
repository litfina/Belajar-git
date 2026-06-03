import java.util.Scanner;

public class contohgame{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("---selamat datang di dunia fantasy ---");

        System.out.print("Masukan Nama Kamu : ");
        String name = s.nextLine();

        System.out.print("Masukan Usia Kamu : ");
        int age = s.nextInt();

        if ( age < 17) {
            System.out.println ("Usia Tidak Mencukupi Untuk Memainkan game ini ");
            s.close();
            return;
        } else {
                    System.out.println("Selamat datang " + name + " di benua iris" );
        }
            System.out.println("Les`s Make some Character!");

            boolean continuecreation = true;

            do { 
                System.out.println("Chose your character class");
                System.out.println("1. warior");
                System.out.println("2. mage");
                System.out.println("3. archer");

                System.out.print("enter the number your choice : ");
                int classchoice = s.nextInt();
                s.nextLine();
                
                if (classchoice == 1) {
                    continuecreation = false;
                    System.out.println("you have choose the warior class! Strong and Brave");
                    break;
                } else  if (classchoice == 2){
                    continuecreation = false;
                    System.out.println("you have choose the the mage class! wise and powerfull");
                    break;
                } else if (classchoice == 3){
                    continuecreation = false;
                    System.out.println("you have choose the archer class! quick and accurate");
                    break;
                } else {System.out.println("invalid choice. please try again");}

                
            } while (continuecreation);

        System.out.println("Character creation complete! Get ready for your adventure");
        s.close();
    }
}