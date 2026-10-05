public class MainTugas1 {
    public static void main(String[] args) {
        BarangElektronik hp = new BarangElektronik("E01", "iPhone 13", "KA Argo Parahyangan", "IMEI12345");
        hp.info();
        hp.cekPerangkat();

        System.out.println("--------------------");

        DokumenPenting dompet = new DokumenPenting("D01", "KTP", "Stasiun Gambir", "3201000101");
        dompet.info();
        dompet.cocokkanIdentitas("Budi Santoso");
    }
}