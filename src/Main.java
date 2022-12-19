import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        double tutar,kdv1=0.18,kdv2=0.08,kdvliTutar,kdvTutari;
        System.out.println("Ücret tutarını giriniz");
        tutar=input.nextDouble();
        if(tutar>1000){
            kdvTutari=(tutar*kdv2);
            kdvliTutar=tutar+kdvTutari;


        }
        else {
            kdvTutari=(tutar*kdv1);
            kdvliTutar=tutar+kdvTutari;

        }
        System.out.println("KDV'siz Tutar: " + tutar);
        if(tutar>1000){
            System.out.println("KDV Oranı: " + kdv2);


        }
        else {
            System.out.println("KDV Oranı: " + kdv1);
        }


        System.out.println("KDV Tutarı: " + kdvTutari);
        System.out.println("Toplam Tutar: " + kdvliTutar);



    }
}