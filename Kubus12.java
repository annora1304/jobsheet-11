import java.util.Scanner;
public class Kubus12 {
    
    public static double hitungVolume(double sisi) {
        return Math.pow(sisi, 3); 
    }
    public static double hitungLuasPermukaan(double sisi) {
        return 6 * Math.pow(sisi, 2); 
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = input.nextDouble();

        double volume = hitungVolume(sisi);
        double luasPermukaan = hitungLuasPermukaan(sisi);

        System.out.println("Volume kubus adalah: " + volume);
        System.out.println("Luas permukaan kubus adalah: " + luasPermukaan);

        input.close(); r
    }
}