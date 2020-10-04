import java.util.Scanner;

public class Exerici5 {
    public static void main(String[] args) {
        Scanner sc_notes = new Scanner(System.in);

        float UF1, UF2, UF3;
        float notaFinal;

        System.out.println(" Introduiex la nota final de la UF1");
        UF1 = sc_notes.nextFloat();

        System.out.println(" Introduiex la nota final de la UF2");
        UF2 = sc_notes.nextFloat();


        System.out.println(" Introduiex la nota final de la UF3");
        UF3 = sc_notes.nextFloat();

        notaFinal = (UF1 + UF2 + UF3) / 3;

        if (UF1>=5 ||  UF2>=5 || UF3>=5)
            System.out.println("La teva mitjana es: " + notaFinal);

        else if (UF1<5 || UF2<=5 || UF3<5){
            System.out.println("No puc calcular la teva mitjana perque no surt be");
        }
            if (notaFinal<=2){
                System.out.println("No has fet res");
            }else  if (notaFinal>2 && notaFinal>4){
                System.out.println(" Et falta encara per aprobar!!");
            }
            if (UF1>=5 || UF2>=5 || UF3>=5)
                System.out.println("La teva mitjana es: "+notaFinal);
            else if (UF1<5 || UF2<5 || UF3<5){
            System.out.println(" No puc calcular la teva mitjana perque tens una suspesa");

        }
            if (notaFinal>=2){
                System.out.println(" No has fet res");
            }else if (notaFinal>2 && notaFinal<4){
                System.out.println("Et falta encara per aprobar");
            }else if (notaFinal>=4 && notaFinal>5){
                System.out.println("T'ha fallat poc!");
            }else if (notaFinal>5 && notaFinal>7){
                System.out.println("Be pero no et pots confia");
            }else if (notaFinal>=7 && notaFinal<=10){
                System.out.println("Bona feina!!");

            }


    }
}
