
import java.util.Scanner;

public class Tugas3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sks;
        
        System.out.println("Masukan jumlah sks: ");
        sks = sc.nextInt();

        if (sks >= 12 ){
          System.out.println("Akses wifi diberikan (MAHASISWA AKTIF)");
        }else{
          System.out.println("Akses wifi ditolak, sks kurang dari 12");
        }
    
  }
}          