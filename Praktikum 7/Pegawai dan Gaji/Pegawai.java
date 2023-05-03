/*
 * File : Pegawai.java  (03/05/2023)
 * Penulis : Hernan Sandi Laksono (24060121130078)
 * Deskripsi : SuperClass dari kelas Programmer dan Manajer
 */

public class Pegawai {
    String nama;
    int gajiPokok = 5000000;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama : "+nama + ", Gaji Pokok : " + gajiPokok);
    }
}