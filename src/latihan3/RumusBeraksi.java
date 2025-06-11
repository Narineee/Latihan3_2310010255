package latihan3;

public class RumusBeraksi {
    public static void main(String[] args) {
       Rumus nia = new Rumus();
       
       nia.sisi = 4;
       nia.hitungLuasPersegi();
       System.out.println("Hasil dari getHasil = " + nia.getHasil());
       
       nia.panjang = 7;
       nia.lebar = 5;
       nia.hitungLuasPersegiPanjang();
       System.out.println("Hasil dari getHasil = " + nia.getHasil());
   }
}
