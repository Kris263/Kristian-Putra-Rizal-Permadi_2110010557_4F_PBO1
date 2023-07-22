/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import java.util.Scanner;
public class Tes {
    private String namaBuku;
    private String penulis;

    public void setNamaBuku(String namaBuku) {
        this.namaBuku = namaBuku;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public static void main(String[] args) {
        Scanner dataPinjam = new Scanner(System.in);
        Tes buku = new Tes();
        String jumlahBuku;

        // Perulangan untuk memastikan jumlahBuku memiliki nilai yang valid
        do {
            System.out.print("Silahkan Masukkan Jumlah Buku = ");
            jumlahBuku = dataPinjam.nextLine();
        } while (jumlahBuku.isEmpty());

        int jumlah = Integer.parseInt(jumlahBuku);

        // Input judul buku dan nama penulis sebanyak jumlah buku yang diminta
        for (int i = 1; i <= jumlah; i++) {
            System.out.print("Silahkan Masukkan Judul Buku ke-" + i + " = ");
            String namaBuku = dataPinjam.nextLine();
            buku.setNamaBuku(namaBuku);

            System.out.print("Silahkan Masukkan Nama Penulis ke-" + i + " = ");
            String penulis = dataPinjam.nextLine();
            buku.setPenulis(penulis);

            System.out.println("Buku ke-" + i + " dengan judul " + buku.namaBuku + " ditulis oleh " + buku.penulis);
        }
    }
}

