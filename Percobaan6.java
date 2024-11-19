import java.util.Scanner;
public class Percobaan6 {
    static int hitungLuas(int panjang, int lebar) {
        return panjang * lebar;
    }

    static int hitungVolume(int tinggi, int panjang, int lebar) {
        return hitungLuas(panjang, lebar) * tinggi;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan panjang: ");
        int panjang = input.nextInt();
        
        System.out.print("Masukkan lebar: ");
        int lebar = input.nextInt();
        
        System.out.print("Masukkan tinggi: ");
        int tinggi = input.nextInt();

        int luas = hitungLuas(panjang, lebar);
        System.out.println("Luas Persegi Panjang adalah " + luas);

        int volume = hitungVolume(tinggi, panjang, lebar);
        System.out.println("Volume Balok adalah " + volume);
        
        input.close(); 
    }
}