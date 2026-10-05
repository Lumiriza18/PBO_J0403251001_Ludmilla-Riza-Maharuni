public class MainTugas3 {
    public static void main(String[] args) {
        KlaimPenumpang klaim = new KlaimPenumpang("TKT-999", "3201000101");

        // Coba validasi data
        if (klaim.validasi("TKT-999", "3201000101")) {
            klaim.serahTerima("Petugas Dimas");
        }
    }
}