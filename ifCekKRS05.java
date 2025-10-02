import java.util.Scanner;
public class ifCekKRS05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (iya/tidak): ");
        boolean uktLunas = sc.nextBoolean();

        System.out.println(uktLunas ? "Bisa ikut ujian" : "Tidak bisa ikut ujian" );

        // if (uktLunas) {
        //     System.out.println("Pembayaran UKT terverifikasi");
        //     System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");

        }

    }