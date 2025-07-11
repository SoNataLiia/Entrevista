import java.util.Scanner;

public class ContarElNumeroDeVocales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase para contar las vocales:\n");
        String frase = sc.nextLine();
        String lower = frase.toLowerCase();
        int count =0;
        System.out.println(lower);
        for (int i = 0; i < frase.length(); i++){

           char ch = frase.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
             count ++;

            }
        }
        System.out.println("La frase contiene " + count + " vocales.");

        sc.close();
    }
}
