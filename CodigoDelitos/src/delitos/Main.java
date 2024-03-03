package delitos;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de las diferentes personas
        persona demandante1 = new demandante( "marco", "antonio", "funez", "perez", (char) 0, 23);
        persona demandado1 = new demandado ("pedro", "jose", "calix", "soler", (char) 0, 45);
        persona testigo1 = new testigo("juan", "sebastian", "caceres", "garay", (char) 0, 60);
        persona policia1 = new policia("lucas", "joel", "gomez", "suarez", (char) 0, 46);
        
        direccion direcciontestigo = new direccion("francisco morazan","tegucigalpa", "tegucigalpa", "Carrizal", "no hay", "2b", "3198");

        // Mostrar información y realizar acciones de cada persona
        System.out.println("Información del demandante:");
        demandante1.mostrarInformacion();
        demandante1.realizarAccion();

        System.out.println("\nInformación del demandado:");
        demandado1.mostrarInformacion();
        demandado1.realizarAccion();

        System.out.println("\nInformación del testigo:");
        testigo1.mostrarInformacion();
       testigo1.getDireccion();
        testigo1.realizarAccion();

        System.out.println("\nInformación del policía:");
        policia1.mostrarInformacion();
        policia1.realizarAccion();
    }
}