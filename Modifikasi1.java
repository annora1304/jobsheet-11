import java.util.Scanner;
public class Modifikasi1 {
    public static void main(String[] args) {
        Menu("Andi", true, "DISKON50");
    }
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi HItam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nomor menu pilihan Anda: ");
        int pilihan = scanner.nextInt();
        int harga = 0;
        switch (pilihan) {
            case 1: harga = 15000; break;
            case 2: harga = 20000; break;
            case 3: harga = 22000; break; 
            case 4: harga = 12000; break;
            case 5: harga = 10000; break;
            case 6: harga = 18000; break;
            default:
                System.out.println("Pilihan tidak valid.");
                return;
        }
        double totalHarga = harga;
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode promo valid: Anda mendapatkan diskon 50%!");
            totalHarga *= 0.5;
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode promo valid: Anda mendapatkan diskon 30%!");
            totalHarga *= 0.7;
        } else if (!kodePromo.isEmpty()) {
            System.out.println("Kode promo tidak valid.");
        }
        if (isMember) {
            System.out.println("Diskon member 10% diterapkan!");
            totalHarga *= 0.9;
        }
        System.out.println("Total yang harus Anda bayar: Rp " + (int) totalHarga);
    }
}