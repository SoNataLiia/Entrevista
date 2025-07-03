public class StringTransformer {
    //Declaramos una clase pública llamada StringTransformer.
    //Las clases son las unidades básiccas de código en Java.

    public static String procesar(String texto) {
        //Declaramos un método público y estático que devuelve una cadena de texto (String).
        //Este método recibe un parámetro llamado "texto" que es una cadena de texto que queremos procesar.
        //Se usa 'static' para poder llamar al método sin crear un objeto de la clase.


        String[] palabras = texto.trim().split("\\s+");
        // Paso 1: Eliminamos los espacios al principio y al final con .trim()
        // Luego usamos .split("\\s+") para dividir la cadena en palabras separadas por uno o más espacios.
        // \\s+ es una expresión regular que representa cualquier número de espacios en blanco consecutivos.

        StringBuilder sb = new StringBuilder();
        // Creamos un objeto de tipo StringBuilder llamado "sb".
        // StringBuilder se utiliza para construir cadenas de texto de forma eficiente,
        // especialmente cuando vamos a modificar o concatenar muchas veces.

        for (int i = palabras.length -1; i >=0; i--) {
            // Usamos un bucle for para recorrer las palabras desde el final hasta el principio.
            // Esto es necesario porque queremos invertir el orden de las palabras.
            // Empezamos con el índice más alto (última palabra) y vamos hacia el índice 0.

            sb.append(palabras[i].toUpperCase());
// Convertimos la palabra actual a mayúsculas con .toUpperCase()
            // Luego la añadimos al StringBuilder con .append()
        }

        return sb.toString();
        // Convertimos el contenido del StringBuilder en una cadena final con .toString()
        // y la devolvemos como resultado del método.
    }

    public static void main(String[] args) {
        // Método principal desde donde se ejecuta el programa.
        // Este método se llama automáticamente al iniciar el programa.

       String entrada = " hola  mundo desde  EDICOM";
        // Declaramos una variable de tipo String llamada "entrada"
        // y le asignamos una frase con espacios adicionales.

        System.out.println(procesar(entrada));
        // Llamamos al método "procesar" pasando la cadena de entrada como argumento.
        // El resultado se muestra por consola usando System.out.println().
        // Esperamos ver: "EDICOMDESDEMUNDOHOLA"
    }

}
