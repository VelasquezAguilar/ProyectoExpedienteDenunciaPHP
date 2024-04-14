package Version_Oficial.CodigoDelitos.src.prueba2delitosconlista ;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //********************************************************************************************************************************************** */
    //********************************************************************************************************************************************** */
    //********************************************************************************************************************************************** */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       //Crearemos una condicion para que el {Actor} ingrese el dijito 1 para crear un nueevo expediente 

        
        int numExpedientes = 2;


        Demandado[] demandados = new Demandado[numExpedientes];
        Demandante[] demandantes = new Demandante[numExpedientes];
        Ofendido[] ofendidos = new Ofendido[numExpedientes];
   
        expediente[] expedientes = new expediente[numExpedientes];
        


        for (int i = 0; i < numExpedientes; i++) {
            System.out.println("Ingrese la información del demandado " + (i + 1) + ":");
            demandados[i] = crearDemandadoDesdeConsola(scanner);

           

            System.out.println("Ingrese la información del demandante " + (i + 1) + ":");
            demandantes[i] = crearDemandanteDesdeConsola(scanner);

            System.out.println("Ingrese la información del ofendido " + (i + 1) + ":");
            ofendidos[i] = crearOfendidoDesdeConsola(scanner);

            System.out.println("Ingrese la direccion donde ocurrio el delito " + (i + 1) + ":");
            System.out.println("Departamento: " );
            String departamento= scanner.nextLine();
            System.out.println("Municipio: " );
            String municipio= scanner.nextLine();
            System.out.println("colonia: " );
            String colonia= scanner.nextLine();
            System.out.println("Bloque: " );
            String bloque= scanner.nextLine();
            System.out.println("Calle: " );
            String calle= scanner.nextLine();
            System.out.println("Escriba una descripcion de lo que ocurrio: " );
            String descripcion= scanner.next();


            expedientes[i] = new expediente(demandantes[i], demandados[i],ofendidos[i],  departamento, municipio,  colonia, bloque,  calle, descripcion);
            agregarDelitosDesdeConsola(scanner, expedientes[i]);
        }


        for (int i = 0; i < numExpedientes; i++) {
            System.out.println("\nInformación del expediente " + (i + 1) + ":");
            //mostrarInformacionExpediente(expedientes[i]);
        }

        scanner.close();
    }

    //********************************************************************************************************************************************** */
    //********************************************************************************************************************************************** */
    //********************************************************************************************************************************************** */

    //metodo para instanciar el objeto demandado implmentcion de {Agregacion}
    //implementacion de {Agregacion}
    //la instnacia de direccion se realizara externo a la memoria del expediente
    private static Demandado crearDemandadoDesdeConsola(Scanner scanner) {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Edad: ");
        int edad = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese la ID:");
        String Id = scanner.nextLine();

        System.out.println("Ingrese la dirección:");
        Direccion direccion = crearDireccionDesdeConsola(scanner);


        return new Demandado(nombre, apellido, edad, Id, direccion);
    }



    private static Demandante crearDemandanteDesdeConsola(Scanner scanner) {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Edad: ");
        int edad = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese la ID:");
        String Id = scanner.nextLine();

        System.out.println("Ingrese la dirección:");
        Direccion direccion = crearDireccionDesdeConsola(scanner);
        

        return new Demandante(nombre, apellido, edad, Id, direccion);
    }


    private static Ofendido crearOfendidoDesdeConsola(Scanner scanner) {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Edad: ");
        int edad = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese la ID:");
        String Id = scanner.nextLine();

        System.out.println("Ingrese la dirección:");
        Direccion direccion = crearDireccionDesdeConsola(scanner);

        return new Ofendido(nombre, apellido, edad, Id, direccion);
    }


    private static Direccion crearDireccionDesdeConsola(Scanner scanner) {
        System.out.print("Departamento: ");
        String departamento = scanner.nextLine();

        System.out.print("Municipio: ");
        String municipio = scanner.nextLine();

        System.out.print("Colonia: ");
        String colonia = scanner.nextLine();

        System.out.print("Bloque: ");
        String bloque = scanner.nextLine();

        System.out.print("casa: ");
        String casa = scanner.nextLine();

        System.out.print("Descripcion: ");
        String descripcion = scanner.next();
        

        return new Direccion(departamento, municipio, colonia, bloque,casa, descripcion);
    }


    private static void agregarDelitosDesdeConsola(Scanner scanner,expediente expediente) {
        System.out.print("¿Cuántos delitos cometió el demandado? ");
        int numDelitos = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numDelitos; i++) {
           
            

            System.out.println("Ingrese la descripción del delito:");
            String descripcionDelito = scanner.nextLine();

            expediente.getDemandado().agregarDelito(new Delito(descripcionDelito));
        }
    }

/* 
    @SuppressWarnings("rawtypes")
    private static void mostrarInformacionExpediente(Expediente expediente) {
        System.out.println("Información del demandado:");
        System.out.println("Nombre: " + expediente.getDemandado().getNombre());
        System.out.println("Apellido: " + expediente.getDemandado().getApellido());
        System.out.println("Edad: " + expediente.getDemandado().getEdad());
        System.out.println("ID: " + expediente.getDemandado().getId());
        System.out.println("Dirección: " + expediente.getDemandado().obtenerDireccion());
        expediente.getDemandado().mostrarDelitos();

        System.out.println("\nInformación del demandante:");
        System.out.println("Nombre: " + ((Persona) expediente.getDemandante()).getNombre());
        System.out.println("Apellido: " + ((Persona) expediente.getDemandante()).getApellido());
        System.out.println("Edad: " + ((Persona) expediente.getDemandante()).getEdad());
        System.out.println("ID: " + ((Persona) expediente.getDemandante()).getId());
        System.out.println("Dirección: " + ((Persona) expediente.getDemandante()).obtenerDireccion());

        System.out.println("\nInformación del ofendido:");
        System.out.println("Nombre: " + ((Persona) expediente.getOfendido()).getNombre());
        System.out.println("Apellido: " + ((Persona) expediente.getOfendido()).getApellido());
        System.out.println("Edad: " + ((Persona) expediente.getOfendido()).getEdad());
        System.out.println("ID: " + ((Persona) expediente.getOfendido()).getId());
        System.out.println("Dirección: " + ((Persona) expediente.getOfendido()).obtenerDireccion());
    }
    */

}