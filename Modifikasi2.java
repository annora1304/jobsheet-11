import java.util.Scanner;
public class Modifikasi2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] hargaMenu = {15000, 20000, 22000, 12000, 10000, 18000};
        int totalHarga = 0;
        boolean lanjut = true;
        while (lanjut) {
            System.out.print("Masukkan nomor menu yang ingin Anda pesan (atau 0 untuk selesai): ");
            int pilihanMenu = scanner.nextInt() - 1;
            if (pilihanMenu == -1) {
                lanjut = false;
                break;
            }
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = scanner.nextInt();
            totalHarga += hitungHargaMenu(pilihanMenu, banyakItem, hargaMenu);
        }
        System.out.println("Total harga keseluruhan pesanan Anda: Rp" + totalHarga);
    }
    public static int hitungHargaMenu(int pilihanMenu, int banyakItem, int[] hargaMenu) {
        if (pilihanMenu < 0 || pilihanMenu >= hargaMenu.length) {
            System.out.println("Pilihan menu tidak valid.");
            return 0;
        }

        return hargaMenu[pilihanMenu] * banyakItem;
    }
}