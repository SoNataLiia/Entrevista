public class ContarPalabra {
    public static void main(String[] args) {


        //Frase original
        String frase = "hola mundo hola hola mundo";


        //Palabra que queremos contar
        String palabraObjetivo = "hola";


        //Dividimos la frase por espacios
        String[] palabras = frase.split(" ");


        //Contar de ocurrencias
        int contador = 0;


        //Recorremos cada palabra
        for (String palabra : palabras) {

            //Comparamos palabra por palabra con la palabra objetivo
            if (palabra.equals(palabraObjetivo)) {
                contador++;
            }
        }


        //Mostramos el resultado
        System.out.println("La palabra \"" + palabraObjetivo + "\" aparece " + contador + " veces.");
    }
}
