import java.util.Scanner;

public class Exerici8 {
    public static void main(String[] args) {
        Scanner sc_programa = new Scanner(System.in);
        float preu, preuFinal ,Descompte, DesCompteaplicat;
        Descompte = 1.15f;

        System.out.println("BotigaInformatica");

        System.out.println("Quin es el preu");
        preu = sc_programa.nextFloat();
         if (preu>100){
             preuFinal = (preu / Descompte);
             DesCompteaplicat = (preu - preuFinal);
             System.out.println("El preu final amb descompte es  ");
             System.out.println((" S'ha aplicay un descompye de: " +DesCompteaplicat));

         }else if (preu<=100){
             System.out.println(" El preu final es de: "+preu);
         }

    }
}
