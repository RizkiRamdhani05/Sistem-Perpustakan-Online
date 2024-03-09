import java.util.ArrayList;

public class DaftarBuku {
    ArrayList<Buku> daftarBuku;

    // Konstruktor
    public DaftarBuku() {
        daftarBuku = new ArrayList<>();
    }

    // Method untuk menambahkan buku
    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    // Method untuk menghapus buku
    public void hapusBuku(Buku buku) {
        daftarBuku.remove(buku);
    }

    // Method untuk mencari buku berdasarkan judul
    public Buku cariBuku(String judul) {
        for (Buku buku : daftarBuku) {
            if (buku.getJudul().equals(judul)) {
                return buku;
            }
        }
        return null;
    }
}
