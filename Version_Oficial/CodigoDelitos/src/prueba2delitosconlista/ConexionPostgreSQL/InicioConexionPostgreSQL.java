package Version_Oficial.CodigoDelitos.src.prueba2delitosconlista.ConexionPostgreSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public class InicioConexionPostgreSQL {

    //Esta línea de código carga un archivo de propiedades llamado "PostgreSQL.properties" y
    // almacena su contenido en un objeto ResourceBundle llamado "bundle", que luego se puede
    // utilizar en el programa para acceder a las propiedades contenidas en ese archivo
    final ResourceBundle paqueteDeRecursos = PropertyResourceBundle.getBundle("CredencialesPostgreSQL");
    
    //El tipo de dato Connection, viene importado de la libreria  java.sql.Connection
    public Connection conectarBaseDatos() {
        Connection conexion = null;

        String host = paqueteDeRecursos.getString("host");
        String port = paqueteDeRecursos.getString("port");
        String database = paqueteDeRecursos.getString("database");
        String user = paqueteDeRecursos.getString("user");
        String password = paqueteDeRecursos.getString("password");

        conexion = coneccion(host, port, database, user, password);

        return conexion;
    }


    private Connection coneccion(String host, String port, String database, String user, String password){
        String url="";
        try{
            //registrar el driver de PostgreSQL 
            try{
                Class.forName("org.postgresql.Driver");
            }catch (ClassNotFoundException e) {
                System.out.println("A ocurrido un error al registrar el driver de 'PostgreSQL': "+ e);
            }

            Connection conexion = null; 

            //crear la url de coneccion a la base de datos 
            url = "jdbc:postgresql://" + host + ":" + port + "/" + database;

            //conectar a la base de datos de PostgreSQL
            conexion= DriverManager.getConnection(url,user,password);
            boolean validarConexion = conexion.isValid(50000);

            //Si "Valid es true imprimira Success/Exito, de lo contraio imprimira Fail/Fracaso"
            System.out.println(validarConexion ? "Exito":"fracaso");
            System.out.println("Exito al conectar con la base de datos de PostgreSQL (" + url + "): ");

            return conexion;

        }catch (java.sql.SQLException ex){
            System.out.println("Error al intentar conectar con la base de datos de PostgreSQL---(buscar en InicioConexionPostgreSQl este mensaje)---- (" + url + "): " + ex);
        }
        
        return null;
    }
    
}



