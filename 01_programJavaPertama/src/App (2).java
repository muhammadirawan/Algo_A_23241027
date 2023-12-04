import javax.naming.NameAlreadyBoundException;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class App {
    public static void main(String[] args) throws Exception {
       // Membuat Variabel dan tipe dayanya
       String nama;
       String nim;
       String prodi;

       // mengisi variabel
       nama = "Awan";
       nim = "123456789";
       prodi = "PTI";

       // menampilkan isi variabel ke layar monitor
       System.out.println("Nama Mahasiswa : " + nama);
       System.out.println(":NIM : " + nim);
       System.out.println("Program Studi : " + prodi);
        }
}
