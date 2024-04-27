package Version_Pruebas.CodigoFormatoDenuncia.delitos;

import java.sql.Connection;
   import java.sql.ResultSet;
   import java.sql.SQLException;


   class Sql {

   private Connection conn;
   private ResultSet results;

   public Sql(Connection conn) {
       this.conn = conn;
   }

   public void update(String query) {
       try {
           this.conn.prepareStatement(query).executeUpdate();
       } catch (SQLException e) {
           System.out.println(e.getMessage());
       }
   }

   public void select(String query) {
       try {
           this.results = this.conn.prepareStatement(query).executeQuery();
           getResults();
       } catch (SQLException e) {
           System.out.println(e.getMessage());
       }
   } 
}

