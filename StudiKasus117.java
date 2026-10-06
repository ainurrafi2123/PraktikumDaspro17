import java.util.Scanner;
public class StudiKasus117 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int hargaPerCup = 18000 ;
    int jumlahCup, uangBayar ;
    int totalHarga, diskon, totalBayar ; 
    int kembalian, kurang ;

    System.out.print("Masukkan Jumlah Cup:");
    jumlahCup = scanner.nextInt();
    System.out.print("Masukkan Uang Bayar:");
    uangBayar = scanner.nextInt();

    scanner.close();
  }
}