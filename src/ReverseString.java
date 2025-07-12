import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una palabra para invertir: ");
        String palabra = sc.nextLine();
        String reversed = new StringBuilder(palabra).reverse().toString();
        System.out.println(reversed);

        sc.close();
    }
}
