package PraktikumJava;

import Model.Mahasiswa;
import Model.MahasiswaTransfer;

public class PraktikumJava {


    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
                
        mahasiswa.setId(1);
        mahasiswa.setNPM("2110010332");
        mahasiswa.setNama("ANTON TSURAYA");
        mahasiswa.setIPK(3.9);
        

        mahasiswa.viewData();
        
        Mahasiswa m1 = new Mahasiswa( 2,"2110010332", "ANTON TSURAYA", 3.9);
        m1.viewData();
        
        Mahasiswa mt = new MahasiswaTransfer();
        mt.setId(3);
        mt.setNPM("2110010332");
        mt.setNama("ANTON TSURAYA");
        mt.setIPK(3.9);
        mt.viewData();
        
        mt.inputKRS();
        
    }
    
}
