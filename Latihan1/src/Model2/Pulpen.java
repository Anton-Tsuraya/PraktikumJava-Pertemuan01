package Model2;


public class Pulpen {
    private int Panjang;
    private String Berat;
    private String nama;
    private double Harga;

    public int getPanjang() {
        return Panjang;
    }

    public void setPanjang(int Panjang) {
        this.Panjang = Panjang;
    }

    public String getBerat() {
        return Berat;
    }

    public void setBerat(String Berat) {
        this.Berat = Berat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return Harga;
    }

    public void setHarga(double Harga) {
        this.Harga = Harga;
    }

        public void viewData () {
        System.out.println("=========== View Data ============");
        System.out.println("Panjang Pulpen \t " +Panjang);
        System.out.println("Berat Pulpen \t " +Berat);
        System.out.println("Nama Pulpen \t " +nama);
        System.out.println("Harga Pulpen \t " +Harga);
        System.out.println("=========== View Data ============");
        System.out.println("");
    }
    
}

   
