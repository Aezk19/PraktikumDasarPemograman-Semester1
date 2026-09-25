
import java.util.Scanner;

public class NusantaraPay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Nusantara Pay---");
        System.out.print("Apakah akun terdaftar sebagai BLACK-LISTED? (true/false): ");
        boolean isBlacklist = sc.nextBoolean();
        System.out.println("Apakah akun terdaftar sebagai SUSPICIOUS? (true/false): ");
        boolean isSuspicious = sc.nextBoolean();
        System.out.print("Masukkan Sisa Saldo: ");
        long saldo = sc.nextLong();
        System.out.print("Masukkan jumlah transaksi: ");
        long transaksi = sc.nextLong();
        System.out.print("Apakah beda negara? (true/false): ");
        boolean isBedaNegara = sc.nextBoolean();
        System.out.print("Masukkan jam saat transaksi dilakukan (00,00-23,59(Gunakan pemisah koma)): ");
        float jam = sc.nextFloat();

        System.out.println("---Status Transaksi Anda---");
        if (isBlacklist) {
            System.out.println("REJECTED_BLACKLIST");
        } else if (transaksi > saldo) {
            System.out.println("REJECTED_SALDO");
        } else if (transaksi > 10000) {
            System.out.println("REJECTED_LIMIT");
        } else if (isBedaNegara && transaksi > 2000) {
            System.out.println("FLAGGED_FRAUD");
        } else if (jam >= 0 && jam <= 4) {
            System.out.println("REQUIRE_OTP_NIGHT");
        } else if (isSuspicious && transaksi > 500) {
            System.out.println("REQUIRE_OTP_SUSPICIOUS");
        } else {
            System.out.println("APRROVED");
        }
    }
}