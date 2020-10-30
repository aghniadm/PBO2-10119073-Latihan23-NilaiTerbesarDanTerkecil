package pbo2.pkg10119073.latihan23.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk menampilkan nilai
 * terbesar dan terkecil
 *
 */

public class PBO210119073Latihan23NilaiTerbesarDanTerkecil {

     public static int terbesar(int[] j){
        int max = j[0];
        for(int i = 1; i < j.length; i++){
            if (j[i] > max){
                max = j[i];
            }    
        }
        return max;
    }
    
     public static int terkecil(int[] j){
        int min = j[0];
        for(int i = 1; i < j.length; i++){
            if (j[i] < min){
                min = j[i];
            }    
        }
        return min;
    }
     
    public static void main(String[] args) {
        String nama;
        
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        System.out.print("Masukkan Nama Petugas : ");
        Scanner petugas = new Scanner(System.in);
        nama = petugas.next();
        
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        Scanner banyak = new Scanner(System.in);
        int j = banyak.nextInt();
        int [] nilai = new int[j];
        
        for (int i = 0; i < j; i++){
            System.out.print("Nilai Mahasiswa ke-"+(1+i)+": " );
            Scanner skor = new Scanner(System.in);
            nilai[i] = skor.nextInt();         
        }
        System.out.println("");
        System.out.println("=====Hasil Nilai Mahasiswa=====");
        
        for (int i = 0; i < j; i++){
            System.out.println("Nilai Mahasiswa ke-"+(1+i)+": " +nilai[i] );            
        }    
        System.out.println("");
        System.out.println("Nilai Terbesar adalah " +terbesar(nilai)) ;
        System.out.println("Nilai Terkecil adalah " +terkecil(nilai));
        System.out.println("");
        System.out.println("Petugas : " +nama);
    }
    
}
