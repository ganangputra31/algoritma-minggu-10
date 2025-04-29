package jobsheet9;

public class Mahasiswa08 {
    String nim;
    String nama;
    String kelas;
    int nilai;

    Mahasiswa08 (String nama, String nim, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.nilai = -1;

    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
        
    }
}