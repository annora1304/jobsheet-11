import java.util.Scanner;
public class Modifikasi3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] hargaMenu = {15000, 20000, 22000, 12000, 10000, 18000};
        
        System.out.print("Masukkan nomor menu yang ingin Anda pesan (1-6): ");
        int pilihanMenu = scanner.nextInt() - 1; 
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = scanner.nextInt();
        System.out.print("Masukkan kode promo (jika ada): ");
        String kodePromo = scanner.next();
        
        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, hargaMenu, kodePromo);
        System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);
        
        scanner.close(); 
    }
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, int[] hargaMenu, String kodePromo) {
        if (pilihanMenu < 0 || pilihanMenu >= hargaMenu.length) {
            System.out.println("Pilihan menu tidak valid.");
            return 0;
        }
        
        int totalHarga = hargaMenu[pilihanMenu] * banyakItem;
        
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            totalHarga /= 2; 
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            totalHarga -= (totalHarga * 0.3); 
        } else if (!kodePromo.isEmpty()) { 
            System.out.println("Kode promo tidak valid.");
        }
        return totalHarga;
    }
}