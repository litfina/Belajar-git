public class Kalkulator {
    private double data1, data2, hasil;

    //setter
    public void setdata (double data1, double data2){ //static gak bisa pake this.
        this.data1 = data1;
        this.data2 = data2;
    }
    //getter
    public double gethasil() { return hasil;}

    public void tambah() {hasil = data1 + data2;}
    public void kurang() {hasil = data1 - data2;}
    public void kali()   {hasil = data1 * data2;}
    public boolean  bagi (){
        if (data2 == 0 ) return false;
        hasil = data1 / data2;
        return true;
    }

public void tampillkanhasil(String operator) {
    System.out.println("Hasil: " + String.format("%.2f", data1) + " " + operator + " " + 
                        String.format("%.2f", data2) + " = " + String.format("%.2f", hasil));
                            }
}