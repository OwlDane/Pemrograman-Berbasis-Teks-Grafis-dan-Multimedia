/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab11soal1;

/**
 *
 * @author HP
 */
public class Bab11Soal1 {

    public static void main(String[] args) {
       Karyawan karyawan1 = new Karyawan();
        karyawan1.setKaryawan(0001, "Zidane", "A", "CIO", 15000000);
        karyawan1.getKaryawan();
        
        System.out.println("----------------------------");
        
        Karyawan karyawan2 = new Karyawan();
        karyawan2.setKaryawan(0002, "Maul", "B", "Wili Salim Follower", 9000000);
        karyawan2.getKaryawan();
        
         System.out.println("----------------------------");
        
        Karyawan karyawan3 = new Karyawan();
        karyawan2.setKaryawan(0002, "Racip", "B", "Food Vlogger", 8000000);
        karyawan2.getKaryawan();
    }
}
