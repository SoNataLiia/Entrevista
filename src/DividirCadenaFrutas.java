public class DividirCadenaFrutas {
    public static void main(String[] args) {
        String cadena = "manzana, plátano, pera";
        String[] frutas = cadena.split(", ");
        for(String fruta : frutas) {
            System.out.println(fruta);
        }
    }
}
