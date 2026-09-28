import java.util.Scanner;

public class KalkulatorPPh21Progresif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Kalkulator PPh21---");
        System.out.print("Masukkan PKP: ");
        double pkp = sc.nextDouble();
        double pph;

        if (pkp <= 0) {
            pph = 0;
        } else if (pkp <= 60000000) {
            pph = 0.05 * pkp;
        } else if (pkp <= 250000000) {
            pph = (0.05 * 60000000) + (0.15 * (pkp - 60000000));
        } else if (pkp <= 500000000){
            pph = (0.05 * 60000000) + (0.15 * 190000000) + (0.25 * (pkp - 250000000));;
        } else {
            pph = (0.05 * 60000000) + (0.15 * 190000000) + (0.25 * 250000000) + (0.3 * (pkp - 500000000));
        } 
        System.out.println(String.format("---Pajak yang harus dibayarkan---\nRp %.2f",pph));
    }
}
