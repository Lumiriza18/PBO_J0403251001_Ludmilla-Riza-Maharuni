public class BarangTemuan {
    protected String id;
    protected String nama;
    protected String lokasi;

    public BarangTemuan(String id, String nama, String lokasi) {
        this.id = id;
        this.nama = nama;
        this.lokasi = lokasi;
    }

    public void info() {
        System.out.println("[" + id + "] " + nama + " | Lokasi: " + lokasi);
    }
}