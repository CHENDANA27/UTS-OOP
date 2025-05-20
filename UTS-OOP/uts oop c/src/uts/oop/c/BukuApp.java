package uts.oop.c;

public class BukuApp {
    private final Buku[] buku;
    private final int maxBuku;
    int currentBukuCount;

    // Konstruktor untuk menginisialisasi kapasitas array buku
    public BukuApp(int maxBuku) {
        this.maxBuku = maxBuku;
        this.buku = new Buku[maxBuku];
        this.currentBukuCount = 0;
    }

    // Menambah data buku
    public void addBuku(Buku b) {
        if (currentBukuCount < maxBuku) {
            buku[currentBukuCount] = b;
            currentBukuCount++;
            System.out.println("Data buku berhasil ditambahkan.");
        } else {
            System.out.println("Batas kapasitas tercapai, tidak bisa menambah data buku.");
        }
    }

    // Menampilkan data buku
    public void displayBuku() {
        if (currentBukuCount == 0) {
            System.out.println("Tidak ada data buku.");
            return;
        }
        for (int i = 0; i < currentBukuCount; i++) {
            System.out.println((i + 1) + ". " + buku[i].toString());
        }
    }

    // Mengubah data buku
    public void updateBuku(int index, Buku b) {
        if (isValidIndex(index)) {
            buku[index] = b;
            System.out.println("Data buku berhasil diubah.");
        } else {
            System.out.println("Indeks tidak valid.");
        }
    }

    // Menghapus data buku
    public void deleteBuku(int index) {
        if (isValidIndex(index)) {
            for (int i = index; i < currentBukuCount - 1; i++) {
                buku[i] = buku[i + 1];
            }
            buku[currentBukuCount - 1] = null; // Menghapus buku terakhir
            currentBukuCount--;
            System.out.println("Data buku berhasil dihapus.");
        } else {
            System.out.println("Indeks tidak valid.");
        }
    }

    // Memeriksa apakah indeks valid
    private boolean isValidIndex(int index) {
        return index >= 0 && index < currentBukuCount;
    }

    // Menampilkan menu aplikasi
    public void showMenu() {
        System.out.println("\nMenu Aplikasi Data Buku:");
        System.out.println("1. Tambah Data Buku");
        System.out.println("2. Tampilkan Data Buku");
        System.out.println("3. Ubah Data Buku");
        System.out.println("4. Hapus Data Buku");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu (1-5): ");
    }
}

