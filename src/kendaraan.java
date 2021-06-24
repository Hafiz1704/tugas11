import java.util.Date;

public class Kendaraan {
    private String kdKendaraan;
    private String namaKendaraan;
    private String jenisKendaraan;
    private String   warnaKendaraan;
    private Date   tanggalBeli;
    private int    hargaKendaraan;
    private int    noplat;
    private String tahunkendaraan;

    public void menjual (){
        System.out.println("Penjual menjual kendaraan");
    }
    public void merawat (){
        System.out.println("Penjual merawat kendaraan");
    }
    public void membeli (){
        System.out.println("Penjual membeli kendaraan");
    }
    public void memperpanjangpajak (){
        System.out.println("Penjual memperpanjang pajak kendaraan");
    }

    public Kendaraan() {
    }

    public Kendaraan(String kdKendaraan, String namaKendaraan, String jenisKendaraan) {
        this.kdKendaraan = kdKendaraan;
        this.namaKendaraan = namaKendaraan;
        this.jenisKendaraan = jenisKendaraan;
    }

    public Kendaraan(String kdKendaraan, String namaKendaraan, String jenisKendaraan, String warnaKendaraan, Date tanggalBeli, int hargaKendaraan, int noplat, String tahunkendaraan) {
        this.kdKendaraan = kdKendaraan;
        this.namaKendaraan = namaKendaraan;
        this.jenisKendaraan = jenisKendaraan;
        this.warnaKendaraan = warnaKendaraan;
        this.tanggalBeli = tanggalBeli;
        this.hargaKendaraan = hargaKendaraan;
        this.noplat = noplat;
        this.tahunkendaraan = tahunkendaraan;
    }

    public String getKdKendaraan() {
        return kdKendaraan;
    }

    public void setKdKendaraan(String kdKendaraan) {
        this.kdKendaraan = kdKendaraan;
    }

    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public void setNamaKendaraan(String namaKendaraan) {
        this.namaKendaraan = namaKendaraan;
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    public void setJenisKendaraan(String jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    public String getWarnaKendaraan() {
        return warnaKendaraan;
    }

    public void setWarnaKendaraan(String warnaKendaraan) {
        this.warnaKendaraan = warnaKendaraan;
    }

    public Date getTanggalBeli() {
        return tanggalBeli;
    }

    public int getHargaKendaraan() {
        return hargaKendaraan;
    }

    public void setHargaKendaraan(int hargaKendaraan) {
        this.hargaKendaraan = hargaKendaraan;
    }

    public int getNoplat() {
        return noplat;
    }

    public void setNoplat(int noplat) {
        this.noplat = noplat;
    }

    public String getTahunkendaraan() {
        return tahunkendaraan;
    }

    public void setTahunkendaraan(String tahunkendaraan) {
        this.tahunkendaraan = tahunkendaraan;
    }

    public void setTanggalBeli(Date tanggalBeli) {
        this.tanggalBeli = tanggalBeli;
    }

