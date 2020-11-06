/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119028.latihan37.rata.ratanilai.oo;

/**
 *
 * @author
 * NAMA     : Rizal Sihombing
 * KELAS    : IF1
 * NIM      : 10119028
 * Deskripsi Program : Program ini berisi program untuk menampilkan rata-rata
 *                     nilai mahasiswa dengan konsep OOP
 */
public class IF110119028Latihan37RataRataNilaiOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        RataRataNilaiMahasiswa nilaiMhs = new RataRataNilaiMahasiswa();
        double ratarata = nilaiMhs.hitungRataRata();
        System.out.println("\nMaka, Rata-rata Nilainya adalah: "+ratarata);
        System.out.println("Developed by : Maulana Imam Malik");
    }
    
}
