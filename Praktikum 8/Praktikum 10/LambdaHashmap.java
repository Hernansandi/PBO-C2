/* 
 * File : LambdaHashmap.java  (06/06/2023)
 * Penulis : Hernan Sandi Laksono (24060121130078) 
 * Deskripsi: Menggunakan lambda untuk menampilkan data mahasiswa
*/

import java.util.HashMap;

public class LambdaHashmap {
    public static void main(String[] args) {
        HashMap<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060121130078", "Hernan Sandi Laksono");
        mahasiswaMap.put("2406012119999", "Makmur");
        mahasiswaMap.put("2406012118888", "Cuyung");
        mahasiswaMap.put("2406012117777", "Pipop");

        // menggunakan lambda
        mahasiswaMap.forEach((nim, nama) -> System.out.println(nim + " : " + nama));
    }
}
