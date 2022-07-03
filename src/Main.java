import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double tutar,kdvOran;

        System.out.print("Ücret Tutarını Giriniz : " );
        tutar = input.nextDouble();

        if(tutar<=1000) {
            kdvOran=0.18;
        }else {
            kdvOran=0.8;
        }

        double kdvTutar = tutar * kdvOran;
        double kdvliTutar = tutar + kdvTutar;
        System.out.println("KDV'siz Tutar :" + tutar);
        System.out.println("KDV Oranı :" + kdvOran);
        System.out.println("KDV Tutarı :" + kdvTutar);
        System.out.println("KDV'li tutar :" + kdvliTutar);
    }
}