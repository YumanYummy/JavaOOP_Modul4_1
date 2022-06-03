package Abstract;
import java.util.Scanner;


public class Drivers {
    public static void main(String[] args) {
        int R, S , T;
        Scanner Y = new Scanner(System.in);
        Kerucut k = new Kerucut();
        Bola1 b = new Bola1();
        System.out.print("Masukkan Jari-Jari: ");
        R = Y.nextInt();
        System.out.print("Masukkan Garis Pelukis: ");
        S = Y.nextInt();
        System.out.print("Masukkan Tinggi: ");
        T = Y.nextInt();
        System.out.println();
        k.setR(R);
        k.setS(S);
        k.setT(T);
        k.getLuasPermukaan();
        k.getVolume();
        System.out.println();
        b.setR(R);
        b.getLuasPermukaan();
        b.getVolume();
    }
}
