public class DataBangunan {
    private String nama, gedung, lokasi;
    private int usia, berapalantai, usiabangunan;

    public void setdata(String nama, int usia, String gedung, String lokasi, int berapalantai, int usiabangunan) {
        this.nama = nama;
        this.usia = usia;
        this.gedung = gedung;
        this.lokasi = lokasi;
        this.berapalantai = berapalantai;
        this.usiabangunan = usiabangunan;
    }

    public String getnama() { return nama; }
    public int getusia() { return usia; }
    public String getgedung() { return gedung; }
    public String getlokasi() { return lokasi; }
    public int getberapalantai() { return berapalantai; }
    public int getusiabangunan() { return usiabangunan; }

    //getter gak usah di rubah mau gimana bentuknya tetap aman aja 

    @Override
    public String toString() {
        return 
            "Nama          : " + nama + "\n" +
            "Usia          : " + usia + " THN" + "\n" +
            "Nama Gedung   : " + gedung + "\n" +
            "Lokasi        : " + lokasi + "\n" +
            "Jumlah Lantai : " + berapalantai + "\n" +
            "Usia Bangunan : " + usiabangunan + " THN";
    }
}

    //return "Nama: " + nama + ",Lokasi: " + lokasi + ",Nama Gedung: " + gedung + ",Berapa Lantai: " + berapalantai + ",Usia: " + usia + ",Usia Bangunan: " + usiabangunan; 
