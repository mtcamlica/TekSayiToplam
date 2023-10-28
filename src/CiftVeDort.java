import java.util.Scanner;

public class CiftVeDort {
    public static void main(String[] args) {
        int sayi;
        int total = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Sayı giriniz: ");
            sayi = input.nextInt();
            if (sayi %2 == 0 && sayi %4 == 0){
                total +=sayi;
            }
        }while (sayi % 2 == 0);

        System.out.println("Toplam : " + total);
    }
}
