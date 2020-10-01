import java.util.Scanner;

public class Ex2v2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);


        int segonNum;
        String nom;

        System.out.println("Escriu el teu non");
        nom = sc.nextLine();

        System.out.println("Escriu el teu saldo");
        segonNum = sc.nextInt();

        if (segonNum<=0) {
            System.out.println(nom+" Estas amb numeros Negatius");
        }else {
            System.out.println(nom+ " Estas amb numeros Positius");
        }


    }
}
