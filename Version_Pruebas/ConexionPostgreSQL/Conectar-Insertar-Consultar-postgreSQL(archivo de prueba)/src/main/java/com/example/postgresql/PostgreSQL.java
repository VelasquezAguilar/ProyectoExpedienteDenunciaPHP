package com.example.postgresql;
    
     //Este archivo lo que hace es otner las credenciales para poder establecer conexion
     //con la base de datos PosgreSQL crenado la URL necesaria 
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public class PostgreSQL {

    //Esta línea de código carga un archivo de propiedades llamado "PostgreSQL.properties" y
    // almacena su contenido en un objeto ResourceBundle llamado "bundle", que luego se puede
    // utilizar en el programa para acceder a las propiedades contenidas en ese archivo
    final ResourceBundle bundle = PropertyResourceBundle.getBundle("PostgreSQL");

    //El tipo de dato Connection esta creado en el archivo "java-Conectar-Insertar-Consultar-postgreSQL.iml"
    public Connection connectDatabase() {
        Connection connection = null;

        String host = bundle.getString("host");
        String port = bundle.getString("port");
        String database = bundle.getString("database");
        String user = bundle.getString("user");
        String password = bundle.getString("password");

        connection = cnx(host, port, database, user, password);

        return connection;
    }

    private Connection cnx(String host, String port, String database,
                           String user, String password) {
        String url = "";
        try {
            // Registrar el driver de PostgresSQL
            try {
                Class.forName("org.postgresql.Driver");
            } catch (ClassNotFoundException ex) {
                System.out.println("Error al registrar el driver de PostgreSQL: " + ex);
            }

            Connection connection = null;

            //crear la url  de conexión a base de datos
            url = "jdbc:postgresql://" + host + ":" + port + "/" + database;

            // Conectar con la base de datos de PostgreSQL
            connection = DriverManager.getConnection(url, user, password);
            boolean valid = connection.isValid(50000);
            //Si "Valid es true imprimira Success/Exito, de lo contraio imprimira Fail/Fracaso"
            System.out.println(valid ? "Success " : "Fail");
            System.out.println("Exito al conectar con la base de datos de PostgreSQL (" + url + "): ");
            return connection;

        } catch (java.sql.SQLException ex) {
            System.out.println("Error al conectar con la base de datos de PostgreSQL (" + url + "): " + ex);
        }
        return null;
    }
}
