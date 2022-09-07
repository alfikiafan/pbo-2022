public class LatihanKonstanta {
    // public static final int KURS_DOLLAR = 15000; // error
    public static int KURS_DOLLAR = 15000;
    public static final double PI = 3.14;
    public static final String NAMA = "Squidward";
    public static void main(String[] args) {
        KURS_DOLLAR = 13500;
        System.out.println(KURS_DOLLAR);
        System.out.println(PI);
        System.out.println(NAMA);
    }
}

/* Apa yang salah dengan source code tersebut?
 * Jawab: KURS_DOLLAR yang merupakan konstanta (final) diubah oleh baris kode di bawahnya.
 * Solusi: Menghapus keyword "final" pada inisialisasi konstanta agar menjadi variabel.
 *
 * Apa maksud penggunaan keyword static sebelum keyword final pada deklarasi variabel tersebut?
 * Jawab: Perintah khusus yang memungkinkan sebuah properti atau method diakses langsung tanpa melalui objek,
 * akan tetapi cukup dengan hanya menulis nama classnya saja.
 */
