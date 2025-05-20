
package uts.oop.c;

import java.util.Scanner;

public class UtsOopC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BukuApp app = new BukuApp(5); // Kapasitas maksimal 5 buku

        while (true) {
            app.showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();  // Membuang newline karakter setelah input angka

            switch (choice) {
                case 1: // Menambah data buku
                    System.out.print("Masukkan judul buku: ");
                    String judul = scanner.nextLine();
                    System.out.print("Masukkan pengarang buku: ");
                    String pengarang = scanner.nextLine();
                    System.out.print("Masukkan penerbit buku: ");
                    String penerbit = scanner.nextLine();
                    Buku newBuku = new Buku(judul, pengarang, penerbit);
                    app.addBuku(newBuku);
                    break;

                case 2: // Menampilkan data buku
                    app.displayBuku();
                    break;

                case 3: // Mengubah data buku
                    System.out.print("Masukkan indeks data buku yang ingin diubah (0 hingga " + (app.currentBukuCount - 1) + "): ");
                    int updateIndex = scanner.nextInt();
                    scanner.nextLine(); // Membuang newline karakter
                    System.out.print("Masukkan judul buku baru: ");
                    String newJudul = scanner.nextLine();
                    System.out.print("Masukkan pengarang buku baru: ");
                    String newPengarang = scanner.nextLine();
                    System.out.print("Masukkan penerbit buku baru: ");
                    String newPenerbit = scanner.nextLine();
                    Buku updatedBuku = new Buku(newJudul, newPengarang, newPenerbit);
                    app.updateBuku(updateIndex, updatedBuku);
                    break;

                case 4: // Menghapus data buku
                    System.out.print("Masukkan indeks data buku yang ingin dihapus (0 hingga " + (app.currentBukuCount - 1) + "): ");
                    int deleteIndex = scanner.nextInt();
                    scanner.nextLine(); // Membuang newline karakter
                    app.deleteBuku(deleteIndex);
                    break;

                case 5: // Keluar dari aplikasi
                    System.out.println("Terima kasih telah menggunakan aplikasi data buku.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}

