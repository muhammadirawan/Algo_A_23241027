import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // deklarasi variabel dan tipe data
        String nama;
        int nim;
        String prodi;
        double tinggi_badan;
        
        // membuat objek scanner baru
        Scanner input = new Scanner(System.in);

        System.out.println("From Data Mahasiswa UNDIKMA");
        System.out.println("=====================");
        // membuat form mengisi variabel
        System.out.print("Masukan Nama Mahasiswa : ");
        nama = input.nextLine();

        System.out.print("Tinggi Badan : ");
        tinggi_badan = input.nextDouble();

        //cetak output kelayar monitor
        System.out.println("Data Mahasiswa UNDIKMA");
        System.out.println("======================");
        System.out.println("Nama Mahasiswa : + nama);
        System.out.println("NIM : + nim);
        System.out.println("Program Studi : " + prodi);
        System.out.println("Tinggi Badan : " + tinggi_badan);

        
    }
}
