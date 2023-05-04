/*
 * File : Bus.java  (03/05/2023)
 * Penulis : Hernan Sandi Laksono (24060121130078)
 * Deskripsi : Kelas Bus yang merupakan turunan dari kelas Vehicle
 */

public class Bus extends Vehicle{
  void calRent(int jarak, float harga){
    float fare = jarak * harga;
    fare = fare - 100.00f;
    System.out.println("harga sewa Bus = "+fare);
  }
}
