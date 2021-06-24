public class jualkendaraan extends Kendaraan {
    private String merkKendaraan;
    private int hargaJual;
    private String hargaKredit;

    public void menjual() {
        System.out.println("Penjual menjual kendaraan");
    }

    public void hargakreditperbulan() {
        System.out.println("Penjual menjual dengan kredit");
    }

    public String getMerkKendaraan() {
        return merkKendaraan;
    }

    public void setMerkKendaraan(String merkKendaraan) {
        this.merkKendaraan = merkKendaraan;
    }

    public int getHargaJual() {
        return hargaJual;
    }

    public void setHargaJual(int hargaJual) {
        this.hargaJual = hargaJual;
    }

    public String getHargaKredit() {
        return hargaKredit;
    }

    public void setHargaKredit(String hargaKredit) {
        this.hargaKredit = hargaKredit;
    }

    @Override
    public void menjual() {
        super.menjual();
    }

    @Override
    public void merawat() {
        super.merawat();
    }
}