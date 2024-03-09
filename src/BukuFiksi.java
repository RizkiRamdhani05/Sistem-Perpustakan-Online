public class BukuFiksi extends Buku{
    private String jenisFiksi;

    // Konstruktor
    public BukuFiksi(String judul, String penulis, int tahunTerbit, String jenisFiksi) {
        super(judul, penulis, tahunTerbit);
        this.jenisFiksi = jenisFiksi;
    }

    // Method override tampilkanInfo
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Fiksi: " + jenisFiksi);
    }
}