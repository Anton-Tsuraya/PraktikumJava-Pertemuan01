package Model;

public class Mahasiswa {
    private int id;
    private String NPM;
    private String nama;
    private double IPK;

    public Mahasiswa() {
    }
    
    
    
    public Mahasiswa(int id, String NPM, String nama, double IPK) {
        this.id = id;
        this.NPM = NPM;
        this.nama = nama;
        this.IPK = IPK;
    }
    
    
    
        public void mendaftarUlang () {
            System.out.println("Mahasiswa mendaftar Ulang");
        }
        public void inputKRS () {
            System.out.println("Mahasiswa Input KRS");
        }
        
        public void inputKRS (int JumlahSKS, int jumlahKRS, int jumlahMK) {
            System.out.println("Mahasiswa Input KRS Sebanyak: " +JumlahSKS+ "SKS");
            System.out.println("Mahasiswa Input KRS: " +jumlahKRS+ "KRS");
            System.out.println("Mahasiswa Input Mata Kuliah: " + jumlahMK );
        }
        
        public void inputKRS (float IPSemester,  float IPK) {
            System.out.println("Mahasiswa Input KRS Sebanyak: " +IPSemester );
            System.out.println("IPK Mahasiswa: " +IPK );
            
        }
        
        public void inputKRS (String namaMahasiswa, String namaDosenPembimbing) {
            System.out.println("Input Nama Mahasiswa: " +namaMahasiswa );
            System.out.println("Input Dosen Pembimbing: " +namaDosenPembimbing );
        }
                       
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNPM() {
        return NPM;
    }

    public void setNPM(String NPM) {
        this.NPM = NPM;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getIPK() {
        return IPK;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }
    
    public void viewData () {
        System.out.println("=========== View Data ============");
        System.out.println("ID \t " +id);
        System.out.println("NPM \t " +NPM);
        System.out.println("Nama \t " +nama);
        System.out.println("IPK \t " +IPK);
        System.out.println("=========== View Data ============");
        System.out.println("");
    }
}
