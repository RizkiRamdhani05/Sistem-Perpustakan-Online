import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        DaftarBuku daftarBuku = new DaftarBuku(); // Membuat objek daftarBuku
        Scanner scanner = new Scanner(System.in); // Membuat objek scanner untuk input
    
        int pilihan;
        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Hapus Buku");
            System.out.println("3. Cari Buku");
            System.out.println("4. Lihat Daftar Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline dari buffer
    
            switch (pilihan) {
                case 1:
                    tambahBuku(daftarBuku, scanner);
                    break;
                case 2:
                    hapusBuku(daftarBuku, scanner);
                    break;
                case 3:
                    cariBuku(daftarBuku, scanner);
                    break;
                case 4:
                    lihatDaftarBuku(daftarBuku);
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    
        scanner.close(); // Menutup scanner
    }
    
    public static void lihatDaftarBuku(DaftarBuku daftarBuku) {
        System.out.println("Daftar Buku:");
        for (Buku buku : daftarBuku.daftarBuku) {
            buku.tampilkanInfo();
            System.out.println();
        }
    }

    public static void tambahBuku(DaftarBuku daftarBuku, Scanner scanner) {
        System.out.print("Judul Buku: ");
        String judul = scanner.nextLine();
        System.out.print("Penulis: ");
        String penulis = scanner.nextLine();
        System.out.print("Tahun Terbit: ");
        int tahunTerbit = scanner.nextInt();
        scanner.nextLine(); // Membersihkan newline dari buffer

        System.out.println("Jenis Buku (1. Fiksi, 2. Non-Fiksi): ");
        int jenis = scanner.nextInt();
        scanner.nextLine(); // Membersihkan newline dari buffer

        Buku buku;
        if (jenis == 1) {
            System.out.print("Jenis Fiksi: ");
            String jenisFiksi = scanner.nextLine();
            buku = new BukuFiksi(judul, penulis, tahunTerbit, jenisFiksi);
        } else if (jenis == 2) {
            System.out.print("Jenis NonFiksi: ");
            String JenisNonFiksi = scanner.nextLine();
            buku = new BukuNonFiksi(judul, penulis, tahunTerbit, JenisNonFiksi);
        } else {
            System.out.println("Pilihan jenis buku tidak valid.");
            return;
        }

        daftarBuku.tambahBuku(buku);
        System.out.println("Buku berhasil ditambahkan.");
    }

    public static void hapusBuku(DaftarBuku daftarBuku, Scanner scanner) {
        System.out.print("Judul Buku yang akan dihapus: ");
        String judul = scanner.nextLine();
        Buku buku = daftarBuku.cariBuku(judul);
        if (buku != null) {
            daftarBuku.hapusBuku(buku);
            System.out.println("Buku berhasil dihapus.");
        } else {
            System.out.println("Buku tidak ditemukan.");
        }
    }

    public static void cariBuku(DaftarBuku daftarBuku, Scanner scanner) {
        System.out.print("Judul Buku yang akan dicari: ");
        String judul = scanner.nextLine();
        Buku buku = daftarBuku.cariBuku(judul);
        if (buku != null) {
            buku.tampilkanInfo();
        } else {
            System.out.println("Buku tidak ditemukan.");
        }
    }
}
