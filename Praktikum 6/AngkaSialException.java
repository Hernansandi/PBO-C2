/*
 * File : AngkaSialException.java  (30/03/2023)
 * Penulis : Hernan Sandi Laksono (24060121130078)
* Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13!
*/

public class AngkaSialException extends Exception{
	public AngkaSialException(){
		super("jangan memasukkan angka 13 karena angka sial!!!");
	}
}