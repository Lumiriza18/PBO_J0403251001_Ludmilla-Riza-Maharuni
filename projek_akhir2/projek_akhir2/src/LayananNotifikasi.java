public abstract class LayananNotifikasi {
    protected String nomorKontak;

    public LayananNotifikasi(String nomorKontak) {
        this.nomorKontak = nomorKontak;
    }

    // Concrete method untuk log umum
    public void catatLog() {
        System.out.println("Log: Notifikasi disiapkan untuk " + nomorKontak);
    }

    // Abstract method wajib dioverride
    public abstract void kirim(String pesan);
}