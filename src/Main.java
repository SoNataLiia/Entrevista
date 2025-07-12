import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Solicita el nombre al usuario
        System.out.println("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.println();

        OperadorTernario.saludaConIf(nombre);

        OperadorTernario.saludoConTernario(nombre);
    }
}