import java.util.Scanner;

public class Exerici7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Float numero1, numero2 ,numero3;

        System.out.println("Fica un Numero");
        numero1 = sc.nextFloat();

        System.out.println("Fica un Numero");
        numero2 = sc.nextFloat();

        System.out.println("Fica un Numero");
        numero3 = sc.nextFloat();

        if (numero1 > numero2){
            if ( numero1> numero3){
                System.out.println("EL numero mes gran de tots sera: "+numero1);
            }else{
                System.out.println("El numero mes gran de tots sera" +numero3);
            }


        }else if (numero2>numero3){
            System.out.println("El numero gran es: "+numero2);
        }else{
            System.out.println("El numero gran es:  "+numero3);
        }

        if (numero1 < numero2){
            if (numero1<numero2){
                System.out.println("El numero es petit"+numero1);
            }else{
                System.out.println("El numero es petit"+ numero3);
            }

        }else  if (numero2<numero3){
            System.out.println("El numero molt mes petit"+numero2);
        }else{
            System.out.println("El numero molt mes petit" +numero3);
        }
    }
}
