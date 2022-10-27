package belajar;

import java.util.Scanner;

public class belajar_input {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan nama anda : ");
        String nama = input.nextLine();
        System.out.println("nama : " + nama);
        
        System.out.println("masukkan tempat tinggl anda : ");
        String tempat_tinggal = input.nextLine();
        System.out.println("Tempat Tinggal : " + tempat_tinggal);
        
        System.out.println("Masukkan umur anda : ");
        int umur = input.nextInt();
        System.out.println("umur anda adalah : " + umur + " tahun");
        
        System.out.println("masukkan tinggi badan : ");
        float tinggi_badan = input.nextFloat();
        System.out.println("Tinggi badan : " + tinggi_badan + "cm");
        
        System.out.println("Masukkan berat badan anda : ");
        byte berat_badan = input.nextByte();
        System.out.println("berat badan " + berat_badan + "kg");
        
        System.out.println("Masukkan tahun lahir : ");
        short tahun_lahir = input.nextShort();
        System.out.println("Tahun lahir " + tahun_lahir );
        
        System.out.println("Masukkan anak ke : ");
        long anak_ke = input.nextLong();
        System.out.println("anak ke " + anak_ke + "dari 6 bersaudara");


        
        
        
        
       
        
       
    }
    
}
