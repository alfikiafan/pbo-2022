import java.util.Scanner;

public class DiskonMiniMarket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total pembelian: ");
        // tambahkan code untuk menyimpan nominal total pembelian
        long total_pembelian = sc.nextLong();
        // tambahkan code untuk mengimplementasikan ketentuan diskon yang ditetapkan
        if (total_pembelian >= 50000 && total_pembelian <= 75000)
            total_pembelian = (long) (0.95 * total_pembelian);
        else if (total_pembelian >= 75000 && total_pembelian <= 125000)
            total_pembelian = (long) (0.85 * total_pembelian);
        else total_pembelian = (long) (0.8 * total_pembelian);
        // tambahkan code untuk menampilkan nominal yang harus dibayar sesuai dengan ketentuan diskon yang diberikan
        System.out.println("Total pembelian setelah diskon: " + total_pembelian);
    }
}
