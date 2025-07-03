import java.util.Scanner;
// Importamos la clase Scanner del paquete java.util para poder leer datos desde el teclado.

public class StringManipulator {
    // Declaramos una clase pública llamada StringManipulator.
    // Toda la lógica del programa estará dentro de esta clase.

    public static void main(String[] args) {
        // Método principal desde donde se inicia la ejecución del programa.

        Scanner sc = new Scanner(System.in);
        // Creamos un objeto Scanner llamado "sc" que servirá para leer la entrada del usuario desde la consola.

        System.out.println("Introduce una cadena:");
        // Mostramos un mensaje por pantalla para pedir al usuario que introduzca una cadena de texto.

        String input = sc.nextLine();
        // Leemos la línea completa que ha introducido el usuario y la almacenamos en la variable "input".

        // Удаляем пробелы
        String noSpaces = input.replaceAll(" ", "");
        // Reemplazamos todos los espacios (" ") en la cadena por nada ("").
        // Esto elimina todos los espacios usando el método .replaceAll()

        // Переворачиваем строку
        String reversed = new StringBuilder(noSpaces).reverse().toString();
        // Creamos un objeto StringBuilder con la cadena sin espacios.
        // Luego usamos .reverse() para invertir el orden de los caracteres.
        // Finalmente usamos .toString() para convertirlo de nuevo a una cadena normal.

        // Переводим в верхний регистр
        String result = reversed.toUpperCase();
        // Convertimos la cadena invertida a mayúsculas usando el método .toUpperCase()

        System.out.println("Resultado: " + result);
        // Mostramos el resultado final por consola.
    }
}

