/* 
 * File : BangunDatarGenericTest.java  (17/05/2023)
 * Penulis : Hernan Sandi Laksono (24060121130078) 
 * Deskripsi : main class untuk generic bangun datar 
*/

public class BangunDatarGenericTest{
  public static void main(String[] args){
    Lingkaran l = new Lingkaran(2);
    BangunDatarGeneric<Lingkaran> bdgL = new BangunDatarGeneric<Lingkaran>();
    bdgL.set(l);
    System.out.println("keliling lingkaran : "+bdgL.hitungKeliling());
    System.out.println("tipe generic : "+bdgL.get().getClass().getName());

    Segitiga s = new Segitiga(5,10,12);
    BangunDatarGeneric<Segitiga> bdgS = new BangunDatarGeneric<Segitiga>();
    bdgS.set(s);
    System.out.println("keliling : "+bdgS.hitungKeliling());
    System.out.println("tipe generic : "+bdgS.get().getClass().getName());
  }
}