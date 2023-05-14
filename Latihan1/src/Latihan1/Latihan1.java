package Latihan1;

import Model2.Pulpen;

public class Latihan1 {


    public static void main(String[] args) {
        Pulpen pulpen = new Pulpen ();
        
        pulpen.setNama("ANTON TSURAYA");
        pulpen.setBerat("10 Kg");
        pulpen.setPanjang(10);
        pulpen.setHarga(5.000);
        
        pulpen.viewData();
            
    }
    
}
