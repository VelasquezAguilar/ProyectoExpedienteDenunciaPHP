package com.example.postgresql;

import java.sql.SQLException;
//import java.util.ArrayList;
import java.util.Scanner;
import com.example.postgresql.daProjects;


public class Example {

    public static void main(String[] args) {
        //********************************* */
                Scanner scanner = new Scanner(System.in);
                //int id = 0;
                System.out.print("Ingrese el número de expedientes: ");
                int numExpedientes = Integer.parseInt(scanner.nextLine());

                System.out.print("Ingrese el número de demadantes: ");
                int numDemandante = Integer.parseInt(scanner.nextLine());
        
                Demandante[] objDemandantes = new Demandante[10];


                for (int i=0; i< numDemandante; i++){
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
                    long  identidad=Integer.parseInt(scanner.nextLine()) ;

                     objDemandantes[i] = new Demandante();
                     objDemandantes[i].setNombre( nombre);
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
                    }catch(SQLException ex){
                        System.out.println("Error al insertar en la base de datos: " + ex.getMessage());

                    }

                   //objDemandantes[i].obtenerDireccion();

                   // objDemandantes[i] = crearDemandanteDesdeConsola(scanner);//****************************** */
                    
                   // Demandante objdeamandan = new Demandante();
                   // id = i;
                   
                   // objDemandantes[i].setNombre(String );
        
                

                
                
                scanner.close();
        //******************************* */
        Projects projects = new Projects();
        projects.name = "dev-java-postgreSQL";
        projects.description = "Development environment";

        daProjects daProjects = new daProjects();

        //Insertar registros en PosgreSQL
        //daProjects.insert(projects);  //************************************************************************* */

        //Listar registros desde PosgreSQL
        daProjects.select();
                }
            
        
           /*  private static Demandante crearDemandanteDesdeConsola(Scanner scanner) {
                System.out.print("Nombre: ");
                String nombre = scanner.nextLine();
        
                System.out.print("Apellido: ");
                String apellido = scanner.nextLine();
        
                System.out.print("Edad: ");
                int edad = Integer.parseInt(scanner.nextLine());
        
                System.out.println("Ingrese la dirección:");
                Direccion objdireccion = crearDireccionDesdeConsola(scanner);
                
                System.out.print("identidad: ");
                int  identidad=Integer.parseInt(scanner.nextLine()) ;
                
                return new Demandante(nombre, apellido, edad, objdireccion, identidad);
                
            }*/
        
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
        
        

        

