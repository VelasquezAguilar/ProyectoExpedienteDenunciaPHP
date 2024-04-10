package Version_Oficial.CodigoDelitos.src.prueba2delitosconlista.ConexionPostgreSQL;


import java.sql.*;

import Version_Pruebas.CodigoFormatoDenuncia.delitos.connectar;

public class QueryBBDD {

    //metodo para realizar un incercion de datos a la base de datos (Insert)
    public void insert(){
          InicioConexionPostgreSQL conectarPostgreSQL = new InicioConexionPostgreSQL();

          try{

            Connection iniciarConexion = conectarPostgreSQL.conectarBaseDatos();
            
            //objeto Statement(declaracion) 
            Statement accion = null;
            accion = iniciarConexion.createStatement();
            for(Demandante demandate : objDemandantes){
                String  sql = "INSERT INTO developer.demandante (id_demandante, nombre, apellido, edad) VALUES('" + demandate.getid() + "', '" + demandate.getNombre() + "', '" + demandate.getApellido() + "', '" + demandate.getedad() + "')";

            //stmnt.executeUpdate(query);
            accion.executeUpdate(sql);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
