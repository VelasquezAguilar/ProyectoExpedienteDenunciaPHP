package Version_Pruebas.CodigoFormatoDenuncia.delitos;
//import delitos.direccion;
import java.sql.Connection;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //  **********************************************************************************
      Connect c = new Connect();
    c.setConnection("foo", "foo", "foo");
    Connection conn = c.getConnection();
    Sql sql = new Sql(conn);
    String query = <Some SQL statement>;
    sql.update(query);
    sql.select(<Some SQL statement>);
    c.closeConnection();
//*********************************************************************************************
        // Crear un objeto Scanner para leer datos desde la entrada estándar (teclado)
        Scanner scanner = new Scanner(System.in);

        String ArrayDelitos[] = new String[5];
        ArrayDelitos[0] = "Penal";
        ArrayDelitos[1] = "Constitucional";
        ArrayDelitos[2] = "Administrativo";
        ArrayDelitos[3] = "Civil";

        System.out.println ("Selecciones el tipo de delito que desea registrar: ");
        for (int index = 0; index < ArrayDelitos.length; index++) {
            int numerador = index + 1;
            System.out.println( numerador + ") " + ArrayDelitos[index]);
        }
        
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //Solicitando al usuarion que ingrese los datos del demandante 

        System.out.println("Ingrese el primer nombre:");
        String primerNombre = scanner.nextLine();

        System.out.println("Ingrese el segundo nombre:");
        String segundoNombre = scanner.nextLine();

        System.out.println("Ingrese el primer apellido:");
        String primerApellido = scanner.nextLine();

        System.out.println("Ingrese el segundo apellido:");
        String segundoApellido = scanner.nextLine();

        System.out.println("Ingrese el género (M/F):");
        char genero = scanner.next().charAt(0);

        System.out.println("Ingrese la edad:");
        int edad = scanner.nextInt();

        System.out.println("Ingrese el número de identidad:");
        String identidad = scanner.next();

         // Solicitar al usuario que ingrese los datos de la dirección
         System.out.println("Ingrese el departamento:");
         String departamento = scanner.nextLine();
 
         System.out.println("Ingrese el municipio:");
         String municipio = scanner.nextLine();

         System.out.println("Ingrese la aldea o ciudad:");
         String aldeaciudad = scanner.nextLine();

         System.out.println("Ingrese la colonia:");
         String colonia = scanner.nextLine();

         System.out.println("Ingrese el Codigo Postal:");
         String codigopostal = scanner.nextLine();
         
         System.out.println("Ingrese el Bloque y numero de casa:");
         String bloque = scanner.nextLine();

        

 
        // Crear un objeto direccion con los datos ingresados por el usuario
        direccion dirDemandante = new direccion(departamento, municipio, aldeaciudad, colonia, codigopostal,bloque );

        // creando instancias de denunciado
        demandante objDemandante = new demandante(primerNombre, segundoNombre, primerApellido, segundoApellido, genero, edad, identidad, dirDemandante) ;

         // Mostrar los datos del demandado creado
         System.out.println("Se ha creado el demandado con los siguientes datos:");
        // System.out.println(objDemandante);
         objDemandante.mostrarInformacion();
         dirDemandante.mostrardireccion();
         System.out.println("Se ha creado el demandado con los siguientes datos con get :" + objDemandante.getPrimerNombre() + " " + objDemandante.getSegundoNombre() );
         objDemandante.getPrimerNombre();
         objDemandante.getSegundoNombre();

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
       


/* 
objdemandante = new demandante();
objdemandante.setPrimerNombre("Jose");
objdemandante = null;

objdemandado = new demandado();
objdemandado.setPrimerNombre("Juana ");
objdemandado = null;

objtestigo = new testigo();
objtestigo.setPrimerNombre("Martha");
objtestigo = null;/* 
        direccion direccion = new direccion("francisco morazan","tegucigalpa", "tegucigalpa", "Carrizal", "no hay", "2b", "3198");

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
        policia1.realizarAccion();*/


         
      /*   // Pedir al usuario que introduzca el motivo de la demanda 
        System.out.println("Detalle los hechos ocurridos mediante una descripcion (ingrese su texto a continuacion):");
        String descripcionDemanda = scanner.nextLine();
        System.out.println(descripcionDemanda);*/





    // expediente objExpediente = new expediente();
     //objExpediente.Agregardemandante(objDemandante);
   scanner.close();
    }
    
}