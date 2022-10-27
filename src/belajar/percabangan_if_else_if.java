package belajar;

import java.util.Scanner;

public class percabangan_if_else_if {
    public static void main(String[] args) {
        // membuat variabel dan scanner
        int jumlah;
        String nilai;
        Scanner scan = new Scanner(System.in);

        // mengambil input
        System.out.print("Inputkan nilai: ");
        jumlah = scan.nextInt();

        // higung gradenya
        if ( jumlah >= 90 ) {
            nilai = "A";
        } else if ( jumlah >= 80 ){
            nilai = "B+";
        } else if ( jumlah >= 70 ){
            nilai = "B";
        } else if ( jumlah >= 60 ){
            nilai = "C+";
        } else if ( jumlah >= 50 ){
            nilai = "C";
        } else if ( jumlah >= 40 ){
            nilai = "D";
        } else {
            nilai = "E";
        }

        // cetak hasilnya
        System.out.println("nilai: " + nilai);
    }
    
}
