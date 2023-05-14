package Model;

public class MahasiswaTransfer extends Mahasiswa {
    private double IPKSebelumnya;
    
    public double getIPKSebelumnya() {
        return IPKSebelumnya;
    }

    public void setIPKSebelumnya(double IPKSebelumnya) {
        this.IPKSebelumnya = IPKSebelumnya;
    }
  
        public void inputKRS () {
            super.inputKRS();
            System.out.println("Input KRS Sebelumnya");
        }

}