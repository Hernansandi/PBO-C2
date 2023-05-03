/*
 * File : Sewa.java  (03/05/2023)
 * Penulis : Hernan Sandi Laksono (24060121130078)
 * Deskripsi : Kelas yang berisi program utama Sewa
 */

public class Sewa{
  public static void main(String[] args){
    Vehicle kendaraan = new Vehicle();
    Vehicle mobil = new Car();
    Vehicle bis = new Bus();
    kendaraan.calRent(50, 1000);
    mobil.calRent(50, 1000);
    bis.calRent(50, 1000);
  }
}