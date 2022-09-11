import java.util.Scanner;

public class Vucut {
    public static void main(String[] args) {
        double boy,kilo,vki;
        System.out.println("Lütfen boyunuzu cm olarak giriniz :");
        Scanner b = new Scanner(System.in);
        boy = b.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz :");
        Scanner k = new Scanner(System.in);
        kilo = k.nextDouble();
        vki = (kilo*100*100) /(boy*boy);
        String s = (vki<30)?"Gayet sağlıklısınız":"Obezite Probleminiz var";
        System.out.println("Vücuk kitle endeksiniz : ");
        System.out.println(vki);
        System.out.println(s);

    }
}
