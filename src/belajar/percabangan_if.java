package belajar;

import java.util.Scanner;

public class percabangan_if {
    public static void main(String[] args) {
        int belanja = 0;
        // membuat variable belanja dan scanner
        Scanner barang = new Scanner (System.in);
        // mengambil input
        System.out.println("Total Belanja : 20Rp ");
        belanja = barang.nextInt();
        // cek apakah dia belanja di atas 10000
        if (belanja > 10000){
            System.out.println("selamat..! anda mendapatkan hadiah..");
        }
        
        System.out.println("apa sih yang susah!!"); 
        
    }
    
}
