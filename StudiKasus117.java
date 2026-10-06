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

    totalHarga = jumlahCup * hargaPerCup ;
    diskon = 0 ;

    if (totalHarga >= 100000) {
      diskon = totalHarga * 10 / 100 ;
    } else {
      diskon = 0;
    }

    totalBayar = totalHarga - diskon ;

    System.out.println("Total Harga:" + totalHarga);
    System.out.println("Diskon:" + diskon);
    System.out.println("Total Bayar:" + totalBayar);

    if (uangBayar >= totalBayar) {
      kembalian = uangBayar - totalBayar;
      System.out.println("Uang Tidak Cukup kurang Rp,"+ kembalian);
    } else {
      kurang = totalBayar - uangBayar;
      System.out.println("Uang Tidak Cukup, kurang Rp"+kurang);
    }
    scanner.close();
  }
}