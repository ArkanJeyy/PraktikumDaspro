import java.util.Scanner;

public class switchCetakKRS05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int semester;

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.println("Masukan semester saat ini: ");
        semester = sc.nextInt();

        switch (semester) {
        case 1:
            System.out.println("KRS Semester 1 ditampillkan");
            break;
        case 2:
            System.out.println("KRS Semester 2 ditampillkan");
            break;
        case 3:
            System.out.println("KRS Semester 3 ditampillkan");
            break;
        case 4:
            System.out.println("KRS Semester 4 ditampillkan");
            break;
        case 5:
            System.out.println("KRS Semester 5 ditampillkan");
            break;
        case 6:
            System.out.println("KRS Semester 6 ditampillkan");
            break;
        case 7:
            System.out.println("KRS Semester 7 ditampillkan");
            break;
        case 8:
            System.out.println("KRS Semester 8 ditampillkan");
            break;
        default:
            System.out.println("Semester tidak valid");
        }
    }
}
