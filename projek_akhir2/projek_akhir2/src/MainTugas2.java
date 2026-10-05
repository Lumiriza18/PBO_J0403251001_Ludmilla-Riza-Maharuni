public class MainTugas2 {
    public static void main(String[] args) {
        LayananNotifikasi wa = new NotifikasiWhatsApp("081234567890");
        wa.kirim("Barang temuan Anda telah siap diambil di Customer Service Stasiun.");
    }
}