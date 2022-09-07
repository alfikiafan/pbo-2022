public class Mahasiswa {
    String nim, nama, alamat;
    char jenisKelamin;

    public Mahasiswa(String nim, String nama, char jenisKelamin, String alamat) {
        this.nim = nim;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
    }

    void cetakData() {
        System.out.println("Data Mahasiswa  :");
        System.out.println("NIM             : " + nim);
        System.out.println("Nama            : " + nama);
        System.out.println("Jenis Kelamin   : " + jenisKelamin);
        System.out.println("Alamat          : " + alamat);
    }

    // Buatlah constructor untuk menginisiasi nilai dari variabel
    // nim, nama, jenisKelamin, alamat
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("M0501001", "Patrick Star"
                , 'L', "Bikini Bottom");
        mhs.cetakData();
    }
}
