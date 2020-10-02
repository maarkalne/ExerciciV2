import java.util.Scanner;

public class Exerici6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sco = new Scanner(System.in);


        int segonNum;
        String nom;


        System.out.println(" Tens carent de conduir?");
        nom = sc.nextLine();

        System.out.println(" Tens mes de 18 anys? ");
        segonNum = sc.nextInt();

        System.out.println("Has begut alchol?");
        nom = sco.nextLine();

        System.out.println("Has consumit algun tipis de substancia no permesa");
        segonNum= sco.nextInt();

    }

}

