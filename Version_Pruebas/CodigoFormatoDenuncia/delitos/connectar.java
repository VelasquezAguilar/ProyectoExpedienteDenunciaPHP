package delitos;

    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;
    import java.util.Properties;

    public class connectar {

        private Connection conn;
        String baseDatos;
        String user;
        String password;

        public connectar(){
        }

        public void setConeccion(String baseDatos, String user, String password){
            String format = String.format("jdbc:postgresql://localhost:5432/", baseDatos);
            Properties propi = new Properties();
            propi.put("user", user);
            propi.put("password", password);
            try {
                this.conn = DriverManager.getConnection(format, propi);
                this.conn.setAutoCommit(true);
            } catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }

        public Connection getConeccion(){
            return this.conn;
         }

        public void closeConeccion() {
            try {
                this.conn.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
