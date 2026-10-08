import java.util.Scanner;

public class StudiKasus2_17 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String namaMahasiswa, jenisKegiatan;
    int jumlahDokumen, statusPendanaan, kurangDokumen, peringkatJuara;;
     

    System.out.print("Masukkan Nama :");
    namaMahasiswa = scanner.nextLine();
    System.out.print("Belmawa/Bakorma/Mandiri/PKM/Lainya :");
    jenisKegiatan = scanner.nextLine();

    if (jenisKegiatan.equalsIgnoreCase("Belmawa") || jenisKegiatan.equalsIgnoreCase("Bakorma")
        || (jenisKegiatan.equalsIgnoreCase("Mandiri"))) {
      System.out.print("Upload Dokumen (4) :");
      jumlahDokumen = scanner.nextInt(); 
      if (jumlahDokumen == 4) {
        System.out.print("Masukkan Peringkat Juara :");
        peringkatJuara = scanner.nextInt();
        if (peringkatJuara >= 1 && peringkatJuara <= 3) {
          System.out.println("Selamat " + namaMahasiswa + " Mendapat Dana Penghargaan.");
        } else {
          System.out.println("Peringkat Juara Belum Memenuhi Kriteria");
        }
      } else {
        kurangDokumen =  4 - jumlahDokumen ;
        System.out.println("Dokumen Tidak Lengkap (Kurang " + kurangDokumen + " dokumen). Silahkan Memenuhi Kurangnya Dokumen");
      }
    } else {
      if (jenisKegiatan.equalsIgnoreCase("Pkm")) {
        System.out.print("Upload Dokumen (4) :");
        jumlahDokumen = scanner.nextInt();
        if (jumlahDokumen == 4) {
          System.out.print("Apakah Lolos Pendanaan:");
          statusPendanaan = scanner.nextInt();
          if (statusPendanaan == 1) {
            System.out.println("Selamat " + namaMahasiswa + " Mendapat Dana Penghargaan.");
          } else {
            System.out.println("Dana Penghargaan Ditolak ");
          }
        } else {
          kurangDokumen =  4 - jumlahDokumen ;
          System.out.println("Dokumen Tidak Lengkap (Kurang " + kurangDokumen + " dokumen). Silahkan Memenuhi Kurangnya Dokumen");
        }
      } else {
        System.out.println("Kegiatan lainya tidak memperoleh dana penghargaan.");
      }
    }

    scanner.close();
  }
}
