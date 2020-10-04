import java.util.Scanner;

public class Exerici2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);


        System.out.println("Escriu la paraula Covid19");
        long tempsInicial = System.currentTimeMillis();
        String paraula= sc.nextLine();
        if (paraula.equals("Covid19")){
        long tempsFinal = (System.currentTimeMillis()-tempsInicial)/1000;
            System.out.println(tempsFinal);
            if (tempsFinal < 2) {
                System.out.println("Ets un crack!!");
            }
            else if (tempsFinal < 3){
                System.out.println("Ets força rapid");
            }
            else if (tempsFinal>3){
                System.out.println("Ets molt lent");
            }
        }else{
            System.out.println("La Paraula malescrita");

        }






    }
}
