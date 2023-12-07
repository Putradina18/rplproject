package datapelanggan;

public class pelangganbaru {
    private final String nama;
    private final String jenis;
    private final int ukuran;
    
    public pelangganbaru(String nama, String jenis, int ukuran) {
        this.nama = nama;
        this.jenis = jenis;
        this.ukuran = ukuran;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getJenis() {
        return jenis;
    }
    
    public int getUkuran() {
        return ukuran;
    }
    
    @Override
    public String toString() {
        return "Nama: " + nama + ", Jenis Sepatu: " + jenis + ", Ukuran: " + ukuran;
    }
}
