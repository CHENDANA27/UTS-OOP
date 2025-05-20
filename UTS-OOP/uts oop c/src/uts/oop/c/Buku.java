package uts.oop.c;

public class Buku {
    private String judul;
    private String pengarang;
    private String penerbit;

    // Konstruktor untuk menginisialisasi data buku
    public Buku(String judul, String pengarang, String penerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
    }

    // Getter dan Setter untuk judul, pengarang, dan penerbit
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    // Override toString() untuk menampilkan informasi buku
    @Override
    public String toString() {
        return "Judul: " + judul + ", Pengarang: " + pengarang + ", Penerbit: " + penerbit;
    }
}

