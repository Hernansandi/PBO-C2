/*
 * File : Vehicle.java  (03/05/2023)
 * Penulis : Hernan Sandi Laksono (24060121130078)
 * Deskripsi : SuperClass dari kelas Car dan Bus
 */

public class Vehicle{
  void calRent(int distance, float price){
    float fare = distance * price;
    System.out.println("vehicle price = "+fare);
  }
}