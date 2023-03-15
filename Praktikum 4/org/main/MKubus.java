/*
 * File : MKubus.java  (08/03/2023)
 * Penulis : Hernan Sandi Laksono (24060121130078)
 * Deskripsi : driver class untuk Kubus
 */

package org.main;

import org.bangundatar.*;
import org.bangunruang.*;

public class MKubus{
  public static void main(String[] args){
    BujurSangkar bujurSangkar = new BujurSangkar(4);
    Kubus kubus = new Kubus(bujurSangkar);
    System.out.println("Luas Kubus : "+kubus.hitungLuasAlas());
    System.out.println("Volume Kubus : "+kubus.hitungVolume());
  }
}