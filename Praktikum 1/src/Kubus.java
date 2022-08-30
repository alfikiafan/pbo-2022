public class Kubus {
    int sisiKubus = 5;
    public Double hitungVolume() {
        double volume = 0.0;
        // tambahkan code untuk menghitung volume kubus
        volume = Math.pow((double) this.sisiKubus, 3);
        return volume;
    }
    public int hitungLuasPermukaan() {
        int luasPermukaan = 0;
        // tambahkan code untuk menghitung luas permukaan kubus
        luasPermukaan = 6 * this.sisiKubus * this.sisiKubus;
        return luasPermukaan;
    }
    /*
     * buat main method
     * buat objek dari class Kubus
     * tampilkan hasil perhitungan volume kubus
     * tampilkan hasil perhitungan luas permukaan kubus
     */
    public static void main(String[] args) {
        Kubus kubus = new Kubus();
        kubus.sisiKubus = 10;
        System.out.println("Sisi kubus          : " + kubus.sisiKubus);
        System.out.println("Volume Kubus        : " + kubus.hitungVolume());
        System.out.println("Luas Permukaan Kubus: " + kubus.hitungLuasPermukaan());
    }
}