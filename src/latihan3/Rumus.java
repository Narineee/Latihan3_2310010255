package latihan3;

public class Rumus {
    //Nama : Hasnia
    //NPM : 2310010255
    //Kelas : 4D REGULER BJB
    int sisi, panjang, lebar, hasil;
    
    public Rumus() {
        sisi = 0;
        panjang = 0;
        lebar = 0;
        hasil = 0;
    }
    
    public void hitungLuasPersegi() {
        hasil = sisi * sisi;
        System.out.println("Luas Persegi = " + hasil);
    }
    public void hitungLuasPersegiPanjang() {
        hasil = panjang * lebar;
        System.out.println("Luas Persegi Panjang = " + hasil);
    }
    public int getHasil() {
        return hasil;
    }
}
