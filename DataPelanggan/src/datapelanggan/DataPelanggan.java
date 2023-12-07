package datapelanggan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataPelanggan {
    public static void main(String[] args) {
        List<pelangganbaru> daftarPelanggan = new ArrayList<>(); 
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("Buat Pesanan Baru (y/n)");
            String jawaban = input.nextLine();
            if (jawaban.equalsIgnoreCase("n")) {
                break;
            }
            System.out.println("Nama: ");
            String nama = input.nextLine();
            System.out.println("Jenis Sepatu: ");
            String jenis = input.nextLine();
            System.out.println("Ukuran: ");
            int ukuran = input.nextInt();
            input.nextLine();

            pelangganbaru pelanggan = new pelangganbaru(nama, jenis, ukuran); 
            daftarPelanggan.add(pelanggan);
        }
        System.out.println("Daftar Pesanan: ");
        for (pelangganbaru pelanggan : daftarPelanggan) {
            System.out.println(pelanggan);
        }
    }
}
