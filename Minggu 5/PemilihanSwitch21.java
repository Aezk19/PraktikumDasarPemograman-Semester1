
import java.util.Scanner;

public class PemilihanSwitch21 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     System.out.println("---Cetak KRS SIAKAD---");
     System.out.print("Masukkkan semester saat ini: ");
     int semester = sc.nextInt();

     switch (semester) {
        case 1:
            System.out.println("KRS semester 1 ditampilan");
            break;
        case 2:
            System.out.println("KRS semester 2 ditampilan");
            break;
        case 3:
            System.out.println("KRS semester 3 ditampilan");
            break;
        case 4:
            System.out.println("KRS semester 4 ditampilan");
            break;
        case 5:
            System.out.println("KRS semester 5 ditampilan");
            break;
        case 6:
            System.out.println("KRS semester 6 ditampilan");
            break;
        case 7:
            System.out.println("KRS semester 7 ditampilan");
            break;
        case 8:
            System.out.println("KRS semester 8 ditampilan");
            break;
        default:
            System.out.println("Semester tidak valid");
     }
    }
}
