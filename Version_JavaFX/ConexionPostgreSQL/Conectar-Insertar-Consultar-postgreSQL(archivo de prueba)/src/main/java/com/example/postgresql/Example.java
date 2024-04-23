package com.example.postgresql;

import java.sql.SQLException;
//import java.util.ArrayList;
import java.util.Scanner;
//import com.example.postgresql.daProjects;

//import com.QueryBBDD;

public class Example {

    public static void main(String[] args) {
        // ********************************* */
        Scanner scanner = new Scanner(System.in);
        // int id = 0;
        System.out.print("Ingrese el número de expedientes: ");
        int numExpedientes = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese el número de demadantes: ");
        int numDemandante = Integer.parseInt(scanner.nextLine());

        Demandante[] objDemandantes = new Demandante[numDemandante];

        for (int i = 0; i < numDemandante; i++) {
            System.out.println("Ingrese la información del demandante " + (i + 1) + ":");

            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();

            System.out.print("Edad: ");
            int edad = Integer.parseInt(scanner.nextLine());

            System.out.println("Ingrese la dirección:");
            Direccion objdireccion = crearDireccionDesdeConsola(scanner);

            System.out.print("identidad: ");
            long identidad = Integer.parseInt(scanner.nextLine());

            objDemandantes[i] = new Demandante();
            objDemandantes[i].setNombre(nombre);
            objDemandantes[i].setApelido(apellido);
            objDemandantes[i].setEdad(edad);
            objDemandantes[i].setid(identidad);

            // Llamada a los métodos set de Demandante

            System.out.println(objDemandantes[0].getApellido());
        }

        // Insertar registros en PosgreSQL utilizando daProjects
        daProjects DBobjdemandates;
        DBobjdemandates = new daProjects();
        try {
            DBobjdemandates.insert(objDemandantes);

            System.out.println("Exito al insertar en la base de datos: ");

        } catch (SQLException ex) {
            System.out.println("Error al insertar en la base de datos: " + ex.getMessage());

        }

        // objDemandantes[i].obtenerDireccion();

        // objDemandantes[i] =
        // crearDemandanteDesdeConsola(scanner);//****************************** */

        // Demandante objdeamandan = new Demandante();
        // id = i;

        // objDemandantes[i].setNombre(String );

        // ******************************* */
        Projects projects = new Projects();
        projects.name = "dev-java-postgreSQL";
        projects.description = "Development environment";

        daProjects querybd = new daProjects();

        // Insertar registros en PosgreSQL
        // daProjects.insert(projects);
        // //*************************************************************************
        // */

        // Listar registros desde PosgreSQL
        querybd.select();

        System.out.println(
                "SI requiere eliminar algunos de los demandados identifique su id_demandante e ingrese  {1} para indicar que desea elimiar :  ");
        System.out.println(
                "SI requiere Actualizar algunos de los datos de demandados identifique su id_demandante e ingrese 2 para indicar que desea actualizar :  ");
        int desicion = Integer.parseInt(scanner.nextLine());
        if (desicion == 1) {
            // Solicitar al usuario el ID del demandante que desea eliminar
            System.out.print("Ingrese el ID del demandante que desea eliminar: ");
            int id_demandante_a_eliminar = Integer.parseInt(scanner.nextLine());

            // Eliminar el demandante de la base de datos
            DBobjdemandates.delete(id_demandante_a_eliminar);
        } else if (desicion == 2) {
            System.out.print("Ingrese el ID del demandante que desea actualizar: ");
            int id_demandante_a_actualizar = Integer.parseInt(scanner.nextLine());

            // Solicitar al usuario los nuevos valores para el demandante
            System.out.print("Nuevo nombre: ");
            String nuevo_nombre = scanner.nextLine();

            System.out.print("Nuevo apellido: ");
            String nuevo_apellido = scanner.nextLine();

            System.out.print("Nueva edad: ");
            int nueva_edad = Integer.parseInt(scanner.nextLine());

            // Actualizar el demandante en la base de datos
            DBobjdemandates.update(id_demandante_a_actualizar, nuevo_nombre, nuevo_apellido, nueva_edad);

        }
        querybd.select();
        scanner.close();
    }

    /*
     * private static Demandante crearDemandanteDesdeConsola(Scanner scanner) {
     * System.out.print("Nombre: ");
     * String nombre = scanner.nextLine();
     * 
     * System.out.print("Apellido: ");
     * String apellido = scanner.nextLine();
     * 
     * System.out.print("Edad: ");
     * int edad = Integer.parseInt(scanner.nextLine());
     * 
     * System.out.println("Ingrese la dirección:");
     * Direccion objdireccion = crearDireccionDesdeConsola(scanner);
     * 
     * System.out.print("identidad: ");
     * int identidad=Integer.parseInt(scanner.nextLine()) ;
     * 
     * return new Demandante(nombre, apellido, edad, objdireccion, identidad);
     * 
     * }
     */

    private static Direccion crearDireccionDesdeConsola(Scanner scanner) {
        System.out.print("Departamento: ");
        String departamento = scanner.nextLine();

        System.out.print("Municipio: ");
        String municipio = scanner.nextLine();

        System.out.print("Colonia: ");
        String colonia = scanner.nextLine();

        return new Direccion(departamento, municipio, colonia);
    }
}
