/* 
 * File : BangunDatarGeneric.java  (17/05/2023)
 * Penulis : Hernan Sandi Laksono (24060121130078) 
 * Deskripsi :Kelas konstruksi generic untuk BangunDatar 
*/

public class BangunDatarGeneric<T1 extends BangunDatar>{
  private T1 bangunDatar;

  public void set(T1 tipeBangunDatar){
    bangunDatar = tipeBangunDatar;
  }

  public T1 get(){
    return bangunDatar;
  }

  public double hitungKeliling(){
    return bangunDatar.hitungKeliling();
  }

  //Soal: Gantilah ‘T’ (dan segala T) pada BangunDatarGeneric.java 
  //diganti dengan karakter yang lain seperti, T1,T2,T1234. 
  //Simpulkan apa yang anda lakukan
  
  //Jawaban:
  //Mengganti T pada BangunDatarGeneric.java menjadi T1, T2, T1234, 
  //atau karakter apa pun yang valid untuk digunakan sebagai nama variabel 
  //di Java tidak akan mempengaruhi fungsionalitas dari kelas tersebut. 
  //Nama T pada deklarasi kelas adalah hanya sebuah nama variabel untuk 
  //parameter tipe generik, dan bisa diganti dengan nama variabel lain 
  //yang valid.
}

