public class BarangElektronik extends BarangTemuan {
    private String imei;

    public BarangElektronik(String id, String nama, String lokasi, String imei) {
        super(id, nama, lokasi);
        this.imei = imei;
    }

    public void cekPerangkat() {
        System.out.println("Cek IMEI: " + imei);
    }
}