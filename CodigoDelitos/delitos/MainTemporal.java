package delitos;

import java.util.Scanner;

public class MainTemporal {
    public static void main(String[] args) {

        // Creando un objeto Scanner para leer datos desde la entrada estándar (teclado)
    Scanner scanner = new Scanner(System.in);
    String descripciondelito = scanner.nextLine();
    System.out.println( descripciondelito) ;

        // Crear objetos demandante, demandado y testigo
        demandante objDemandante = new demandante();
        objDemandante.setPrimerNombre("Juan");
        
        demandado objDemandado = new demandado();
        objDemandado.setPrimerNombre("María");

        testigo objTestigo = new testigo();
        objTestigo.setPrimerNombre("Pedro");

        // Crear un expediente con los objetos creados anteriormente
        expediente miExpediente = new expediente(objDemandante, objDemandado, objTestigo);

        // Agregar más demandantes, demandados y testigos al expediente
        // utilizando los métodos de la clase expediente
        miExpediente.Agregardemandante(objDemandante);
        miExpediente.Agregardemandado(objDemandado);
        miExpediente.Agregartestigo(objTestigo);

        // Obtener el número de expediente y mostrarlo en la consola
        int numeroExpediente = miExpediente.getNumeroExpediente();
        System.out.println("Número de expediente: " + numeroExpediente);

        // Mostrar la información de los demandantes, demandados y testigos
        // en el expediente
        System.out.println("Demandantes:");
        for (demandante d : miExpediente.Lsdemate) {
            if (d != null) {
                System.out.println(d);
            }
        }

        System.out.println("Demandados:");
        for (demandado d : miExpediente.Lsdemado) {
            if (d != null) {
                System.out.println(d);
            }
        }

        System.out.println("Testigos:");
        for (testigo t : miExpediente.Lstestigo) {
            if (t != null) {
                System.out.println(t);
            }
        }
    }
}

