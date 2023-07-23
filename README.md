# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi Pencatatan Buku yang di Pinjam dan di Kembalikan pada perpustakaan kota menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama Buku dan Penulis dari Buku tersebut, dan memberikan output berupa informasi Bahwa Buku tersebut sudah di catat saat melakukan peminjaman atau pengembalian buku.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Perpus`, `Menu`, dan `Informasi` adalah contoh dari class.

```bash
public class Perpus {
    ...
}

public class Menu extends Perpus {
    ...
}

public class Informasi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `Menu kris = new Menu();` adalah contoh pembuatan object.

```bash
Menu kris = new Menu();
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `namaBuku` dan `penulis` adalah contoh atribut.

```bash
String namaBuku, penulis;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Perpus`.

```bash
public Perpus (String namaBuku, String penulis) {
        this.namaBuku = namaBuku;
        this.penulis = penulis;
}

public Perpus () {
        
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNamaBuku` dan `setPenulis` adalah contoh method mutator.

```bash
public void setNamaBuku(String namaBuku) {
        this.namaBuku = namaBuku;
}

public void setPenulis(String penulis) {
        this.penulis = penulis;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNamaBuku`, `getPenulis` adalah contoh method accessor.

```bash
public String getNamaBuku() {
        return namaBuku;
}

public String getPenulis() {
        return penulis;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `namaBuku` dan `penulis` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String namaBuku, penulis;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `Menu` mewarisi `Perpus` dengan sintaks `extends`.

```bash
public class Menu extends Perpus {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `Perpus (String namaBuku, String penulis)` di `Perpus` merupakan overloading method `Perpus ()` .

```bash
public Perpus (String namaBuku, String penulis) {
        this.namaBuku = namaBuku;
        this.penulis = penulis;
}

    
//polymorphism(overloading)
public Perpus () {
        
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else-if` dalam method `pemilihan()`.

```bash
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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i=1; i<=jumlahBuku; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
//Pada Method pinjamBuku()
Scanner dataPinjam = new Scanner(System.in);
Scanner jumlah = new Scanner(System.in);
LocalDate tanggal = LocalDate.now();

System.out.print("Masukkan Jumlah Buku yang dipinjam = ");
int jumlahBuku = jumlah.nextInt();

System.out.print("Silahkan Masukkan Judul Buku yang ke - " +i+ " = ");
String namaBuku = dataPinjam.nextLine();

System.out.print("Silahkan Masukkan Nama Penulis yang ke - " +i+ " = " );
String penulis = dataPinjam.nextLine();

System.out.println("Tanggal Peminjaman = " +tanggal);

//Pada Method kembaliBuku()
Scanner dataKembali = new Scanner(System.in);

System.out.print("Masukkan Nama Buku yang Di kembalikan = ");
String namaBuku = dataKembali.nextLine();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `int[] pilih = new int [5];;` adalah contoh penggunaan array.

```bash
private int[] pilih;

//Pada Method pinjamBuku()
pilih = new int [5];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (java.util.InputMismatchException e) {
    System.out.println("Salah Dalam memasukkan format jumlah buku");
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Kristian Putra Rizal Permadi
NPM: 2110010557
