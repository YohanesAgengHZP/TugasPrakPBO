package tugaspertemuan1;


public class Mahasiswa {
    String nama;
    int nim;
    int usia;
    int NilaiUTS;
    int NilaiUAS;
    private int NilaiAkhir;

    public Mahasiswa(String nama, int nim, int usia, int NilaiUTS, int NilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.usia = usia;
        this.NilaiUTS = NilaiUTS;
        this.NilaiUAS = NilaiUAS;
    }
    
    public Mahasiswa(){}

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public int getNilaiUTS() {
        return NilaiUTS;
    }

    public void setNilaiUTS(int NilaiUTS) {
        this.NilaiUTS = NilaiUTS;
    }

    public int getNilaiUAS() {
        return NilaiUAS;
    }

    public void setNilaiUAS(int NilaiUAS) {
        this.NilaiUAS = NilaiUAS;
    }   
    int NilaiAkhir()
    {
        NilaiAkhir=(NilaiUTS+NilaiUAS)/2;
        return NilaiAkhir;
    }
    
    public void Print()
    {
        System.out.printf(getNama(), getNim(), getUsia(), getNilaiUTS(),getNilaiUAS());
    }    
}
