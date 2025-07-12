public class ReemplazarTextoURL {
    public static void main(String[] args) {
        String texto = "http://example.com";
        String seguroTexto = texto.replace("http", "https");
        System.out.println(seguroTexto);
    }
}
