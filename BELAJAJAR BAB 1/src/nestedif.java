public class nestedif{
    public static void main(String[] args) {
        int umur = 20;
        boolean punyagaji = true;
        
        if (umur >18){
            System.out.println("Umur dewasa");
            if (punyagaji){
                System.out.println("dan punya gaji");
            }else{
                System.out.println("tidak punya gaji");
            }
        } 
        else if (umur >= 10){
            System.out.println("Umur remaja");
        }
        else {
            System.out.println("Umur anak anak");
        }
    }
}