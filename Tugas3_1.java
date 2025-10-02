import java.util.Scanner;
public class Tugas3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        String metode; 
        boolean kartu = false;
        boolean regist = false;
        
        System.out.println("apakah membawa kartu mahasiswa? (ya/tidak)");
        metode = sc.nextLine().toLowerCase();

        if (metode.equals("ya")) {
            kartu = true;
        }

         System.out.println("apakah sudah registrasi online? (ya/tidak)");
        metode = sc.nextLine().toLowerCase();
        if (metode.equals("ya")){
            regist = true;

        }

        if ( kartu || regist){
            System.out.println("Silahkan Masuk (Akses Berhasil)");
        }else{
            System.out.println("Akses Gagal (Anda Tidak Memenuhi Persyaratan)");
        }
        }
 
    }
