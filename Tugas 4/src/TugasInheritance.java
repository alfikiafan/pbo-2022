/* Nama  : Alfiki Diastama Afan Firdaus
 * NIM   : M0521009
 * Kelas : A
 */

public class TugasInheritance {
    public static void main(String []args) {
        KaryawanTetap karyawanTetap = new KaryawanTetap("A01","Diana","Banjarsari",3500000,1000000,7500000);
        KaryawanKontrak karyawanKontrak = new KaryawanKontrak("B01", "Ray", "Laweyan", 110000, 18);
        System.out.println("Gaji karyawan tetap bernama " + karyawanTetap.getNama()+" adalah : " + karyawanTetap.hitungGaji());
        System.out.println("Gaji karyawan kontrak bernama" + karyawanKontrak.getNama()+" adalah : " + karyawanKontrak.hitungGaji());
    }
}
@SuppressWarnings("unused")
class Karyawan {
    protected String id,nama,alamat;
    protected Integer gaji;
    public Karyawan(String id,String nama,String alamat,Integer gaji){
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.gaji = gaji;
    }
    public String getId() {
        return this.id;
    }
    public String getNama() {
        return this.nama;
    }
    public String getAlamat() {
        return this.alamat;
    }
    public void setGaji(Integer gaji) {
        this.gaji = gaji;
    }
    public Integer getGaji(Integer gaji) {
        return this.gaji;
    }
    public Integer hitungGaji() {
        return this.gaji;
    }
}
@SuppressWarnings("unused")
class KaryawanTetap extends Karyawan {
    private Integer gajiBulanan, uangMakan, tunjangan;

    public KaryawanTetap(String id, String nama, String alamat, Integer gajiBulanan, Integer uangMakan, Integer tunjangan) {
        super(id, nama, alamat, 0);
        this.gajiBulanan = gajiBulanan;
        this.uangMakan = uangMakan;
        this.tunjangan = tunjangan;
        this.hitungGaji();
    }
    public void setgajiBulanan(Integer gajiBulanan){
        this.gajiBulanan = gajiBulanan;
        this.hitungGaji();
    }
    public Integer getgajiBulanan(){
        return this.gajiBulanan;
    }
    public void setUangMakan(Integer uangMakan){
        this.uangMakan = uangMakan;
        this.hitungGaji();
    }
    public Integer getUangMakan(){
        return this.uangMakan;
    }
    public void setTunjangan(Integer tunjangan){
        this.tunjangan = tunjangan;
        this.hitungGaji();
    }
    public Integer getTunjangan(){
        return this.tunjangan;
    }
    public Integer hitungGaji(){
        gaji = gajiBulanan + uangMakan + tunjangan;
        return gaji;
    }
}
@SuppressWarnings("unused")
class KaryawanKontrak extends Karyawan{
    private Integer gajiHarian, jumlahHariMasuk;
    public KaryawanKontrak(String id, String nama, String alamat, Integer gajiHarian, Integer jumlahHariMasuk) {
        super(id, nama, alamat, 0);
        this.gajiHarian = gajiHarian;
        this.jumlahHariMasuk = jumlahHariMasuk;
        hitungGaji();
    }
    public void setGajiHarian(Integer gajiHarian) {
        this.gajiHarian = gajiHarian;
        hitungGaji();
    }
    public Integer getGajiHarian() {
        return this.gajiHarian;
    }
    public void setJumlahHariMasuk(Integer jumlahHariMasuk) {
        this.jumlahHariMasuk = jumlahHariMasuk;
        hitungGaji();
    }
    public Integer getJumlahHariMasuk() {
        return this.jumlahHariMasuk;
    }
    public Integer hitungGaji() {
        gaji = gajiHarian * jumlahHariMasuk;
        return gaji;
    }
}