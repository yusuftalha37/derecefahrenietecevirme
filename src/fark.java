import java.util.Scanner;

public class fark {
    public static void main(String[] args) {
        System.out.println("Lütfen değeri giriniz");
        Scanner tarayıcı = new Scanner(System.in);
        double sıcaklık = tarayıcı.nextDouble();
        fark2 o = new fark2();
        o.dereceyiHesaplama(sıcaklık);

    }
}
