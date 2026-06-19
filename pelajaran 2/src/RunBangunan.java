public class RunBangunan{
    public static void main(String[] args) {
        MenuBangunan mbg = new MenuBangunan();
        DataBangunan db = mbg.MengisiData();

        System.out.println("\n=== Data Bangunan ===");
        System.out.println(db);
    }
}