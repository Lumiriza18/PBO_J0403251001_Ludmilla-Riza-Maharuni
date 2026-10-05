public class KlaimPenumpang implements VerifikatorKlaim {
    private String kodeTiket;
    private String nikKTP;
    private boolean terverifikasi;

    public KlaimPenumpang(String kodeTiket, String nikKTP) {
        this.kodeTiket = kodeTiket;
        this.nikKTP = nikKTP;
        this.terverifikasi = false;
    }

    @Override
    public boolean validasi(String kodeBooking, String nik) {
        terverifikasi = this.kodeTiket.equalsIgnoreCase(kodeBooking) && this.nikKTP.equals(nik);
        System.out.println(terverifikasi ? "Verifikasi Tiket & NIK Cocok!" : "Verifikasi Gagal: Data tidak cocok.");
        return terverifikasi;
    }

    @Override
    public void serahTerima(String petugas) {
        if (terverifikasi) {
            System.out.println("Serah terima barang berhasil diproses oleh Petugas: " + petugas);
        } else {
            System.out.println("Gagal: Barang belum bisa diserahkan karena belum lolos verifikasi.");
        }
    }
}