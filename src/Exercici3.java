import java.util.Scanner;

public class Exercici3 {
    public static void main(String[] args) {
    int edat;
    String genere;

        Scanner sc_prova = new Scanner(System.in);
        edat = sc_prova.nextInt();

        System.out.println("Esriu Una Opcio");
        System.out.println("1. Dona");
        System.out.println("2. Home");

        int opcio = sc_prova.nextInt();



        if ( opcio == 1 && edat>=16) {
            System.out.println("La teva categoira es la B");

        }else if ( opcio == 1 && edat<=16){
            System.out.println("La teva categoria es la A");

        }else if (opcio == 1 && edat>=17 && edat <= 40){
            System.out.println("La teva Categoira es la D");
        } else if (opcio == 2 && edat > 17 && edat <= 40) {
            System.out.println("La teva Catgeoira es la C");
        }else if (opcio == 1 && edat>=41 ){

        }
        if (opcio == 1 && edat<=16){
            System.out.println(" La teva Categoira es la B");
        }else if (opcio == 2 && edat<=16){
            System.out.println("La teva Categoira es la A");
        }else if (opcio == 1 && edat>=17 && edat <= 40) {
            System.out.println(" La teva Categoira es la D");
        }else if (opcio == 2 && edat>=17  && edat<= 40){
            System.out.println("La teva Categoira es la C");
        }else if (opcio == 1&& edat>= 41){
            System.out.println( "La teva categoira es la f");
        }else if (opcio ==  2 && edat>41)
            System.out.println("La teva Categoira es la E");




    }
}
