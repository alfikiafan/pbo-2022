import java.util.Scanner;

public class Tugas_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai Anda: ");
        int nilai = input.nextInt();
        if (nilai >= 85) {
            System.out.println("Nilai Anda adalah A");
            input.close();
        } else if (nilai >= 80) {
            System.out.println("Nilai Anda adalah A-");
            input.close();
        } else if (nilai >= 75) {
            System.out.println("Nilai Anda adalah B+");
            input.close();
        } else if (nilai >= 70) {
            System.out.println("Nilai Anda adalah B");
            input.close();
        } else if (nilai >= 65) {
            System.out.println("Nilai Anda adalah C+");
            input.close();
        } else if (nilai >= 60) {
            System.out.println("Nilai Anda adalah C");
            input.close();
        } else if (nilai >= 55) {
            System.out.println("Nilai Anda adalah D");
            input.close();
        } else {
            System.out.println("Nilai Anda adalah E");
            input.close();
        }
    }
}
