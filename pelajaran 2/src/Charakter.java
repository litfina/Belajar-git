public class Charakter {
    private String name, heroclas;
    private int age;
    private boolean gender;

    // Setter
    public void setName(String name)        { this.name = name; }
    public void setAge(int age)             { this.age = age; }
    public void setHeroclas(String heroclas){ this.heroclas = heroclas; }
    public void setGender(boolean gender)   { this.gender = gender; }

    // Getter
    public String getName()    { return name; }
    public int getAge()        { return age; }
    public String getHeroclas(){ return heroclas; }
    public String getGender()  { return gender ? "Female" : "Male"; }

    public void createChar(String name, int age, String heroclas, boolean gender) {
        this.name = name;
        this.age = age;
        this.heroclas = heroclas;
        this.gender = gender;
        displayCharInfo();
    }

    public void displayCharInfo() {
        System.out.println("=== Charakter ===");
        System.out.println("Name   : " + getName());
        System.out.println("Age    : " + getAge());
        System.out.println("Gender : " + getGender()); // ← pakai getter
        System.out.println("Class  : " + getHeroclas());
    }
}