package com;

import java.sql.*;

import com.example.postgresql.Demandante;

public class QueryBBDD {

    // metodo para realizar un incercion de datos a la base de datos (Insert)
    public void insert(Demandante[] objDemandantes) throws SQLException {
        InicioConexionPostgreSQL conectarPostgreSQL = new InicioConexionPostgreSQL();

        try {

            Connection iniciarConexion = conectarPostgreSQL.conectarBaseDatos();

            // objeto Statement(declaracion)
            Statement accion = null;
            accion = iniciarConexion.createStatement();
            for (Demandante demandate : objDemandantes) {
                String sql = "INSERT INTO developer.demandante (id_demandante, nombre, apellido, edad) VALUES('"
                        + demandate.getid() + "', '" + demandate.getNombre() + "', '" + demandate.getApellido() + "', '"
                        + demandate.getedad() + "')";

                // stmnt.executeUpdate(query);
                accion.executeUpdate(sql);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void select() {
        InicioConexionPostgreSQL conectarPostgreSQL = new InicioConexionPostgreSQL();
        String query = "SELECT * From developer.demandante ";

        try (Connection conexion = conectarPostgreSQL.conectarBaseDatos();
                PreparedStatement pst = conexion.prepareStatement(query);
                ResultSet resultSet = pst.executeQuery()) {

            while (resultSet.next()) {

                System.out.print("project_id: " + resultSet.getString(1));
                System.out.print(" | ");
                System.out.print("name: " + resultSet.getString(2));
                System.out.print(" | ");
                System.out.println("created_at: " + resultSet.getString(3));
                System.out.print(" | ");
                System.out.print("project_id: " + resultSet.getString(4));
                System.out.print(" | ");
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void update() {

    }

    public void delete() {
    }

}
