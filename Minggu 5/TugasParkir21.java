
import java.util.Scanner;

public class TugasParkir21 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tarifParkir;
        System.out.print("Masukkan lama parkir (jam): ");
        byte jam = sc.nextByte();

        if (jam <= 2) {
            tarifParkir = 2000;
        } else {
            tarifParkir = 2000 + 1000 * (jam - 2);
        }
        System.out.println("Tarif parkir adalah: " +tarifParkir);
    }
}
