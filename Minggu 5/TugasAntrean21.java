
import java.util.Scanner;

public class TugasAntrean21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("---Mesin Antrean Digital---\n(1)Legalisir Ijazah\n(2)Surat Keterarangan Aktif Kuliah\n(3)Pembayaran UKT\n(4)Pengajuan Cuti Akademik\nMasukkan kode layanan: ");
        byte kode = sc.nextByte();

        switch (kode) {
            case 1: 
            System.out.println("---Loket---\nSilahkan mengantri di loket A (Legalisir Ijazah)");
            break;
            case 2:
            System.out.println("---Loket---\nSilahkan mengantri di loket B (Surat Keterangan Aktif Kuliah)");
            break;
            case 3:
            System.out.println("---Loket---\nSilahkan mengantri di loket C (Pembayaran UKT)");
            break;
            case 4:
            System.out.println("---Loket---\nSilahkan mengantri di loket D (Pengajuan Cuti Akademik)");
            break;
            default: 
            System.out.println("Kode layanan tidak valid");
        } 

    }
}
