public class DokumenPenting extends BarangTemuan {
    private String nomorIdentitas;

    public DokumenPenting(String id, String nama, String lokasi, String nomorIdentitas) {
        super(id, nama, lokasi);
        this.nomorIdentitas = nomorIdentitas;
    }

    public void cocokkanIdentitas(String namaPemilik) {
        System.out.println("Mencocokkan " + namaPemilik + " dengan No. Dokumen: " + nomorIdentitas);
    }
}