/* SOAL NOMOR 1

public class ForLoopDemo {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 3};
        for (int i = 1; i < 6; i++) {
            System.out.println("elemen ke-" + i + " = " + arr[i]);
        }
    }
}

 * Error ArrayIndexOutOfBoundsException menunjukkan bahwa array telah diakses dengan indeks ilegal.
 * indeksnya lebih besar dari ukuran array. Jumlah elemen array hanya 5, sehingga indeks terakhir adalah 4.
 * Pada kondisi int i < 6 yang dituliskan di for loop, ada angka 5 yang memenuhi kondisi, di mana tidak ada
 * elemen array yang berindeks 5.
 * Selain itu, indeks array dimulai dari 1, padahal seharusnya array dimulai dari indeks ke-0. Akibatnya, ada
 * elemen yang terlewat.
 */

// SOAL NOMOR 2

public class ForLoopDemo {
    public static void main(String[] args) {
        int i = 0;
        int[] arr = {5, 1, 4, 2, 3};
        do {
            System.out.println("Elemen ke-" + i + " = " + arr[i]);
            i++;
        } while (i < 5);
    }
}
