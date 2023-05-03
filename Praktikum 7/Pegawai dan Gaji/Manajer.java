/*
 * File : Manajer.java  (03/05/2023)
 * Penulis : Hernan Sandi Laksono (24060121130078)
 * Deskripsi : Kelas Manajer yang merupakan turunan dari kelas Vehicle
 */

public class Manajer extends Pegawai {
    private int tunjangan = 700000;

    public Manajer(String nama) {
        setNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan: " + tunjangan);
    }
}

