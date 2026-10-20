import java.util.Scanner;

public class NilaiMahasiswa {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int i ;
    double nilai, tertinggi = 0, terendah = 100;

    for ( i = 1; i <= 10; i++) {
      System.out.print("Masukkan Nilai Mahasiswa ke-" + i +": ");
      nilai = scanner.nextDouble();
      if (nilai > tertinggi) {
        tertinggi = nilai;
      }
      if (nilai < terendah) {
        terendah = nilai;
      }
    }
    System.out.println("Nilai Tertinggi: " + tertinggi);
    System.out.println("Nilai Terendah: " + terendah);

    scanner.close();
  }
}