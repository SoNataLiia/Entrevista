import java.util.Scanner;

public class EsUnPalindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una palabra para comprobar si es un palíndromo:\n");
        String palidromo = sc.nextLine();
        String reversed = new StringBuilder(palidromo).reverse().toString();
        if(palidromo.equals(reversed)) {
            System.out.println("Es un palíndromo.");
        }else{
            System.out.println("No es un palíndromo.");
        }
        sc.close();
    }
}
