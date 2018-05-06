public class sepatuAksi {
public static void main(String[] args) {
        sepatu  dedi = new sepatu();
        dedi.merek = 200000;
        dedi.warna = 150000;
        
        dedi.cetakinfo();
        System.out.println("harga helm = "+dedi.hitungharga());
        dedi.cetakharga();
        
        sepatu yuda = new sepatu ();
        yuda.cetakinfo();
        
        sepatu tati = new sepatu(200000,100000);
        tati.cetakinfo();
    }
}
    
