public class AduhBanget {
    public static void main(String[] args) {
        String warna = "Hijau";

        switch (warna) {
            case "Hijau" -> System.out.println("Benda Itu Hijau");
            case "Merah" -> System.out.println("Benda Itu Merah");
            default -> System.out.println("Warna tidak dikenali");
        }
    }
}