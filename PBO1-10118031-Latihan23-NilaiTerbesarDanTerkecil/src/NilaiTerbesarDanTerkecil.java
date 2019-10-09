
import java.util.Scanner;

/**
 *
 * @author Vendetta 
 * NAMA              : Rizki Aria Putra 
 * KELAS             : PBO1 
 * NIM               : 10118031
 * Deskripsi Program : Program ini berisi program untuk menentukan nilai terkecil dan terbesar
 */

public class NilaiTerbesarDanTerkecil {

    public static void main(String[] args) {
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        System.out.print("Masukkan Nama Petugas : ");
        Scanner scanner = new Scanner(System.in);
        String nama = scanner.next();
        System.out.print("Masukan Banyak Nilai Mahasiswa : ");
        int banyak = scanner.nextInt();
        int[] nilai = new int[banyak];
        System.out.print("Masukan Nilai Mahasiswa ke-" + 1 + " = ");
        nilai[0] = scanner.nextInt();
        int nilaiterbesar = nilai[0];
        int nilaiterkecil = nilai[0];
        for (int i = 1; i < banyak; i++) {
            System.out.print("Masukan Nilai Mahasiswa ke-" + (i + 1) + " = ");
            nilai[i] = scanner.nextInt();
            if (nilai[i] > nilaiterbesar) {
                nilaiterbesar = nilai[i];
            }
            if (nilai[i] < nilaiterkecil) {
                nilaiterkecil = nilai[i];
            }
        }

        System.out.println("Nilai terbesar adalah " + nilaiterbesar);
        System.out.println("Nilai terkecil adalah " + nilaiterkecil);
        System.out.println("Petugas : " + nama);

    }

}
