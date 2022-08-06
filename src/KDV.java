import java.util.Scanner;
public class KDV {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Para değeri giriniz  :");
        double a ;
        a = input.nextDouble();
        if(a<1000){
            System.out.println("\nKDV siz fiyat :"+ a);
            double b = a/100*18;
            System.out.println("KDV miktarı :"+ b);
            double c = a + b;
            System.out.println("Toplam fiyat :"+ c);
        }
        else {
            System.out.println("\nKDV siz fiyat :"+ a);
            double b = a/100*8;
            System.out.println("KDV miktarı :"+ b);
            double c = a + b;
            System.out.println("Toplam fiyat :"+ c);
        }





    }





}
