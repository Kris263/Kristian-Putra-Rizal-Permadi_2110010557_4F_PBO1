package perpustakaan;

//I/O sederhana
import java.util.Scanner;
import java.time.LocalDate;

//Inheritance
public class Menu extends Perpus {
    
    //array
    private int[] pilih;
     
    public void pemilihan () {
        pilih = new int [0];
        Scanner input = new Scanner(System.in);
        System.out.println("Silahkan Pilih Menu");
        System.out.println("1. Pinjam Buku");
        System.out.println("2. Kembalikan Buku");
        System.out.print("SIlahkan Pilih = ");
        int pilih = input.nextInt();
        
        //Seleksi
        if (pilih == 1) {
            pinjamBuku();
        } else if (pilih == 2) {
            kembaliBuku();
        } else {
            System.out.println("Tidak ada dalam Menu!");
        }
    }
    
    public void pinjamBuku() {
        Scanner dataPinjam = new Scanner(System.in);
        Scanner jumlah = new Scanner(System.in);
        LocalDate tanggal = LocalDate.now();
        
        try {
            System.out.println("Selamat Data di Menu Pinjam Buku");
            System.out.print("Masukkan Jumlah Buku yang dipinjam = ");
            int jumlahBuku = jumlah.nextInt();
     
            //Perulangan
            for (int i=1; i<=jumlahBuku; i++) {
            System.out.print("Silahkan Masukkan Judul Buku yang ke - " +i+ " = ");
            String namaBuku = dataPinjam.nextLine();
            setNamaBuku(namaBuku);
        
            System.out.print("Silahkan Masukkan Nama Penulis yang ke - " +i+ " = " );
            String penulis = dataPinjam.nextLine();
            setPenulis(penulis);
            System.out.println("Tanggal Peminjaman = " +tanggal);
        
            System.out.println("<============================================>");
        
            System.out.println("Nama Buku ke - "+ i + " yang di Pinjam = " + getNamaBuku() +"\nYang Ditulis Oleh = " +getPenulis());
        
            System.out.println("<============================================>");
            }
       } catch (java.util.InputMismatchException e) {
            System.out.println("Salah Dalam memasukkan format jumlah buku");
       } catch (Exception e) {
            System.out.println("Terjadi Kesalahan Umum!" +e.getMessage());
       }
        System.out.println("Terima Kasih Sudah Mampir dan Membaca Ke Perpustakaan Umum Kota");
    }
    
    public void kembaliBuku() {
        Scanner dataKembali = new Scanner(System.in);
        
        System.out.print("Masukkan Nama Buku yang Di kembalikan = ");
        String namaBuku = dataKembali.nextLine();
        setNamaBuku(namaBuku);
        
        System.out.println("Data Buku " +getNamaBuku()+ "Telah Disimpan Silahkan Kembalikan Buku \npada Rak Buku atau Letakan ke meja Administrasi");
        
    }
}
