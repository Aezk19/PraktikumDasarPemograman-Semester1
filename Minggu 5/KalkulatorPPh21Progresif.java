import java.util.Scanner;

public class KalkulatorPPh21Progresif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Kalkulator PPh21---");
        System.out.print("Masukkan PKP: ");
        long pkp = sc.nextLong();

        if (pkp <= 0) {
            double pajak = 0;
            System.out.println(String.format("---Pajak yang harus dibayarkan---\nRp %.2f",pajak));
        } else if (pkp <= 60000000) {
            double pajak = 0.05 * pkp;
            System.out.println(String.format("---Pajak yang harus dibayarkan---\nRp %.2f",pajak));
        } else if (pkp <= 250000000) {
            double pajak = (0.05 * 60000000) + (0.15 * (pkp - 60000000));
            System.out.println(String.format("---Pajak yang harus dibayarkan---\nRp %.2f",pajak));
        } else if (pkp <= 500000000){
            double pajak = (0.05 * 60000000) + (0.15 * 190000000) + (0.25 * (pkp - 250000000));
            System.out.println(String.format("---Pajak yang harus dibayarkan---\nRp %.2f",pajak));
        } else {
            double pajak = (0.05 * 60000000) + (0.15 * 190000000) + (0.25 * 250000000) + (0.3 * (pkp - 500000000));
            System.out.println(String.format("---Pajak yang harus dibayarkan---\nRp %.2f",pajak));
        } 
    }
}
