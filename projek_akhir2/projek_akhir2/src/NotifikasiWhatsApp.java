public class NotifikasiWhatsApp extends LayananNotifikasi {
    public NotifikasiWhatsApp(String nomorKontak) {
        super(nomorKontak);
    }

    @Override
    public void kirim(String pesan) {
        catatLog();
        System.out.println("Kirim WhatsApp ke " + nomorKontak + ": " + pesan);
    }
}