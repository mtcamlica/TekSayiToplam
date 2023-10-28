import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int toplam = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Sayı giriniz: ");
            n = input.nextInt();
            if(n%2 == 1){
                toplam += n;
            }
        }while (n>0);

        System.out.print("Toplam : " + toplam);
    }
}
