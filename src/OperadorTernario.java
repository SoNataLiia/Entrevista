public class OperadorTernario {

        //sin operador ternario
        public static void saludaConIf(String nombre) {
           if(!nombre.isEmpty()){
               System.out.println("¡Hola, " + nombre + "!(con if)");

           } else {
               System.out.println("¡Hola!(con if)");
           }
        }
        // con operador ternario
        public static void saludoConTernario(String nombre) {
            String saludo = (!nombre.isEmpty()) ? "¡Hola," + nombre + "! (con ternario)." : "¡Hola!(con ternario.)";
            System.out.println(saludo);
        }
}
