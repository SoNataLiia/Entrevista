public class ManipulacionDeCadenas {
    public static void main(String[] args) {

        //Limpiar una frase repetitiva
        String frase = "Esto es bla-bla-bla";
        //Reemplazamos "bla-" por cadena vacía
        String fraseLimpia = frase.replace("bla-", "");
        System.out.println("Frase limpia: " + fraseLimpia);

        //Eliminar espacios innecesarios
        String textoConEspacios = "  Hola,mundo!  ";
        //Eliminamos espacios al inicio y final
        String textoSinEspacios = textoConEspacios.trim();
        System.out.println("Texto sin espacios: " + textoSinEspacios);

        //Eliminar símbolos '/' del inicio y final
        String url = "///ejemplo.com///";
        //Usamos expresiones regulares para eliminar '/' del principio y del final
        String urlLimpia = url.replaceAll("^/+", "").replaceAll("/+$", "");
        System.out.println("Url limpia: " + urlLimpia);
    }
}
