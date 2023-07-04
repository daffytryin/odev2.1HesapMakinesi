import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n1, n2, secim;

        Scanner input = new Scanner(System.in); //kullanıcıdan sayıları alıyoruz
        System.out.print("İlk Sayıyı Giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        n2 = input.nextInt();

        System.out.println("Seçime göre yapmak istediğiniz işlemin numarasını giriniz.\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz: ");
        secim = input.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Toplam: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma: " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Bölme: " + (n1 / n2));
                } else {
                    System.out.println("0'a bölme işlemi yapamazsınız.");
                }
                break;
            default:
                System.out.println("Yanlış bir seçim yaptınız. Lütfen tekrar deneyiniz.");
        }

    }
}
