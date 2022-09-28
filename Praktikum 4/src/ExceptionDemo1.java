import java.util.Scanner;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ketik bilangan pertama: ");
        int bil1 = sc.nextInt();
        System.out.print("Ketik bilangan kedua: ");
        int bil2 = sc.nextInt();
        double hasil = (double) bil1 / (double) bil2;
        System.out.println(bil1 + " / " + bil2 + " = " + hasil);
    }
}

/*
TODO:
a. Ketik huruf misalnya f untuk input bilangan pertama kemudian tekan ENTER
    - Apakah program masih dapat dijalankan setelah user memasukkan f sebagai input untuk
      bilangan pertama?
      Jawab:
      Tidak, program menampilkan output kesalahan, lalu keluar.

    - Tulis output yang muncul!
      Jawab:
      Ketik bilangan pertama: f
      Exception in thread "main" java.util.InputMismatchException
	      at java.base/java.util.Scanner.throwFor(Scanner.java:939)
	      at java.base/java.util.Scanner.next(Scanner.java:1594)
	      at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
	      at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
	      at ExceptionDemo1.main(ExceptionDemo1.java:7)

    - Jelaskan maksud dari output tersebut!
      Jawab:
      Terjadi input mismatch karena input yang dimasukkan tidak sesuai dengan tipe data yang diinisialisasikan.

b. Pilih salah satu angka sebagai bilangan pertama misal 5, kemudian ketik angka 0 untuk input
   bilangan kedua. Jelaskan output yang muncul!
   - Tulis output yang muncul!
     Jawab:
     Ketik bilangan pertama: 5
     Ketik bilangan kedua: 0
     5 / 0 = Infinity

   - Jelaskan maksud dari output tersebut!
     Karena tipe data dari variabel "hasil" adalah double, sehingga dimungkinkan pembagian oleh 0. Pembagian 0 pada
     tipe data tersebut akan menghasilkan Infinity. Alasan dasar di balik itu adalah adanya implementasi pada
     algoritma aritmetika floating point yang menentukan nilai khusus seperti "bukan angka" ATAU "tak terhingga"
     untuk "kasus munculnya pembagian dengan nol" sesuai standar IEEE 754. Namun, apabila tipe data merupakan hasil
     merupakan integer, maka akan terjadi error division by zero.
*/