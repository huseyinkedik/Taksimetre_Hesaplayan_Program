import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double km, kmucret = 2.20, taksiacilis = 10, toplam, ucret;
        Scanner giris = new Scanner(System.in);
        System.out.print("Km giriniz: ");
        km = giris.nextInt();

        toplam = (km * kmucret) + taksiacilis;
        if (toplam < 20) ucret = 20;
        else ucret = (km * kmucret) + taksiacilis;

        System.out.print(ucret);
        }
    }