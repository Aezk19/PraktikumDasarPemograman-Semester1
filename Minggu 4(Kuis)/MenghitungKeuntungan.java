//Muhammad Akbar
//Kelas 1D
//No absen : 21
//NIM : 264107020029

import java.util.Scanner;

public class MenghitungKeuntungan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Untuk mendeklarasi scanner untuk input data dari user
        
        //Deklarasi variabel, int jika hanya membutuhkan bilangan bulat, double jika membutuhkan desimal
        int jualHP, jualKabel, jualEarphone; //Untuk mendeklarasi tipe data int(bulat) untuk variabel harga jual HP, kabel, dan earphone
        int beliHP, beliKabel, beliEarphone; //Untuk mendeklarasi tipe data int(bulat) untuk variabel harga beli HP, kabel, dan earphone
        int pengemasanHP, pengemasanKabel, pengemasanEarphone; //Untuk mendeklarasi tipe data int(bulat) untuk variabel biaya pengemasan HP, kabel, dan earphone
        int pengirimanHP, pengirimanKabel, pengirimanEarphone;  //untuk mendeklarasi tipe data int(bulat) untuk variabel biaya pengiriman HP, kabel, dan earphone
        double diskonHP, diskonKabel, diskonEarphone; //Untuk mendeklarasi tipe data double(desimal) untuk variabel diskon HP, kabel, dan earphone
        int faktorResikoKerusakanHP, faktorResikoKerusakanKabel, faktorResikoKerusakanEarphone; //untuk mendeklarasi tipe data double(desimal) untuk variabel faktor risiko kerusakan HP, kabel, dan earphone
        int jumlahPenjualanHP, jumlahPenjualanKabel, jumlahPenjualanEarphone; //Untuk mendeklarasi tipe data int(bulat) untuk variabel jumlah penjualan HP, kabel, dan earphone
        double KeuntunganPerHP, keuntunganPerKabel, KeuntunganPerEarphone; //Untuk mendeklarasi tipe data double(desimal) untuk variabel keuntungan HP, kabel, dan earphone
        double jumlahItemKeuntunganHP, JumlahItemKeuntunganKabel, jumlahItemKeuntunganEarphone; //Untuk mendeklarasi tipe data double(desimal) untuk variabel jumlah item penghitung keuntungan HP, kabel, dan earphone
        double KeuntunganProdukHP, KeuntunganProdukKabel, KeuntunganProdukEarphone; //Untuk mendeklarasi tipe data double(desimal) untuk variabel jumlah keuntungan HP, kabel, dan earphone
        double totalKeuntungan; //Untuk mendeklarasi tipe data double(desimal) untuk variabel keuntungan semua produk
        double totalItemPenghitungKeuntungan; //Untuk mendeklarasi tipe data double(desimal) untuk variabel total item penghitung keuntungan
        double rata2keuntungan; //Untuk mendeklarasi tipe data double(desimal) untuk variabel rata-rata keuntungan
        int targetKeuntungan; //Untuk mendeklarasi tipe data int(bulat) untuk variabel target keuntungan
        double persentaseKeuntungan; //Untuk mendeklarasi tipe data double(desimal) untuk variabel persentase keuntungan


        //Menerima input dari user untuk produk HP
        System.out.println("Masukkan harga jual HP(RP): ");
        jualHP = sc.nextInt(); //untuk mendapatkan input harga jual HP dari user
        System.out.println("Masukkan harga beli HP(RP): ");
        beliHP = sc.nextInt(); //untuk mendapatkan input harga beli HP dari user
        System.out.println("Masukkan biaya pengemasan HP(RP): ");
        pengemasanHP = sc.nextInt(); //untuk mendapatkan input biaya pengemasan HP dari user
        System.out.println("Masukkan biaya pengiriman HP(RP): ");
        pengirimanHP = sc.nextInt(); //untuk mendapatkan input biaya pengiriman HP dari user
        System.out.println("Masukkan diskon HP(RP): ");
        diskonHP = sc.nextDouble(); //untuk mendapatkan input jumlah diskon HP dari user
        System.out.println("Masukkan faktor risiko kerusakan HP(1-100%): ");
        faktorResikoKerusakanHP = sc.nextInt(); //untuk mendapatkan input faktor risiko kerusakan HP dari user
        System.out.println("Masukkan jumlah penjualan HP: ");
        jumlahPenjualanHP = sc.nextInt(); //untuk mendapatkan input jumlah penjualan HP dari user

        //Proses Menghitung Keuntungan produk HP
        KeuntunganPerHP = jualHP - beliHP - pengirimanHP - pengemasanHP - diskonHP; //untuk menghitung keuntungan HP
        jumlahItemKeuntunganHP = jumlahPenjualanHP - (faktorResikoKerusakanHP / 100 * jumlahPenjualanHP); //untuk menghitung jumlah item penghitung keuntungan HP
        KeuntunganProdukHP = KeuntunganPerHP * jumlahItemKeuntunganHP; // untuk menghitung jumlah keuntungan HP
        System.out.println("Keuntungan produk HP: " + KeuntunganProdukHP); // untuk menampilkan jumlah keuntungan HP

        //Menerima input dari user untuk produk kabel
        System.out.println("Masukkan harga jual kabel(RP): ");
        jualKabel = sc.nextInt(); //untuk mendapatkan input harga jual kabel dari user
        System.out.println("Masukkan harga beli kabel(RP): ");
        beliKabel = sc.nextInt(); //untuk mendapatkan input harga beli kabel dari user
        System.out.println("Masukkan biaya pengemasan kabel(RP): ");
        pengemasanKabel = sc.nextInt(); //untuk mendapatkan input biaya pengemasan kabel dari user
        System.out.println("Masukkan biaya pengiriman kabel(RP): ");
        pengirimanKabel = sc.nextInt(); //untuk mendapatkan input biaya pengiriman kabel dari user
        System.out.println("Masukkan diskon kabel(RP): ");
        diskonKabel = sc.nextDouble(); //untuk mendapatkan input jumlah diskon kabel dari user
        System.out.println("Masukkan faktor risiko kerusakan HP(1-100%): ");
        faktorResikoKerusakanKabel = sc.nextInt(); //untuk mendapatkan input faktor risiko kerusakan kabel dari user
        System.out.println("Masukkan jumlah penjualan kabel: ");
        jumlahPenjualanKabel = sc.nextInt(); //untuk mendapatkan input jumlah penjualan kabel dari user

        //Untuk menghitung keuntungan produk kabel
        keuntunganPerKabel = jualKabel - beliKabel - pengirimanKabel - pengemasanKabel - diskonKabel; //untuk menghitung keuntungan kabel
        JumlahItemKeuntunganKabel = jumlahPenjualanKabel - (faktorResikoKerusakanKabel / 100 * jumlahPenjualanKabel); //untuk menghitung jumlah item penghitung keuntungan kabel
        KeuntunganProdukKabel = keuntunganPerKabel * JumlahItemKeuntunganKabel; // untuk menghitung jumlah keuntungan kabel
        System.out.println("Keuntungan produk kabel: " + KeuntunganProdukKabel); // untuk menampilkan jumlah keuntungan kabel

        //Menerima input dari user untuk produk earphone
        System.out.println("Masukkan harga jual earphone(RP): ");
        jualEarphone = sc.nextInt(); //untuk mendapatkan input harga jual earphone dari user
        System.out.println("Masukkan harga beli earphone(RP): ");
        beliEarphone = sc.nextInt(); //untuk mendapatkan input harga beli earphone dari user
        System.out.println("Masukkan biaya pengemasan earphone(RP): ");
        pengemasanEarphone = sc.nextInt(); //untuk mendapatkan input biaya pengemasan earphone dari user
        System.out.println("Masukkan biaya pengiriman earphone(RP): ");
        pengirimanEarphone = sc.nextInt(); //untuk mendapatkan input biaya pengiriman earphone dari user
        System.out.println("Masukkan diskon earphone(RP): ");
        diskonEarphone = sc.nextDouble(); //untuk mendapatkan input jumlah diskon earphone dari user
        System.out.println("Masukkan faktor risiko kerusakan earphone(1-100%): ");
        faktorResikoKerusakanEarphone = sc.nextInt(); //untuk mendapatkan input faktor risiko kerusakan earphone dari user
        System.out.println("Masukkan jumlah penjualan earphone: ");
        jumlahPenjualanEarphone = sc.nextInt(); //untuk mendapatkan input jumlah penjualan earphone dari user

        //Untuk menghitung keuntungan produk earphone
        KeuntunganPerEarphone = jualEarphone - beliEarphone - pengirimanEarphone - pengemasanEarphone - diskonEarphone; //untuk menghitung keuntungan earphone
        jumlahItemKeuntunganEarphone = jumlahPenjualanEarphone - (faktorResikoKerusakanEarphone / 100 * jumlahPenjualanEarphone); //untuk menghitung jumlah item penghitung keuntungan earphone
        KeuntunganProdukEarphone = KeuntunganPerEarphone * jumlahItemKeuntunganEarphone; // untuk menghitung jumlah keuntungan earphone
        System.out.println("Keuntungan produk earphone: " + KeuntunganProdukEarphone); // untuk menampilkan jumlah keuntungan earphone

        //Menghitung keuntungan semua produk
        totalKeuntungan = KeuntunganProdukHP + KeuntunganProdukKabel + KeuntunganProdukEarphone ;
        System.out.println("Keuntungan semua produk adalah Rp." + totalKeuntungan);
        //Menghitung jumlah item penghitung keuntungan
        totalItemPenghitungKeuntungan = jumlahItemKeuntunganHP + jumlahItemKeuntunganEarphone + JumlahItemKeuntunganKabel;
        //Menghitung rata-rata keuntungan dari semua produk
        rata2keuntungan = totalKeuntungan / totalItemPenghitungKeuntungan;
        System.out.println("Rata-rata keuntungan semua produk adalah Rp." + rata2keuntungan );
        //Menghitung persentase keuntungan yang digapai dari target keuntungan total yang diharapkan

        System.out.println("Masukkan total keuntungan yang diharapkan(Rp)");
        targetKeuntungan = sc.nextInt(); //menerima input dari user berupa target keuntungan
        
        persentaseKeuntungan = totalKeuntungan / targetKeuntungan * 1; //menghitung persentase keuntungan
        System.out.println("Persentase keuntungan yang digapai adalah(%) : " + persentaseKeuntungan); //menampilkan persentase keuntungan yang digapai
    }
}
