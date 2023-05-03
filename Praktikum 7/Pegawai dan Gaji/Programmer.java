/*
 * File : Programmer.java  (03/05/2023)
 * Penulis : Hernan Sandi Laksono (24060121130078)
 * Deskripsi : Kelas Programmer yang merupakan turunan dari kelas Vehicle
 */

public class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer(String nama) {
        setNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus: "+bonus);
    }
}

