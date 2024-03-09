public class BukuNonFiksi extends Buku{
    private String JenisNonFiksi;

    // Konstruktor
    public BukuNonFiksi(String judul, String penulis, int tahunTerbit, String JenisNonFiksi) {
        super(judul, penulis, tahunTerbit);
        this.JenisNonFiksi = JenisNonFiksi;
    }

    // Method override tampilkanInfo
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis NonFiksi: " + JenisNonFiksi);
    }
}