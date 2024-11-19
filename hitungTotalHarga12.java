import java.util.Scanner;
public class hitungTotalHarga12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] hargaMenu = {15000, 20000, 22000, 12000, 10000, 18000};
        System.out.print("Masukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = scanner.nextInt() - 1; 

        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = scanner.nextInt();

        
        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, hargaMenu);

        System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);
    }
     public static int hitungTotalHarga(int pilihanMenu, int banyakItem, int[] hargaMenu) {
       
        if (pilihanMenu < 0 || pilihanMenu >= hargaMenu.length) {
            System.out.println("Pilihan menu tidak valid.");
            return 0;
        }
        int totalHarga = hargaMenu[pilihanMenu] * banyakItem;
        return totalHarga;
    }
}