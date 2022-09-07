public class LatihanLong {
    public static void main(String[] args) {
        // long p = 2147483648; // error
        long p = 2147483648L;
        System.out.println(p);
    }
}

/*
 * Apa maksud dari pesan error yang muncul?
 * Jawab: Nilai integer terlalu besar (melebihi batas)
 *
 * Bagaimana memperbaiki source code tersebut?
 * Jawab: dengan menambahkan tanda L setelah digit terakhir tanpa spasi
 */
