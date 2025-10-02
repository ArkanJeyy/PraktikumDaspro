import java.util.Scanner;

public class nestedUjianSkripsi05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pesan;
        String bebasKompen;
        int bimbinganP1;
        int bimbinganP2;

        System.out.println("Apakah mahasiswa bebas kompen (ya/tidak): ");
        bebasKompen = sc.nextLine().trim();
        System.out.println("Masukan jumlah log bimbingan pembimbing 1: ");
        bimbinganP1 = sc.nextInt();
        System.out.println("Masukan jumlah log bimbingan pembimbinng 2: ");
        bimbinganP2 = sc.nextInt();


        if (bebasKompen.equalsIgnoreCase("ya")){
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4){
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            }else if (bimbinganP1 < 8  && bimbinganP2 < 4) {
                pesan = "Gagal! log bimbingan P1 kurang dari  8 kali dan P2 kurang dari 4 kali";   
            }else if (bimbinganP1 < 8) {
                pesan = "Gagal! log bimbigan P1 belum mencapai 8 kali";
            }else {
                pesan = "Gagal! log bimbingan P2 masih belum mencapai 4";
            }
        }else{
            pesan = "Gagal! Mahasiswa masih memiliki tanggung kompen";
        }
        System.out.println(pesan);
    }
}