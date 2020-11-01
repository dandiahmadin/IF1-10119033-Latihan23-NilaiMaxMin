/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119033.latihan23.nilaimaxmin;
import java.util.Scanner;
/**
 *
 * @author
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi menentukan nilai tertinggi dan terendah
 */
public class IF110119033Latihan23NilaiMaxMin {

    /**
     * @param args the command line arguments
     */
    
    static Scanner scanner = new Scanner(System.in);
    static String nama;
    static int banyakMhs, jumlahNilai, nilaiMhs[], max, min;
    
    static void inputData() {
        System.out.println("===Program Nilai Terbesar dan Terkecil Nilai Mahasiswa===");
        System.out.print("Masukan Nama Petugas : ");
        nama = scanner.next();
        System.out.print("Masukan Banyaknya Nilai Mahasiswa : ");
        banyakMhs = scanner.nextInt();
    }
    
    static void inputNilai() {
        nilaiMhs = new int[banyakMhs];
        for (int i=0; i < nilaiMhs.length ; i++) {
            System.out.print("Masukan Nilai Mahasiswa Ke-"+ (i+1) +" = ");
            nilaiMhs[i] = scanner.nextInt();
        }
        System.out.println();
    }
    
    static int nilaiMax(int paramNilai, int paramMax) {
        if (paramNilai > paramMax) {
            paramMax = paramNilai;
        }
        return paramMax;
    }
    
    static int nilaiMin(int paramNilai, int paramMin) {
        if (paramNilai < paramMin) {
            paramMin = paramNilai;
        }
        return paramMin;
    }
    
    static void tampilHasil() {
        System.out.println("======Hasil Nilai Mahasiswa======");
        max = -999;
        min = 999;
        for (int i = 0; i < nilaiMhs.length; i++) {
            max = nilaiMax(nilaiMhs[i], max);
            min = nilaiMin(nilaiMhs[i], min);
            System.out.println("Nilai Mahasiswa Ke-"+ (i+1) +" = "+nilaiMhs[i]);
        }
        System.out.println();
        System.out.println("Nilai Terbesar adalah " + max);
        System.out.println("Nilai Terkecil adalah " + min);
        System.out.println("\nPetugas : ".concat(nama));
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        inputData();
        inputNilai();
        tampilHasil();
    }
    
}
