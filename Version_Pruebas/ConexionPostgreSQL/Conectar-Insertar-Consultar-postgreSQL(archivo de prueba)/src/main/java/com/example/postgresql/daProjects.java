package com.example.postgresql;

import java.sql.*;

public class daProjects {

    public void insert(Demandante[] objDemandantes) throws SQLException {
        PostgreSQL postgreSQL = new PostgreSQL();
        // Demandante objDemandantes = new Demandante();
        // String query = String.format("INSERT INTO
        // developer.projects(name,description) VALUES('%s','%s')",projects.getName(),
        // projects.getDescription());
        // String sql = "INSERT INTO developer.demandante (id_demandante, nombre,
        // apellido, edad) VALUES('" + objDemandantes.getid() + "', '" +
        // objDemandantes.getNombre() + "', '" + objDemandantes.getApellido() + "', '" +
        // objDemandantes.getedad() + "')";

        try {
            Connection con = postgreSQL.connectDatabase();
            Statement stmnt = null;
            stmnt = con.createStatement();
            for (Demandante demandate : objDemandantes) {
                String sql = "INSERT INTO developer.demandante (id_demandante, nombre, apellido, edad) VALUES('"
                        + demandate.getid() + "', '" + demandate.getNombre() + "', '" + demandate.getApellido() + "', '"
                        + demandate.getedad() + "')";

                // stmnt.executeUpdate(query);
                stmnt.executeUpdate(sql);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void select() {
        PostgreSQL postgreSQL = new PostgreSQL();
        String query = "SELECT * FROM developer.demandante";

        try (Connection con = postgreSQL.connectDatabase();
                PreparedStatement pst = con.prepareStatement(query);
                ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {

                System.out.print("project_id: " + rs.getString(1));
                System.out.print(" | ");
                System.out.print("name: " + rs.getString(2));
                System.out.print(" | ");
                System.out.println("created_at: " + rs.getString(3));
                System.out.print(" | ");
                System.out.print("project_edad " + rs.getString(4));
                System.out.print(" | ");
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void delete(int id_demandante) {
        PostgreSQL postgreSQL = new PostgreSQL();
        String query = "DELETE FROM developer.demandante WHERE id_demandante = " + id_demandante;

        try (Connection con = postgreSQL.connectDatabase();
                Statement stmnt = con.createStatement()) {
            stmnt.executeUpdate(query);
            System.out.println("Registro eliminado exitosamente.");
        } catch (SQLException ex) {
            System.out.println("Error al eliminar el registro: " + ex.getMessage());
        }
    }

    public void update(int id_demandante, String nombre, String apellido, int edad) {
        PostgreSQL postgreSQL = new PostgreSQL();
        String query = "UPDATE developer.demandante SET nombre = '" + nombre + "', apellido = '" + apellido +
                "', edad = " + edad + " WHERE id_demandante = " + id_demandante;

        try (Connection con = postgreSQL.connectDatabase();
                Statement stmnt = con.createStatement()) {
            stmnt.executeUpdate(query);
            System.out.println("Registro actualizado exitosamente.");
        } catch (SQLException ex) {
            System.out.println("Error al actualizar el registro: " + ex.getMessage());
        }
    }
}
