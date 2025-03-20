public class Main {
    public static void main(String[] args) {
        // Mahasiswa mhs1 = new Mahasiswa("eko", "069", "Teknik Mancing");


        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "eko";
        mhs1.nim = "069";
        mhs1.jurusan = "teknik Mancing";
        
        System.out.println(mhs1.nama);
        System.out.println(mhs1.nim);
        System.out.println(mhs1.jurusan);

        Mahasiswa mhs2 = new Mahasiswa("Budi", "096", 
        "Sistem Memancing");
    
        System.out.println(mhs2.nama);
        System.out.println(mhs2.nim);
        System.out.println(mhs2.jurusan);
    }

}
