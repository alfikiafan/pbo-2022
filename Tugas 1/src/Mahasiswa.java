import java.util.Scanner;
class Mahasiswa {
    public String NIM, nama, jenis_kelamin, alamat;
    public void isiData(String NIM, String nama, String jenis_kelamin, String alamat) {
        this.NIM = NIM;
        this.nama = nama;
        this.jenis_kelamin = jenis_kelamin;
        this.alamat = alamat;
    }
    public void printData() {
        System.out.println(
                "\nData yang Anda masukkan:\n" +
                        "NIM           : " + this.NIM + "\n" +
                        "Nama          : " + this.nama + "\n" +
                        "Jenis Kelamin : " + this.jenis_kelamin + "\n" +
                        "Alamat        : " + this.alamat + "\n"
        );
    }

}
class Driver {
    public static void main(String[] args) {
        Mahasiswa mahasiswa = new Mahasiswa();
        Scanner input = new Scanner(System.in);
        System.out.println("\nINPUT DATA MAHASISWA\n");
        System.out.print("Masukkan NIM Anda: ");
        String NIM = input.nextLine();
        System.out.print("Masukkan nama Anda: ");
        String nama = input.nextLine();
        System.out.print("Masukkan jenis kelamin Anda: ");
        String jenis_kelamin = input.nextLine();
        System.out.print("Masukkan alamat Anda: ");
        String alamat = input.nextLine();
        mahasiswa.isiData(NIM, nama, jenis_kelamin, alamat);
        mahasiswa.printData();
    }
}