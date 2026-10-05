public interface VerifikatorKlaim {
    boolean validasi(String kodeBooking, String nik);
    void serahTerima(String petugas);
}