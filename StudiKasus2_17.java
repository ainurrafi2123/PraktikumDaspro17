import java.util.Scanner;
public class StudiKasus2_17 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String namaMahasiswa, jenisKegiatan;
    int jumlahDokumen, statusPendanaan, kurangDokumen, peringkatJuara;

    System.out.print("Masukkan Nama :");
    namaMahasiswa = scanner.nextLine();
    System.out.print("Belmawa/Bakorma/Mandiri/PKM/Lainnya :");
    jenisKegiatan = scanner.nextLine();
    System.out.print("Upload Dokumen (4) :");
    jumlahDokumen = scanner.nextInt();

    if (jenisKegiatan.equalsIgnoreCase("Belmawa") || jenisKegiatan.equalsIgnoreCase("Bakorma")
        || jenisKegiatan.equalsIgnoreCase("Mandiri")) {
      System.out.print("Masukkan Peringkat Juara (0 jika bukan juara) :");
      peringkatJuara = scanner.nextInt();
      if (jumlahDokumen == 4) {
        if (peringkatJuara >= 1 && peringkatJuara <= 3) {
          System.out.println("Selamat " + namaMahasiswa
              + ", berhak memperoleh dana penghargaan (Juara " + peringkatJuara + ").");
        } else {
          System.out.println("Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).");
        }
      } else {
        kurangDokumen = 4 - jumlahDokumen;
        System.out.println("Dokumen tidak lengkap (kurang " + kurangDokumen
            + " dokumen). Dana penghargaan tidak diberikan.");
      }
    } else {
      if (jenisKegiatan.equalsIgnoreCase("PKM")) {
        System.out.print("Apakah Lolos Pendanaan (1 = lolos, 0 = tidak) :");
        statusPendanaan = scanner.nextInt();
        if (jumlahDokumen == 4) {
          if (statusPendanaan == 1) {
            System.out.println("Berhak memperoleh dana penghargaan (PKM lolos pendanaan).");
          } else {
            System.out.println("Tidak memperoleh dana penghargaan (PKM tidak lolos pendanaan).");
          }
        } else {
          kurangDokumen = 4 - jumlahDokumen;
          System.out.println("Dokumen tidak lengkap (kurang " + kurangDokumen+ " dokumen). Dana penghargaan tidak diberikan.");
        }
      } else {
        System.out.println("Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).");
      }
    }
    
    scanner.close();
  }
}
