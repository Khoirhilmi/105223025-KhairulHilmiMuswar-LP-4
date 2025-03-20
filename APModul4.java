class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;
    private double ipk;

    public Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("IPK: " + ipk);
    }

    public boolean cekLulus() {
        return ipk >= 3.0;
    }
}

public class APModul4 {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Budi Santoso", "12345678", "Informatika", 3.5);
        Mahasiswa mhs2 = new Mahasiswa("Ani Susanti", "87654321", "Teknik Mesin", 2.8);

        System.out.println("Data Mahasiswa 1:");
        mhs1.tampilkanInfo();
        System.out.println("Lulus: " + mhs1.cekLulus());

        System.out.println("\nData Mahasiswa 2:");
        mhs2.tampilkanInfo();
        System.out.println("Lulus: " + mhs2.cekLulus());
    }
}
