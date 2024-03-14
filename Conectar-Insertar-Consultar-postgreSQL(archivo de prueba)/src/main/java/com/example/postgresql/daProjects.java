package com.example.postgresql;

import java.sql.*;

public class daProjects {

   public  void insert(Demandante[] objDemandantes) throws SQLException{
        PostgreSQL postgreSQL = new PostgreSQL();
        //Demandante objDemandantes = new Demandante();
       // String query = String.format("INSERT INTO developer.projects(name,description) VALUES('%s','%s')",projects.getName(), projects.getDescription());
       //String  sql = "INSERT INTO developer.demandante (id_demandante, nombre, apellido, edad) VALUES('" + objDemandantes.getid() + "', '" + objDemandantes.getNombre() + "', '" + objDemandantes.getApellido() + "', '" + objDemandantes.getedad() + "')";

        try {
            Connection con = postgreSQL.connectDatabase();
            Statement stmnt = null;
            stmnt = con.createStatement();
            for(Demandante demandate : objDemandantes){
                String  sql = "INSERT INTO developer.demandante (id_demandante, nombre, apellido, edad) VALUES('" + demandate.getid() + "', '" + demandate.getNombre() + "', '" + demandate.getApellido() + "', '" + demandate.getedad() + "')";

            //stmnt.executeUpdate(query);
            stmnt.executeUpdate(sql);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    void select() {
        PostgreSQL postgreSQL = new PostgreSQL();
        String query = "SELECT * FROM developer.projects";

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
                System.out.print("project_id: " + rs.getString(4));
                System.out.print(" | ");
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
